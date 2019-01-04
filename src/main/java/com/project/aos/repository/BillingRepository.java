package com.project.aos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.aos.model.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long>{

}
