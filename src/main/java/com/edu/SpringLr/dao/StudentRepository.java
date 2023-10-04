package com.edu.SpringLr.dao;

import com.edu.SpringLr.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
