package com.example.nassab;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud")
@AllArgsConstructor
public class NassabController {
    private final CheckIsFraudCustomerService service;
    @GetMapping(path= "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") String customerId){
        boolean isFraudRes= service.isFraudCustomer(customerId);
        return new FraudCheckResponse(isFraudRes);


    }

}
