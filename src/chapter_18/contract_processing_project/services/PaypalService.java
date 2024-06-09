package chapter_18.contract_processing_project.services;

public class PaypalService implements OnlinePaymentService {
    @Override
    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * (0.01 * months);
    }
}
