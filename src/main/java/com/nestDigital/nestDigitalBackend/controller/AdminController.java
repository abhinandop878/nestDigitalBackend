package com.nestDigital.nestDigitalBackend.controller;

import com.nestDigital.nestDigitalBackend.dao.AdminDAO;
import com.nestDigital.nestDigitalBackend.model.AdminModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private AdminDAO dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addEmployee",consumes = "application/json",produces = "application/json")
    public String addEmployee(@RequestBody AdminModel add){
        dao.save(add);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewEmployees")
    public List<AdminModel> viewEmployees(){
        return (List<AdminModel>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/deleteEmployee",consumes = "application/json",produces = "application/json")
    public String deleteEmployee(@RequestBody AdminModel delete){
        dao.deleteEmployeeByEmpId(delete.getEmpId());
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchEmployee",consumes = "application/json",produces = "application/json")
    public List<AdminModel>searchEmployee(@RequestBody AdminModel search){
        return (List<AdminModel>) dao.searchEmployeeByEmpId(search.getEmpId());
    }
    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/updateEmployee",consumes = "application/json",produces = "application/json")
    public String updateEmployee(@RequestBody AdminModel update){
        dao.updateEmployee(update.getBloodGroup(),update.getCompanyAddress(),update.getCompanyEmail(),update.getDesigination(),update.getDob(),update.getGender(),update.getName(),update.getPassword(),update.getPlace(),update.getEmpId());
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employeeLogin",consumes = "application/json",produces = "application/json")
    public List<AdminModel> employeeLogin(@RequestBody AdminModel login){
        return (List<AdminModel>)dao.loginByEmployeeEmailAndPassword(login.getCompanyEmail(),login.getPassword());
    }
}
