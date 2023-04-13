package view;

import entity.Worker;
import handle.WorkerHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void showMenu(Scanner scanner, ArrayList<Worker> workers){
        System.out.println("===== Worker management =====");
        System.out.println("1- Create a worker");
        System.out.println("2- Up salary");
        System.out.println("3- Down salary");
        System.out.println("4- Display infomation");
        System.out.println("Please choose!");

        selectMenu(scanner, workers);
    }

    private void selectMenu(Scanner scanner, ArrayList<Worker> workers){
        int option = Integer.parseInt(scanner.nextLine());
        WorkerHandle handle = new WorkerHandle();
        switch (option){
            case 1:
                Worker worker = handle.createWorker(scanner);
                workers.add(worker);
                break;
            case 2:
                Worker workerUp = handle.findById(scanner, workers);
                System.out.println("Mời b nhập lương muốn tăng");
                double salary = Double.parseDouble(scanner.nextLine());
                workerUp.setStatus("Up");
                handle.updateSalary(workerUp, salary);
                break;
            case 3:
                Worker workerDown = handle.findById(scanner, workers);
                System.out.println("Mời b nhập lương muốn giảm");
                double salaryDown = Double.parseDouble(scanner.nextLine());
                handle.updateSalary(workerDown, -salaryDown);
                break;
            case 4:
                break;
        }
    }
}
