package com.nestDigital.nestDigitalBackend.controller;

import com.nestDigital.nestDigitalBackend.dao.EmployeeEntryDAO;
import com.nestDigital.nestDigitalBackend.model.EmployeeEntryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeEntryController {
    @Autowired
    private EmployeeEntryDAO dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addEmployeeEntry",consumes = "application/json",produces = "application/json")
    public String addEmployeeEntry(@RequestBody EmployeeEntryModel add){
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        String currentDate=String.valueOf(dt.format(now));
        add.setCheckIn(currentDate);
        dao.save(add);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/checkoutEmployeeEntry",consumes = "application/json",produces = "application/json")
    public String checkoutEmployeeEntry(@RequestBody EmployeeEntryModel checkout){
        DateTimeFormatter td=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        String currentDateTime=String.valueOf(td.format(now));
        checkout.setCheckOut(currentDateTime);
        dao.checkoutById(checkout.getCheckOut(),checkout.getEntryId());
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewAllEmployeeEntry")
    public List<Map<String,String>> viewAllEmployeeEntry(){
        return (List<Map<String, String>>) dao.viewALlEmployeeEntry();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/checkoutValidation",consumes = "application/json",produces = "application/json")
    public List<EmployeeEntryModel>checkoutValidation(@RequestBody EmployeeEntryModel validation){
        return (List<EmployeeEntryModel>)dao.checkoutValidationById(validation.getEntryId());
    }
}
