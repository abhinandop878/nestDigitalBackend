package com.nestDigital.nestDigitalBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "securityMan")
public class SecurityModel {
    @Id
    @GeneratedValue
    private int id;
    private String securityName;
    private String securityId;
    private String securityPhone;
    private String securityDob;
    private String securityAddress;
    private String securityDoj;
    private String securityYOE;
    private String securityEmail;
    private String securityPassword;

    public SecurityModel() {
    }

    public SecurityModel(int id, String securityName, String securityId, String securityPhone, String securityDob, String securityAddress, String securityDoj, String securityYOE, String securityEmail, String securityPassword) {
        this.id = id;
        this.securityName = securityName;
        this.securityId = securityId;
        this.securityPhone = securityPhone;
        this.securityDob = securityDob;
        this.securityAddress = securityAddress;
        this.securityDoj = securityDoj;
        this.securityYOE = securityYOE;
        this.securityEmail = securityEmail;
        this.securityPassword = securityPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getSecurityId() {
        return securityId;
    }

    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }

    public String getSecurityPhone() {
        return securityPhone;
    }

    public void setSecurityPhone(String securityPhone) {
        this.securityPhone = securityPhone;
    }

    public String getSecurityDob() {
        return securityDob;
    }

    public void setSecurityDob(String securityDob) {
        this.securityDob = securityDob;
    }

    public String getSecurityAddress() {
        return securityAddress;
    }

    public void setSecurityAddress(String securityAddress) {
        this.securityAddress = securityAddress;
    }

    public String getSecurityDoj() {
        return securityDoj;
    }

    public void setSecurityDoj(String securityDoj) {
        this.securityDoj = securityDoj;
    }

    public String getSecurityYOE() {
        return securityYOE;
    }

    public void setSecurityYOE(String securityYOE) {
        this.securityYOE = securityYOE;
    }

    public String getSecurityEmail() {
        return securityEmail;
    }

    public void setSecurityEmail(String securityEmail) {
        this.securityEmail = securityEmail;
    }

    public String getSecurityPassword() {
        return securityPassword;
    }

    public void setSecurityPassword(String securityPassword) {
        this.securityPassword = securityPassword;
    }
}
