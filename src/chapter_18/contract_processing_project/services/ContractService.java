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
            LocalDate date = contract.getDate().plusDays((long)i * 30);
            Double amount = baseValue + (i * onlinePaymentService.paymentFee(baseValue));
            amount += onlinePaymentService.interest(amount, i);

            Installment installment = new Installment(date, amount);

            contract.addInstallment(installment);
        }

    }
}
