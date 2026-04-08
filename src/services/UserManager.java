package services;

import java.util.Dictionary;
import java.util.Hashtable;

public class UserManager {
    private static final Dictionary<String, String> usernameToPasswordMap = new Hashtable<>();

    /**
     * Adds a new user.
     * @param username The new username
     * @param password password
     * @return True if user was added and false if not
     */
    public static boolean addUser(String username, String password) {
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
    public static boolean verify(String username, String password) {
        if (usernameToPasswordMap.get(username).equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
