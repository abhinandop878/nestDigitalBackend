package com.nestDigital.nestDigitalBackend.dao;

import com.nestDigital.nestDigitalBackend.model.SecurityModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SecurityDAO extends CrudRepository<SecurityModel,Integer> {
    @Query(value = "SELECT * FROM `security_man` WHERE `security_id`= :s_id",nativeQuery = true)
    List<SecurityModel>viewSecurityById(String s_id);
    @Query(value = "SELECT `id`, `security_address`, `security_dob`, `security_doj`, `security_email`, `security_id`, `security_name`, `security_password`, `security_phone`, `securityyoe` FROM `security_man` WHERE `security_email`= :securityE AND `security_password`= :securityP",nativeQuery = true)
    List<SecurityModel>securityLoginByEmailAndPassword(String securityE,String securityP);
}
