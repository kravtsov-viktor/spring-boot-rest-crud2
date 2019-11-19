package com.example.demo.repository;


import com.example.demo.entity.Payment;
import com.example.demo.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
