package web.service;

/**
 * Business logic to handle login functions.
 * 
 * @author Ahsan.
 */
public class LoginService {

    /**
     * Static method returns true for successful login, false otherwise.
     * 
     * @param username
     * @param password
     * @param dob
     * @return true for successful login, false otherwise.
     */
    public static boolean login(String username, String password, String dob) {
        // Check if any parameter is null

        // Match a fixed user name and password.
        if ("ahsan".equals(username) && "ahsan_pass".equals(password) && "1990-01-01".equals(dob)) {
            return true;
        }
        return false;
    }
}
