package view;

import entity.AllUser;
import entity.User;
import entity.Worker;
import handle.UserHandle;
import handle.WorkerHandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void showMenu(Scanner scanner, AllUser allUser){
        System.out.println("Welcome to Login System");
        System.out.println("1 - Login");
        System.out.println("2 - Register");

        // Nhập lựa chọn từ người dùng
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự thừa

        switch (choice) {
            case 1:
                login(scanner,allUser);
                break;
            case 2:
                UserHandle userHandle = new UserHandle();
                allUser.getUsers().add(userHandle.createUser(scanner,allUser));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }
    public static void login(Scanner scanner,AllUser allUser) {
        List<String> usernames = new ArrayList<>();
        for (User user:
                allUser.getUsers()) {
            usernames.add(user.getUsername());
        }

        String username;
        do {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            if (!usernames.contains(username)) {
                System.out.println("Invalid username, enter username again");
            } else break;
        } while (true);

        String truePassword = null;
        for (User user: allUser.getUsers()
        ) {
            if(user.getUsername().equals(username)){
                truePassword = user.getPassword();
            }
        }
        int choice=0;
        do{
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            if(password.equals(truePassword)){
                welcomeMenu();
            }else {
                System.out.println("Wrong password");
                System.out.println("1 - retype password");
                System.out.println("2 - forgot password");

                // Nhập lựa chọn từ người dùng
                System.out.print("Your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Đọc bỏ ký tự thừa

                switch (choice) {
                    case 1:
                        continue;
                    case 2:
                        forgotPasswordMenu(scanner,allUser);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
        } while (choice!=2);

    }
    public static void forgotPasswordMenu(Scanner scanner,AllUser allUser){
        do {
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            for (User user:
                    allUser.getUsers()) {
                if (user.getEmail().equals(email)){
                    System.out.println("Insert new password");
                    String newPassword = scanner.nextLine();
                    user.setPassword(newPassword);
                } else System.out.println("email does not exists, try to enter your email again");
            }

        } while (true);
    }

//
//    public void showMenu1(Scanner scanner, ArrayList<Worker> workers){
//        System.out.println("===== Worker management =====");
//        System.out.println("1- Create a worker");
//        System.out.println("2- Up salary");
//        System.out.println("3- Down salary");
//        System.out.println("4- Display infomation");
//        System.out.println("Please choose!");
//
//        selectMenu(scanner, workers);
//    }
//
//    private void selectMenu(Scanner scanner, ArrayList<Worker> workers){
//        int option = Integer.parseInt(scanner.nextLine());
//        WorkerHandle handle = new WorkerHandle();
//        switch (option){
//            case 1:
//                Worker worker = handle.createWorker(scanner);
//                workers.add(worker);
//                break;
//            case 2:
//                Worker workerUp = handle.findById(scanner, workers);
//                System.out.println("Mời b nhập lương muốn tăng");
//                double salary = Double.parseDouble(scanner.nextLine());
//                workerUp.setStatus("Up");
//                handle.updateSalary(workerUp, salary);
//                break;
//            case 3:
//                Worker workerDown = handle.findById(scanner, workers);
//                System.out.println("Mời b nhập lương muốn giảm");
//                double salaryDown = Double.parseDouble(scanner.nextLine());
//                handle.updateSalary(workerDown, -salaryDown);
//                break;
//            case 4:
//                break;
//        }
//    }
}
