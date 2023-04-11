package entity;

public class Member {
    private String name;
    private String dob;
    private String job;

    public Member(String name, String dob, String job) {
        this.name = name;
        this.dob = dob;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
