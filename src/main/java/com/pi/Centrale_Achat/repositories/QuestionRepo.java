package com.pi.Centrale_Achat.repositories;

import com.pi.Centrale_Achat.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question,Integer> {
}
