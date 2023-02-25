package com.example.nassab;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CheckIsFraudCustomerService {
    private final FraudCheckHistoryRepo repo;

    public boolean isFraudCustomer(String customerId){
        repo.save(
                FraudCheckHistory.builder().id(customerId).isFraud(false).
                name("bbb").build()
        );
        return  false;


    }

}
