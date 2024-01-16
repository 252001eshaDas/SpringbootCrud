package com.JavaSpringCrudV.JavaSpringCrudV;


import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

