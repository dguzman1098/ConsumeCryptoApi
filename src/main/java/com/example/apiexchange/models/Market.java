package com.example.apiexchange.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Market {

        String name;
        String code;

    public Market() {

    }

    public Market(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

    @Override
    public String toString() {
        return "Market{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
