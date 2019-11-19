package com.example.demo;

import com.example.demo.entity.Payment;
import com.example.demo.entity.Person;
import com.example.demo.repository.PaymentRepository;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestCrud implements ApplicationRunner {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PaymentRepository paymentRepository;


    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestCrud.class, args);
    }


    @Override
    public void run(ApplicationArguments args) {

        Person person1 = new Person("ivan", 22);
        Person person2 = new Person("mike", 33);

        personRepository.save(person1);
        personRepository.save(person2);

        //

        Payment p1 = new Payment("pay1", "coffee cup", person1);
        Payment p2 = new Payment("pay2", "sweet cake", person1);
        Payment p3 = new Payment("pay3", "sugar milk", person2);

        paymentRepository.save(p1);
        paymentRepository.save(p2);
        paymentRepository.save(p3);
    }

}
