package entity;

public class Follower extends Person{
    private static int autoId;
    private int id;

    private int numberOfLike;

    public Follower(String name, String email,int numberOfLike) {
        super(name, email);
        this.id = ++autoId;
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "id=" + id +
                ", name='" + super.getName() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
