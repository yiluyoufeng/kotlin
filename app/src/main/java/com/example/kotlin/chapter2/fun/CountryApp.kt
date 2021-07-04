package com.example.kotlin.chapter2.`fun`

import com.example.kotlin.data.Country

class CountryApp {

    fun filterCountries(
        countries: List<Country>,
        countinient: String,
        population: Int
    ): List<Country> {
        val res = mutableListOf<Country>()
        for (c in countries) {
            if (c.continient == countinient && c.population > population) {
                res.add(c)
            }
        }
        return res
    }

    fun filterCountries(countries: List<Country>, test: (Country) -> Boolean): List<Country> {
        val res = mutableListOf<Country>()
        for (c in countries) {
            if(test(c)) {
                res.add(c)
            }
        }
        return res
    }


}