package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.CustomDetail;

public interface CustomDetailRepository extends JpaRepository<CustomDetail, Long>{

}
