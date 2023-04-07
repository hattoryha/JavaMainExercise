import entity.Student;
import handle.StudentHandle;
import view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.selectType(scanner);

        System.out.println("Mời b nhập số lượng student muốn tạo: ");
        int n = Integer.parseInt(scanner.nextLine());
        Student[] students = new Student[n];
        StudentHandle studentHandle = new StudentHandle();

        for (int i = 0; i < n; i++) {
            Student student = studentHandle.createStudent(scanner, i);
            // Lưu student vào trong array
            students[i] = student;
        }

        System.out.println("Điểm tb là: "+studentHandle.getAVGScore(students[0]));
    }
}
