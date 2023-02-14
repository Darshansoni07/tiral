package com.exam.repo;

//import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.exam.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

	//Set<Question> findByQuiz();
	
	

}