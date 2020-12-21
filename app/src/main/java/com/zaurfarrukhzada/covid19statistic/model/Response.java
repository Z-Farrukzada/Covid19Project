package com.zaurfarrukhzada.covid19statistic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {
    @SerializedName("continent")
    private String continent;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("population")
    @Expose
    private Integer population;
    @SerializedName("cases")
    @Expose
    private Cases cases;
    @SerializedName("deaths")
    @Expose
    private Deaths deaths;
    @SerializedName("tests")
    @Expose
    private Tests tests;
    @SerializedName("day")
    @Expose
    private String day;
    @SerializedName("time")
    @Expose
    private String time;

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCases(Cases cases) {
        this.cases = cases;
    }

    public void setDeaths(Deaths deaths) {
        this.deaths = deaths;
    }

    public void setTests(Tests tests) {
        this.tests = tests;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContinent() {
        return continent;
    }


    public String getCountry() {
        return country;
    }

    public Integer getPopulation() {
        return population;
    }

    public Cases getCases() {
        return cases;
    }


    public Deaths getDeaths() {
        return deaths;
    }


    public Tests getTests() {
        return tests;
    }


    public String getDay() {
        return day;
    }


    public String getTime() {
        return time;
    }


}
