package com.nestDigital.nestDigitalBackend.controller;

import com.nestDigital.nestDigitalBackend.dao.SecurityDAO;
import com.nestDigital.nestDigitalBackend.model.SecurityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SecurityController {
    @Autowired
    private SecurityDAO dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addSecurity",consumes = "application/json",produces = "application/json")
    public String addSecurity(@RequestBody SecurityModel add){
        dao.save(add);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/viewSecurity",consumes = "application/json",produces = "application/json")
    public List<SecurityModel>viewSecurity(@RequestBody SecurityModel view){
        return (List<SecurityModel>) dao.viewSecurityById(view.getSecurityId());
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewAllSecurity")
    public List<SecurityModel>viewAllSecurity(){
        return (List<SecurityModel>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/securityLogin",consumes = "application/json",produces = "application/json")
    public List<SecurityModel>securityLogin(@RequestBody SecurityModel login){
        return (List<SecurityModel>) dao.securityLoginByEmailAndPassword(login.getSecurityEmail(),login.getSecurityPassword());
    }
}
