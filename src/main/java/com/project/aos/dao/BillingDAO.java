package com.project.aos.dao;

import java.util.List;

import com.project.aos.model.Billing;
import com.project.aos.repository.BillingRepository;

public class BillingDAO {
	BillingRepository billingRepository;
	
	public Billing save(Billing bil)
	{
		return billingRepository.save(bil);
	}
	
	public List<Billing> findAll()
	{
		return billingRepository.findAll();
	}
	
	public Billing findOne(Long bilId)
	{
		return billingRepository.getOne(bilId);
	}
	
	public void delete(Billing bil)
	{
		billingRepository.delete(bil);
	}
}
