package chapter_15.hostel_project.model.entities;

import chapter_15.hostel_project.model.exceptions.DomainException;

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

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException {
        if(checkOut.isBefore(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }

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
        Duration duration = Duration.between(getCheckIn().atStartOfDay(), getCheckOut().atStartOfDay());
        return (int)duration.toDays();
    }

    public void updateDates(LocalDate checkInDate, LocalDate checkOutDate) throws DomainException {
        LocalDate now = LocalDate.now();
        if(checkInDate.isBefore(now) || checkOutDate.isBefore(now)){
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if(!checkOutDate.isAfter(checkInDate)){
            throw new DomainException("Check-out date must be after check-in date");
        }

        this.checkIn = checkInDate;
        this.checkOut = checkOutDate;
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
