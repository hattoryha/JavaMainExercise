package handle;

import entity.Follower;

import java.util.Scanner;

public class FollowerHandle {
    public Follower inputFollower(Scanner scanner) {
        System.out.println("Mời b nhập tên follower: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập email follower: ");
        String email = scanner.nextLine();
        System.out.println("Mời b nhập numberOfLike follower: ");
        int numberOfLike = Integer.parseInt(scanner.nextLine());
        return new Follower(name, email, numberOfLike);

    }
}
