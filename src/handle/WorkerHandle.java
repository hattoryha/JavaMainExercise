package handle;

import entity.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerHandle {
    // create a worker
    public Worker createWorker(Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập lương: ");
        double salary = Double.parseDouble(scanner.nextLine());
        return new Worker(name, salary);
    }

    public Worker findById(Scanner scanner, ArrayList<Worker>workers){
        System.out.println("Mời b nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Worker worker: workers) {
            if(worker.getId() == id) return worker;
        }
        return null;
    }

    public void updateSalary(Worker worker, double salary){
        if(worker == null) System.out.println("Không có worker nào để update đâu");
        else {
            worker.setSalary(worker.getSalary()+salary);
        }
    }
}
