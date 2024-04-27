package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Booking;
import com.example.demo.repository.BookingRepo;


@Service
public class BookingService {
    @Autowired
    BookingRepo pr;

    public Booking createBooking(Booking p) {
        return pr.save(p);
    }

    public List<Booking> getAll() {
        return pr.findAll();
    }

    public Booking getById(int bookingId) 
    {
        return pr.findById(bookingId).orElse(null);
    }
    public List<Booking> getbysort(String field)
    {
        return pr.findAll(Sort.by(Sort.Direction.ASC,field));
    }
    //put
    public boolean updateDetails(int productId,Booking p)
        {
            if(pr.findById(productId)==null)
            {
                return false;
            }
            try{
                pr.save(p);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
        public boolean deleteEmployee(int bookingId)
        {
            if(this.getById(bookingId) == null)
            {
                return false;
            }
            pr.deleteById(bookingId);
            return true;
        }
}