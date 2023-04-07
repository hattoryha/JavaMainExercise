package entity;

public class Student {
    private static int autoId;
    private int id;
    private double scoreChemistry, scorePhysic ;
    private double scoreMath;

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public Student(double scoreChemistry, double scorePhysic, double scoreMath) {
        this.id = ++autoId;
        this.scoreChemistry = scoreChemistry;
        this.scorePhysic = scorePhysic;
        this.scoreMath= scoreMath;
    }

    public Student() {
        this.id = ++autoId;
    }

    public int getId() {
        return id;
    }

}
