package com.opdark;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @RequestMapping("/userServiceFallback")
    public String userServiceFallBackMethod(){
        return "The user service is taking much time than expected. Please try again later";
    }

    @RequestMapping("/departmentServiceFallback")
    public String departmentServiceFallBackMethod(){
        return "The department service is taking much time than expected. Please try again later";
    }
}
