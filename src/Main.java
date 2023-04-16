import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String truePassword = "1234";
        int choice=0;
        do{
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            if(password.equals(truePassword)){
                System.out.println("chuc mung");;
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
                        System.out.println("vao menu tim lai mk");;
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
        } while (choice!=2);
    }
    }

