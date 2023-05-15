package com.hotel.hotel.Repository;

import com.hotel.hotel.domain.City;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {


}
