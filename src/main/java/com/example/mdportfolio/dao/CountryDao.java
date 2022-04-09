package com.example.mdportfolio.dao;

import com.example.mdportfolio.bean.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryDao extends JpaRepository<Country,Long> {
    Country findByCode(String code);
    int deleteByCode(String code);
}
