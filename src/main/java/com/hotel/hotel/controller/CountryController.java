package com.hotel.hotel.controller;

import com.hotel.hotel.dto.CountryDto;
import lombok.RequiredArgsConstructor;
import com.hotel.hotel.domain.Country;
import com.hotel.hotel.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping("/country")
    public List<CountryDto> findAll() {
        return countryService.findAll();
    }

    @PostMapping("/country")
    public void save(@RequestBody Country country) {
        countryService.save(country);
    }
}
