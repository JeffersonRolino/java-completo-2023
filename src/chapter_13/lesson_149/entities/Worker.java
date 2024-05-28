package chapter_13.lesson_149.entities;

import chapter_13.lesson_149.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    //Associações
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();


    //***********************************************************************************************
    // CONSTRUCTORS
    //***********************************************************************************************

    public Worker(){}

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }


    //***********************************************************************************************
    // GETTERS AND SETTERS
    //***********************************************************************************************

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }


    //***********************************************************************************************
    // METHODS
    //***********************************************************************************************

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;

        for (HourContract contract : contracts){
            int contractYear = contract.getDate().getYear();
            int contractMonth = contract.getDate().getMonthValue();

            if(contractYear == year && contractMonth == month){
                sum += contract.totalValue();
            }
        }
        return sum;
    }
}
