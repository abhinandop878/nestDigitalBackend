package com.nestDigital.nestDigitalBackend.dao;

import com.nestDigital.nestDigitalBackend.model.EmployeeModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO extends CrudRepository<EmployeeModel,Integer> {
    @Query(value = "SELECT a.`id`, a.`duration`, a.`end_date`, a.`leave_type`, a.`leave_id`, a.`reason`, a.`start_date`, a.`status`,b.name FROM `employee_leave` a JOIN `employees` b ON b.emp_id=a.leave_id WHERE a.leave_id= :id",nativeQuery = true)
    List<Map<String,String>> viewLeaveRequestById(Integer id);
    @Query(value = "SELECT a.`id`, a.`duration`, a.`end_date`, a.`leave_type`, a.`leave_id`, a.`reason`, a.`start_date`, a.`status`,b.name FROM `employee_leave` a JOIN `employees` b ON b.emp_id=a.leave_id",nativeQuery = true)
    List<Map<String,String>>viewAllLeaveRequestByAdmin();
    @Modifying
    @Query(value = "UPDATE `employee_leave` SET `status`= :status WHERE `leave_id`= :accept_id",nativeQuery = true)
    void statusLeaveByEmpId(Integer status,Integer accept_id);

}
