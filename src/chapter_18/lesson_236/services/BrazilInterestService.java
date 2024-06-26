package chapter_18.lesson_236.services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {
    private final double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
