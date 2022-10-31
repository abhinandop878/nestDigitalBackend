package com.nestDigital.nestDigitalBackend.controller;

import com.nestDigital.nestDigitalBackend.dao.EmployeeDAO;
import com.nestDigital.nestDigitalBackend.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;


@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDAO dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/leaveRequest",consumes = "application/json",produces = "application/json")
    public String leaveRequest(@RequestBody EmployeeModel leave){
        leave.setStatus(0);
        dao.save(leave);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/viewLeaveRequest",consumes = "application/json",produces = "application/json")
    public List<Map<String,String>> viewLeaveRequest(@RequestBody EmployeeModel view){
        return (List<Map<String, String>>) dao.viewLeaveRequestById(view.getLeave_id());
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewAllLeaveRequest")
    public List<Map<String,String>>viewAllLeaveRequest(){
        return (List<Map<String, String>>)dao.viewAllLeaveRequestByAdmin();
    }
    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/statusLeave",consumes = "application/json",produces = "application/json")
    public String statusLeave(@RequestBody EmployeeModel accept){
        dao.statusLeaveByEmpId(accept.getStatus(),accept.getLeave_id());
        return "{status:'success'}";
    }

}
