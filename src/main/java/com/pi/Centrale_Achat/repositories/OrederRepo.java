package com.pi.Centrale_Achat.repositories;

import com.pi.Centrale_Achat.entities.Bill;
import com.pi.Centrale_Achat.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrederRepo extends JpaRepository<Order,Integer> {
}
