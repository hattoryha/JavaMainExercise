package entity;

import java.util.ArrayList;

public class AllUser {
    private ArrayList<User> users;

    public AllUser(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
