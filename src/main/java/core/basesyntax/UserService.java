package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        String getRecods = "";
        for (String record : records) {
            if (email.equals(record.split(":")[0])) {
                getRecods = record;
            }
        }
        if (getRecods.equals("")) {
            throw new UserNotFoundException("User with given email doesn't exist");
        }
        return Integer.parseInt(getRecods.substring(getRecods.indexOf(':') + 1));
    }
}
