package chapter_18.lesson_236.services;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService {
    private final double interestRate;

    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
