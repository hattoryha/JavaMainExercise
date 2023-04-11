package handle;

import entity.Follower;
import entity.Idol;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolHandle {
    public Idol inputIdol(Scanner scanner){
        System.out.println("Mời b nhập tên idol:");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập email idol:");
        String email = scanner.nextLine();
        System.out.println("Mời b nhập group idol:");
        String group = scanner.nextLine();

        System.out.println("B muốn tạo ra bao nhiêu followers?");
        int n = Integer.parseInt(scanner.nextLine());
        FollowerHandle followerHandle = new FollowerHandle();

        ArrayList<Follower> followers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Follower follower =  followerHandle.inputFollower(scanner);
            followers.add(follower);
        }
        return new Idol(name, email, group, followers);
    }
}
