package handle;

import entity.Student;

import java.util.Scanner;

public class StudentHandle {
    public Student createStudent(Scanner scanner, int i){
        System.out.println("Mời b nhập điểm toán student thứ "+(i+1));
        double scoreMath  = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm lý: ");
        double scorePhysic= Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm hóa: ");
        double scoreChemistry= Double.parseDouble(scanner.nextLine());
        Student student = new Student(scoreMath, scorePhysic, scoreChemistry);
        return student;
    }

    public void displayAllStudents(Student[] students){
        for (Student st: students) {
            System.out.println(st.toString());
        }
    }

    public double getAVGScore(Student student){
        return (student.getScoreMath()+ student.getScoreChemistry() + student.getScorePhysic())/3;
    }


    public String classify(double scoreAvg){
        // TODO

        return "";
    }

}
