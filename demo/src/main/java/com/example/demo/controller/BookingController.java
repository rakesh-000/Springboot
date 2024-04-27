package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Booking;
import com.example.demo.service.BookingService;


@RestController
public class BookingController {
    @Autowired
    BookingService ps;
    @PostMapping("/api/booking")
     public ResponseEntity<Booking> add(@RequestBody Booking p) 
    {

        ps.createBooking(p);
        return new ResponseEntity<>(p, HttpStatus.CREATED);
    }
    @GetMapping("/api/booking")
    public ResponseEntity<List<Booking>> getAll()
    {
        try 
        {
        List<Booking> p = ps.getAll();
        return new ResponseEntity<>(p,HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.OK);

        }

    }
    @GetMapping("/api/booking/{bookingId}")
    public ResponseEntity<Booking> get(@PathVariable("bookingId") int bookingId )
    {
        try 
        {
        Booking p = ps.getById(bookingId);
        return new ResponseEntity<>(p,HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.OK);

        }
    }
    @GetMapping("/api/sort/{field}")
    public ResponseEntity<List<Booking>> get(@PathVariable String field)
    {
        try{
            return new ResponseEntity<>(ps.getbysort(field),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/api/booking/{bookingId}")
    public ResponseEntity<Booking> putMethod(@PathVariable("bookingId") int bookingId,@RequestBody Booking pd)
    {
        if(ps.updateDetails(bookingId,pd) == true)
        {
            return new ResponseEntity<>(pd,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/api/booking/{bookingId}")
    public ResponseEntity<Boolean> delete(@PathVariable("bookingId") int bookingId)
    {
        if(ps.deleteEmployee(bookingId) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }

    

}