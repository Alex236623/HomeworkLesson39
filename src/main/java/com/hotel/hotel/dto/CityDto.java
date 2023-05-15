package com.hotel.hotel.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CityDto {

    private String name;
    private Long population;
}
