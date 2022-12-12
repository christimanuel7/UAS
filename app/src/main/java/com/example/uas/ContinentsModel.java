package com.example.uas;

import java.util.List;

public class ContinentsModel {

    private List<covidContinent>covidcontinent;

    public List<covidContinent> getCovidcontinent() {
        return covidcontinent;
    }

    public void setCovidcontinent(List<covidContinent> covidcontinent) {
        this.covidcontinent = covidcontinent;
    }

    public class covidContinent{
        private String continent;
        private Integer cases,deaths,recovered;

        public String getContinent() {
            return continent;
        }

        public void setContinent(String continent) {
            this.continent = continent;
        }

        public Integer getCases() {
            return cases;
        }

        public void setCases(Integer cases) {
            this.cases = cases;
        }

        public Integer getDeaths() {
            return deaths;
        }

        public void setDeaths(Integer deaths) {
            this.deaths = deaths;
        }

        public Integer getRecovered() {
            return recovered;
        }

        public void setRecovered(Integer recovered) {
            this.recovered = recovered;
        }

        @Override
        public String toString() {
            return "covidContinent{" +
                    "continent='" + continent + '\'' +
                    ", cases=" + cases +
                    ", deaths=" + deaths +
                    ", recovered=" + recovered +
                    '}';
        }
    }
}
