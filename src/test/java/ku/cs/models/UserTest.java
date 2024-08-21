package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(actual,unexpected);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    void testIsUsername() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.isUsername("user01");
        assertTrue(actual);
    }

    @Test
    void testSetPassword() {
        User user = new User("user01", "plain-p@ssw0rd");
        user.setPassword("cat");
        boolean expected = user.validatePassword("cat");
        assertTrue(expected);
    }

    @Test
    void validatePassword() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    void getUsername() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getUsername();
        String expected = "user01";
        assertEquals(expected, actual);
    }

    @Test
    void getPassword() {
        User user = new User("user01", "plain-p@ssw0rd");
        String expected = "plain-p@ssw0rd";
        boolean actual = user.validatePassword(expected);
        assertTrue(actual);
    }
}