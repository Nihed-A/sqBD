package com.pi.Centrale_Achat.repositories;

import com.pi.Centrale_Achat.entities.Bill;
import com.pi.Centrale_Achat.entities.EvaluationCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationCustomerRepo extends JpaRepository<EvaluationCustomer,Integer> {
}
