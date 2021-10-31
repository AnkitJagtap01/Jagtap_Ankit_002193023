/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ankitjagtap
 */
public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String nationalId;
    private String stateId;
    private String gender;
    private Date dob;
    private House residence;
    
    public Person(String fName, String lName, String mName, String nId, String sId,
            House residence,
            String gender,
            Date dob,
            int id) {

        this.firstName = fName;
        this.lastName = lName;
        this.middleName = mName;
        this.nationalId = nId;
        this.stateId = sId;
        this.residence = residence;
        this.gender = gender;
        this.dob = dob;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House residence) {
        this.residence = residence;
    }
    
    
    
}
