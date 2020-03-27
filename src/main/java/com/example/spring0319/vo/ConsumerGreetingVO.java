package com.example.spring0319.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsumerGreetingVO {
    private long id;
//    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public String getCompanyName() {
//        return name;
//    }
//
//    public void setCompanyName(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "ConsumerGreetingVO{" +
                "id=" + id +
//                ", name='" + name + '\'' +
                '}';
    }
}
