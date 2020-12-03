package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) throws UserNotFoundException {
        if (!isExit(records, email)) {
            throw new UserNotFoundException("User with given email doesn't exist");
        }
        return getRecords(records, email);
    }

    private boolean isExit(String[] records, String email) {
        for (String record : records) {
            if (email.equals(record.split(":")[0])) {
                return true;
            }
        }
        return false;
    }

    private int getRecords(String[] records, String email) {
        String getRecods = "";
        for (String record : records) {
            if (email.equals(record.split(":")[0])) {
                getRecods = record;
                break;
            }
        }
        return Integer.parseInt(getRecods.substring(getRecods.indexOf(':') + 1));
    }
}
