package chapter_14.lesson_166_exercise.entities;

public class NaturalPerson extends Person {
    private double healthExpenses;


    //*********************************************************************
    // CONSTRUCTORS
    //*********************************************************************
    public NaturalPerson() {
    }

    public NaturalPerson(String name, Double annualIncome, double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }


    //*********************************************************************
    // GETTERS AND SETTERS
    //*********************************************************************
    public double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }


    //*********************************************************************
    // METHODS
    //*********************************************************************
    @Override
    public double calculateTax() {
        double tax = 0.0;
        if(this.getAnnualIncome() < 20000.00){
            tax = (this.getAnnualIncome() * 0.15) - (this.getHealthExpenses() * 0.5);
        }
        else {
            tax = (this.getAnnualIncome() * 0.25) - (this.getHealthExpenses() * 0.5);
        }

        return tax;
    }
}
