package core.basesyntax;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserStorageTest {
    private static final String[] basicRecords = {"john@gmail.com:78", "rick@yahoo.com:99",
        "greg@gmail.com:20", "russell@mail.us:141", "jerry@mail.us:0", "mortimer@mail.us:53"};
    private static final String[] EMPTY_ARRAY = {};
    private static final String[] singleElementArray = {"carl@mail.com:30"};
    private static final String EXCEPTION_CLASS = "core.basesyntax.exception.UserNotFoundException";
    private static UserStorage userStorage;

    @BeforeClass
    public static void init() {
        userStorage = new UserStorage();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void getUserScore_exceptionExpected() {
        try {
            Class<?> exceptionClass = Class
                .forName(EXCEPTION_CLASS);
            expectedEx.expect((Class<? extends RuntimeException>) exceptionClass);
            expectedEx.expectMessage("User with given email doesn't exist");
            userStorage.getUserScore(EMPTY_ARRAY, "vincent@mail.us");
        } catch (ClassNotFoundException e) {
            Assert.fail("Should create a class called 'UserNotFoundException'.");
        }
    }

    @Test
    public void getUserScore_validCase() {
        Assert.assertEquals("Wrong score for user with email mortimer@mail.us",
            53, userStorage.getUserScore(basicRecords, "mortimer@mail.us"));
        Assert.assertEquals("Wrong score for user with email rick@yahoo.com",
            99, userStorage.getUserScore(basicRecords, "rick@yahoo.com"));
        Assert.assertEquals("Wrong score for user with email greg@gmail.com",
            20, userStorage.getUserScore(basicRecords, "greg@gmail.com"));
    }

    @Test
    public void exceptionClassExists() {
        try {
            Class.forName(EXCEPTION_CLASS);
        } catch (ClassNotFoundException e) {
            Assert.fail("You should create class called 'UserNotFoundException' inside of exception package");
        }
    }

    @Test
    public void getUserScore_wrongEmailFormatInput() {
        try {
            Class<?> exceptionClass = Class
                .forName(EXCEPTION_CLASS);
            expectedEx.expect((Class<? extends RuntimeException>) exceptionClass);
            expectedEx.expectMessage("User with given email doesn't exist");
            userStorage.getUserScore(singleElementArray, "carl@mail.com:30");
        } catch (ClassNotFoundException e) {
            Assert.fail("Should throw exception whenever user with given email doesn't exist");
        }
    }

}
