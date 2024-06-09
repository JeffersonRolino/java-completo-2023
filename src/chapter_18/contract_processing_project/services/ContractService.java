package chapter_18.contract_processing_project.services;

import chapter_18.contract_processing_project.entities.Contract;
import chapter_18.contract_processing_project.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private final OnlinePaymentService onlinePaymentService;

    //************************************************************************
    // CONSTRUCTORS
    //************************************************************************
    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    //************************************************************************
    // METHODS
    //************************************************************************
    public void processContract(Contract contract, Integer months){
        double baseValue = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate date = contract.getDate().plusMonths(i);

            Double interest = onlinePaymentService.interest(baseValue, i);
            Double valueWithInterest = baseValue + interest;

            Double tax = onlinePaymentService.paymentFee(valueWithInterest);
            Double finalValue = valueWithInterest + tax;

            Installment installment = new Installment(date, finalValue);

            contract.addInstallment(installment);
        }

    }
}
