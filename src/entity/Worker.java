package entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Worker {
    private static int autoId;
    private int id;
    private String name;
    private double salary;
    private String status;
    private ArrayList<SalaryHistory> histories;


    public Worker(String name, double salary) {
        this.id = ++autoId;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", status='" + status + '\'' +
                ", histories=" + histories +
                '}';
    }
}
