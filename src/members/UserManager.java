package members;

import java.util.Dictionary;

public class UserManager {
    private Dictionary <String, String> usernameToPasswordMap;

    /**
     * Adds a new user.
     * @param username The new username
     * @param password password
     * @return True if user was added and false if not
     */
    public boolean addUser(String username, String password) {
        if (usernameToPasswordMap.get(username) == null) {
            usernameToPasswordMap.put(username, password);
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param username the username
     * @param password the password associated with the username
     * @return True if the username matches the password and false otherwise
     */
    public boolean verify(String username, String password) {
        if (usernameToPasswordMap.get(username) == password) {
            return true;
        } else {
            return false;
        }
    }
}
