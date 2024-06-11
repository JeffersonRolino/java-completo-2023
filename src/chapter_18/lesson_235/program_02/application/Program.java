package chapter_18.lesson_235.program_02.application;

import chapter_18.lesson_235.program_02.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Employee> employes = new ArrayList<>();
        String path = "C:\\temp\\employees.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String employeeCSV = bufferedReader.readLine();
            while (employeeCSV != null) {
                String[] fields = employeeCSV.split(",");
                String name = fields[0];
                Double salary = Double.parseDouble(fields[1]);

                employes.add(new Employee(name, salary));
                employeeCSV = bufferedReader.readLine();
            }

            Collections.sort(employes);
            for (Employee employee : employes) {
                System.out.println(employee);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
