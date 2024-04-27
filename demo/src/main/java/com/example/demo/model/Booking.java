package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Booking {

    @Id
    // @GeneratedValue
    int bookingId;
    String bookingName;
    int members;
    String roomtype;
    String gender;
    String checkindate;
    String checkoutdate;
    String mobilenumber;

    public Booking() {
    }

    public Booking(int bookingId, String bookingName, int members, String roomtype, String gender,String checkindate,String checkoutdate,String mobilenumber) {
        this.bookingId = bookingId;
        this.bookingName = bookingName;
        this.members = members;
        this.roomtype = roomtype;
        this.gender = gender;
        this.checkindate=checkindate;
        this.checkoutdate=checkoutdate;
        this.mobilenumber=mobilenumber;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype= roomtype;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender= gender;
    }
    public String getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(String checkindate) {
        this.checkindate= checkindate;
    }
    public String getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(String checkoutdate) {
        this.checkoutdate= checkoutdate;
    }
    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber= mobilenumber;
    }
}



