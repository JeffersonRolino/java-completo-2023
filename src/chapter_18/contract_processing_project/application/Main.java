package chapter_18.contract_processing_project.application;

import chapter_18.contract_processing_project.entities.Contract;
import chapter_18.contract_processing_project.entities.Installment;
import chapter_18.contract_processing_project.services.ContractService;
import chapter_18.contract_processing_project.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        PaypalService paypalService = new PaypalService();
        ContractService contractService = new ContractService(paypalService);


        System.out.println("Entre os dados do contrato: ");
        System.out.print("Número: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);
        System.out.print("Valor do contrato: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Entre com o número de parcelas: ");
        int numberOfInstallments = scanner.nextInt();
        scanner.nextLine();

        Contract contract = new Contract(number, date, amount);
        contractService.processContract(contract, numberOfInstallments);

        System.out.println("\nParcelas:");
        for(Installment installment : contract.getInstallments()){
            System.out.printf("%s - %.2f%n", dateTimeFormatter.format(installment.getDueDate()), installment.getAmount());
        }

        scanner.close();
    }
}
