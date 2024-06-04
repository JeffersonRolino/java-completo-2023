package chapter_14.lesson_166_exercise.entities;

public class LegalPerson extends Person {
    private int numberOfEmployees;


    //*********************************************************************
    // CONSTRUCTORS
    //*********************************************************************
    public LegalPerson() {
    }

    public LegalPerson(String name, Double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }


    //*********************************************************************
    // GETTERS AND SETTERS
    //*********************************************************************
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }


    //*********************************************************************
    // METHODS
    //*********************************************************************
    @Override
    public double calculateTax() {
        double tax = 0.0;
        if(this.numberOfEmployees <= 10){
            tax = this.getAnnualIncome() * 0.16;
        }
        else {
            tax = this.getAnnualIncome() * 0.14;
        }

        return tax;
    }
}
