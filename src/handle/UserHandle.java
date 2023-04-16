package handle;

import entity.AllUser;
import entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserHandle {
    public User createUser(Scanner scanner, AllUser allUser){
        List<String> usernames = new ArrayList<>();
        List<String> emails = new ArrayList<>();
        for (User user:
             allUser.getUsers()) {
            usernames.add(user.getUsername());
        }
        for (User user:
                allUser.getUsers()) {
            emails.add(user.getEmail());
        }
        String username;
        do {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            if (usernames.contains(username)) {
                System.out.println("Username already exists");
            } else break;
        } while (true);
        String email;
        do {
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            if (!isValidEmail(email)) {
                System.out.println("Invalid email format");
                continue;
            }
            if (emails.contains(email)) {
                System.out.println("Email already exists");
            } else break;
        } while (true);
        String password;
        do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            if (!isValidPassword(password)) {
                System.out.println("Invalid password format");
            }else break;
        } while (true);

        return new User(username, password, email);
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[.,-_;])(?=.*[a-z]).{7,15}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
