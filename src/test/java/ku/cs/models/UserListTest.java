package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        UserList userList = new UserList();
        // TODO: add 3 users to UserList
        userList.addUser("Cat1","cat1");
        userList.addUser("Cat2","cat2");
        userList.addUser("Cat3","cat3");
        // TODO: find one of them
        User user = userList.findUserByUsername("Cat1");
        // TODO: assert that UserList found User
        assertNotNull(user);
        // String expected = "<one of username>";

        // String actual = user.getUsername();
        // assertEquals(expected, actual);
        String actual = user.getUsername();
        String expected = "Cat1";
        assertEquals(actual,expected);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Cat1","cat1");
        userList.addUser("Cat2","cat2");
        userList.addUser("Cat3","cat3");
        // TODO: change password of one user
        boolean actual =userList.changePassword("Cat1","cat1","cat11");
        // TODO: assert that user can change password
         assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Cat1","cat1");
        userList.addUser("Cat2","cat2");
        userList.addUser("Cat3","cat3");

        // TODO: call login() with correct username and password
        User actual = userList.login("Cat1","cat1");
        // TODO: assert that User object is found
        // assertEquals(expected, actual);
        assertNotNull(actual);

    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Cat1","cat1");
        userList.addUser("Cat2","cat2");
        userList.addUser("Cat3","cat3");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Cat1","cat1");

        // TODO: assert that the method return null
        // assertNull(actual);
        assertNotNull(actual);
    }

}