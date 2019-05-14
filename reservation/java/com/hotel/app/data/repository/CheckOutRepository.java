package com.hotel.app.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hotel.app.data.CheckOut;

public interface CheckOutRepository extends JpaRepository<CheckOut, Long> {

	@Query("SELECT c FROM CheckOut c  WHERE c.employeeid=(:pEmployeeId)")
    List<CheckOut> findByEmployeeId(@Param("pEmployeeId") Long id);
}