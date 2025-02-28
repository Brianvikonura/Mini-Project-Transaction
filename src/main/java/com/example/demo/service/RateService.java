package com.example.demo.service;

import com.example.demo.entity.Rate;
import com.example.demo.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RateService {
    @Autowired
    private RateRepository rateRepository;

    public Rate createRate(Rate request) {

        return rateRepository.save(request);
    }

    public Rate getRate(Float kurs) {

        Optional<Rate> response = rateRepository.findByKurs(kurs);

        return response.orElse(null);
    }
}
