package com.pluralcamp.demo.repositories;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pluralcamp.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	//select * from student where name = ?
	public List<Student> findByName(String name);
	
	//select * from student where name = ? AND surname = ?
	public List<Student> findByNameAndSurname(String name, String surname);
	

	@Query("SELECT s FROM Student s WHERE s.age = :age")
	List<Student> findByAge(@Param("age") int age);

	@Query("SELECT u FROM User u WHERE u.verificationCode = ?1")
	   public User findByVerificationCode(String code);
}
