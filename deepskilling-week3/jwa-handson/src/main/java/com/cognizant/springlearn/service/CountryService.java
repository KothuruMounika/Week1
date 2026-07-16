package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.util.CountryUtil;

@Service
public class CountryService {

    @Autowired
    private CountryUtil countryUtil;

    public List<Country> getAllCountries() {
        return countryUtil.getCountryList();
    }

}