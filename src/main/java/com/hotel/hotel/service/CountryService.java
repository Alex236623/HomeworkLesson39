package com.hotel.hotel.service;

import com.hotel.hotel.domain.City;
import com.hotel.hotel.domain.Country;
import com.hotel.hotel.dto.CountryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.hotel.hotel.Repository.CountryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;

    public List<CountryDto> findAll() {
        return countryRepository.findAll()
                .stream()
                .map(country -> CountryDto.builder()
                        .id(country.getId())
                        .name(country.getName())
                        .population(country.getPopulation())
                        .city(country.getCity().stream()
                                .map(City::getName)
                                .collect(Collectors.toList()))
                        .build())
                        .collect(Collectors.toList());

    }

    public void save(Country country) {
        countryRepository.save(country);
    }
}