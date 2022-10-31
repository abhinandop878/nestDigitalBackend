package com.nestDigital.nestDigitalBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_entry")
public class EmployeeEntryModel {
    @Id
    @GeneratedValue
    private int id;
    private int entryId;
    private  int security_Id;
    private String checkIn;
    private String checkOut;


    public EmployeeEntryModel() {
    }

    public EmployeeEntryModel(int id, int entryId, int security_Id, String checkIn, String checkOut) {
        this.id = id;
        this.entryId = entryId;
        this.security_Id = security_Id;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    public int getSecurity_Id() {
        return security_Id;
    }

    public void setSecurity_Id(int security_Id) {
        this.security_Id = security_Id;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }
}
