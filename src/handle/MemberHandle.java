package handle;

import entity.Member;

import java.util.Scanner;

public class MemberHandle {

    public Member inputMember(Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập DOB: ");
        String dob = scanner.nextLine();
        System.out.println("Mời b nhập job: ");
        String job = scanner.nextLine();
        return new Member(name, dob, job);
    }
}
