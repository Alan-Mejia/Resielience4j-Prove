package com.doctor.api.feignClients;

import com.doctor.api.feignModels.Doctor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "doctor-service")
public interface DoctorFeignClietn {

    @PostMapping("api/v1/doctors")
    Doctor save(@RequestBody Doctor doctor);

}
