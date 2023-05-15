package com.hotel.hotel.Repository;

import com.hotel.hotel.domain.Country;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
