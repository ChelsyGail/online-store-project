package services;

import models.User;
import models.UserType;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class UserManager {
    private static final Map<String, User> users = new HashMap<>();


    /**
     * Adds a new user.
     *
     * @param username The new username
     * @param password password
     * @param userType Admin or customer
     * @return True if user was added and false if not
     */
    public static boolean addUser(String username, String password, UserType userType) {
        if (users.containsKey(username)) return false;
        users.put(username, new User(username, password, userType));
        return true;
    }

    public static User login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}

