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

        Rate response = request;
        rateRepository.save(response);
        return response;
    }

    public Float getRateById(Integer request) {
        Rate response = new Rate();
        response = rateRepository.findById(request).get();

        return response.getKurs();
    }

}
