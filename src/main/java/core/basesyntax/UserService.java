package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {
    public int getUserScore(String[] records, String email) {
        for (String record : records) {
            String [] arr = record.split(":");
            if (email.equals(arr[0])) {
                return Integer.parseInt((arr[1]));
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
