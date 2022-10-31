package com.nestDigital.nestDigitalBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class AdminModel {
    @Id
    @GeneratedValue
    private int id;
    private int empId;
    private String name;
    private String place;
    private String bloodGroup;
    private String desigination;
    private String dob;
    private String companyEmail;
    private String gender;
    private String password;
    private String companyAddress;

    public AdminModel() {
    }

    public AdminModel(int id, int empId, String name, String place, String bloodGroup, String desigination, String dob, String companyEmail, String gender, String password, String companyAddress) {
        this.id = id;
        this.empId = empId;
        this.name = name;
        this.place = place;
        this.bloodGroup = bloodGroup;
        this.desigination = desigination;
        this.dob = dob;
        this.companyEmail = companyEmail;
        this.gender = gender;
        this.password = password;
        this.companyAddress = companyAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDesigination() {
        return desigination;
    }

    public void setDesigination(String desigination) {
        this.desigination = desigination;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
}
