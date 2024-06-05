package chapter_15.hostel_project.model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //**************************************************************************************
    // CONSTRUCTORS
    //**************************************************************************************
    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    //**************************************************************************************
    // GETTERS AND SETTERS
    //**************************************************************************************
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    //**************************************************************************************
    // METHODS
    //**************************************************************************************
    public Integer duration(){
        Duration duration = Duration.between(getCheckIn(), getCheckOut());
        return (int)duration.toDays();
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    //**************************************************************************************
    // TO STRING
    //**************************************************************************************
    @Override
    public String toString() {
        return "Room " + getRoomNumber() +
                ", check-in: " + dateTimeFormatter.format(checkIn) +
                ", check-out: " + dateTimeFormatter.format(checkOut) +
                ", " + duration() + " nights";
    }
}
