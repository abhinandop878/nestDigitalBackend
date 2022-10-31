package com.nestDigital.nestDigitalBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_leave")
public class EmployeeModel {
    @Id
    @GeneratedValue
    private  int id;
    private int leave_id;
    private String leaveType;
    private String reason;
    private String startDate;
    private String endDate;
    private int duration;
    private int status;

    public EmployeeModel() {
    }

    public EmployeeModel(int id, int leave_id, String leaveType, String reason, String startDate, String endDate, int duration, int status) {
        this.id = id;
        this.leave_id = leave_id;
        this.leaveType = leaveType;
        this.reason = reason;
        this.startDate = startDate;
        this.endDate = endDate;
        this.duration = duration;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLeave_id() {
        return leave_id;
    }

    public void setLeave_id(int leave_id) {
        this.leave_id = leave_id;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
