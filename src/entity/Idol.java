package entity;

import java.util.ArrayList;

public class Idol extends Person{
    private int id;
    private static int autoId;

    private String group;
    private ArrayList<Follower> followers;

    public Idol(String name, String email, String group, ArrayList<Follower> followers) {
        super(name, email);
        this.id = ++autoId;
        this.group = group;
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "id=" + id +
                ", group='" + group + '\'' +
                ", followers=" + followers +
                '}';
    }
}
