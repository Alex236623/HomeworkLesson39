package com.hotel.hotel.controller;

import com.hotel.hotel.domain.City;
import com.hotel.hotel.dto.CityDto;
import lombok.RequiredArgsConstructor;
import com.hotel.hotel.service.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    @GetMapping("/city")
    public ResponseEntity<List<CityDto>> findAll() {
        return ResponseEntity.ok(cityService.findAll());
    }


    @PostMapping("/city")
    public ResponseEntity<Void> save(@RequestBody City city) {
        cityService.save(city);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
