package entity;

import java.util.ArrayList;

public class HouseHole {
    private static int autoId;
    private int id;
    private String address;
    private ArrayList<Member> members;

    public HouseHole() {
    }

    public HouseHole(String address, ArrayList<Member> members) {
        this.id = ++autoId;
        this.address = address;
        this.members = members;
    }

    @Override
    public String toString() {
        return "HouseHole{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", members=" + members +
                '}';
    }
}
