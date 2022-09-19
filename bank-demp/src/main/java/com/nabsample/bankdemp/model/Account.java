package com.nabsample.bankdemp.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

    String firstName;
    String lastName;
    String address;
    String status;
    int age;
    String nationality;
}
