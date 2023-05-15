package com.hotel.hotel.dto;

import com.hotel.hotel.domain.City;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CountryDto {
    private Long id;

    private String name;

    private Long population;
    private List<String> city;
}
