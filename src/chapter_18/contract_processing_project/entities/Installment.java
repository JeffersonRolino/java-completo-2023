package chapter_18.contract_processing_project.entities;

import java.time.LocalDate;

public class Installment {
    private LocalDate dueDate;
    private Double amount;

    //**************************************************************************
    // CONSTRUCTORS
    //**************************************************************************
    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    //**************************************************************************
    // GETTERS AND SETTERS
    //**************************************************************************
    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
