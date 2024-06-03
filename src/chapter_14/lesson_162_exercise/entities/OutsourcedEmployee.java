package chapter_14.lesson_162_exercise.entities;

public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;


    //*****************************************************************************
    // CONSTRUCTORS
    //*****************************************************************************
    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }


    //*****************************************************************************
    // GETTERS AND SETTERS
    //*****************************************************************************
    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }


    //*****************************************************************************
    // METHODS
    //*****************************************************************************
    @Override
    public double payment(){
        return super.payment() + (additionalCharge * 1.1);
    }
}
