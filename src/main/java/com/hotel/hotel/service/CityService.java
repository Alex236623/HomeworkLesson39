package com.hotel.hotel.service;

import com.hotel.hotel.domain.City;
import com.hotel.hotel.dto.CityDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.hotel.hotel.Repository.CityRepository;


import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityRepository cityRepository;

    public List<CityDto> findAll() {
        return cityRepository.findAll().stream().map(city -> CityDto.builder().name(city.getName()).population(city.getPopulation()).build()).collect(Collectors.toList());
    }

    public void save(City city) {
        cityRepository.save(city);
    }
}
