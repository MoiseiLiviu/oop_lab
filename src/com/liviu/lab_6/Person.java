package com.liviu.lab_6;

import java.util.Date;

public class Person {
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private FullName name;
    private Date birthDate;
    private Gender gender;
    private Address homeAddress;
    private Phone phone;

    {
        name = new FullName(givenName, middleName, familyName);
    }

    public enum Gender {
        MALE, FEMALE
    }

    private Hospital[] hospitals;
}
