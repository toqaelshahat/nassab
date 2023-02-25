package com.example.nassab;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudCheckHistoryRepo extends MongoRepository<FraudCheckHistory, Integer> {
}
