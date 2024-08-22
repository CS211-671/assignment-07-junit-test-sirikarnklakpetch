package ku.cs.models;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        UserList userLs = new UserList();
        userLs.addUser("user01", "plain-p@ssw0rd1");
        userLs.addUser("user02", "plain-p@ssw0rd2");
        userLs.addUser("user03", "plain-p@ssw0rd3");

        // TODO: find one of them
        User findUser = userLs.findUserByUsername("user02");

        // TODO: assert that UserList found User
         String expected = "user02";
         String actual = findUser.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userLs = new UserList();
        userLs.addUser("user01", "plain-p@ssw0rd1");
        userLs.addUser("user02", "plain-p@ssw0rd2");
        userLs.addUser("user03", "plain-p@ssw0rd3");
        // TODO: change password of one user

       boolean actual = userLs.changePassword("user01","plain-p@ssw0rd1","new-p@ssw0rd2");

        // TODO: assert that user can change password

        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userLs = new UserList();
        userLs.addUser("user01", "plain-p@ssw0rd1");
        userLs.addUser("user02", "plain-p@ssw0rd2");
        userLs.addUser("user03", "plain-p@ssw0rd3");
        // TODO: call login() with correct username and password
        User actual = userLs.login("user01", "plain-p@ssw0rd1");
        // TODO: assert that User object is found
//        User expected = new User("user01", "plain-p@ssw0rd1");
        assertNotNull(actual);

    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userLs = new UserList();
        userLs.addUser("user01", "plain-p@ssw0rd1");
        userLs.addUser("user02", "plain-p@ssw0rd2");
        userLs.addUser("user03", "plain-p@ssw0rd3");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userLs.login("user01", "wrong-p@ssw0rd1");
        // TODO: assert that the method return null
         assertNull(actual);
    }



    }

