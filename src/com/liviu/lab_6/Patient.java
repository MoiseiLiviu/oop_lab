package com.liviu.lab_6;

import java.util.Date;

public class Patient extends Person{
    private String id;
    private FullName name;
    private Gender gender;
    private Date birthDate;
    private Integer age;
    private Date accepted;
    private History sickness;
    private String[] presciptions;
    private String[] allergies;
    private String[] specialReqs;

    private OperationsStaff[] operationsStaffs;
}
