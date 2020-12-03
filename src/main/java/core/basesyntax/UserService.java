package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {
    public int getUserScore(String[] records, String email) {
        for (String record : records) {
            if (email.equals(record.split(":")[0])) {

                return Integer.parseInt(record.substring(record.indexOf(':') + 1));
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
