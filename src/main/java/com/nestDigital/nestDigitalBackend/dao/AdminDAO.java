package com.nestDigital.nestDigitalBackend.dao;

import com.nestDigital.nestDigitalBackend.model.AdminModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdminDAO extends CrudRepository<AdminModel,Integer> {
    @Modifying
    @Query(value = "DELETE FROM `employees` WHERE `emp_id`= :id",nativeQuery = true)
    void deleteEmployeeByEmpId(Integer id);
    @Query(value = "SELECT * FROM `employees` WHERE `emp_id`= :search_id",nativeQuery = true)
    List<AdminModel>searchEmployeeByEmpId(Integer search_id);
    @Modifying
    @Query(value = "UPDATE `employees` SET `blood_group`= :bloodGroup,`company_address`= :companyAddress,`company_email`= :companyEmail,`desigination`= :desigination,`dob`= :dob,`gender`= :gender,`name`= :name,`password`= :password,`place`= :place WHERE `emp_id`= :update_id",nativeQuery = true)
    void updateEmployee(String bloodGroup,String companyAddress,String companyEmail,String desigination,String dob,String gender,String name,String password,String place,Integer update_id);
    @Query(value = "SELECT `id`, `blood_group`, `company_address`, `company_email`, `desigination`, `dob`, `emp_id`, `gender`, `name`, `password`, `place` FROM `employees` WHERE `company_email`= :email AND `password`= :password",nativeQuery = true)
    List<AdminModel>loginByEmployeeEmailAndPassword(String email,String password);
}
