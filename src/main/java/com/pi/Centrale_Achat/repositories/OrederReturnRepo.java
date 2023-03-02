package com.pi.Centrale_Achat.repositories;

import com.pi.Centrale_Achat.entities.Bill;
import com.pi.Centrale_Achat.entities.OrderReturn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrederReturnRepo extends JpaRepository<OrderReturn,Integer> {
}
