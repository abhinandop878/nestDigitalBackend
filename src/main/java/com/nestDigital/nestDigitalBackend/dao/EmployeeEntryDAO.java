package com.nestDigital.nestDigitalBackend.dao;

import com.nestDigital.nestDigitalBackend.model.EmployeeEntryModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface EmployeeEntryDAO extends CrudRepository<EmployeeEntryModel,Integer> {
    @Modifying
    @Query(value = "UPDATE `employee_entry` SET `check_out`= :checkout WHERE `entry_id`= :checkout_id",nativeQuery = true)
    void checkoutById(String checkout,Integer checkout_id);

    @Query(value = "SELECT a.`id`, a.`check_in`, a.`check_out`, a.`entry_id`, a.`security_id`,b.security_name,c.name FROM `employee_entry` a JOIN `security_man` b ON b.security_id=a.security_id JOIN `employees` c ON c.emp_id=a.entry_id",nativeQuery = true)
    List<Map<String,String>>viewALlEmployeeEntry();
    @Query(value = "SELECT `id`, `check_in`, `check_out`, `entry_id`, `security_id` FROM `employee_entry` WHERE `entry_id`= :checkout_id",nativeQuery = true)
    List<EmployeeEntryModel>checkoutValidationById(Integer checkout_id);
}
