package com.project.aos.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.aos.dao.BillingDAO;
import com.project.aos.model.Billing;

@RestController
@RequestMapping("/product")
public class BillingController {

	BillingDAO billingDAO;
	
	@PostMapping("/billings")
	public Billing createBilling(@Valid @RequestBody Billing bil)
	{
		return billingDAO.save(bil);
	}
	
	@GetMapping("/billings")
	public List<Billing> getAllBillings()
	{
		return billingDAO.findAll();
	}
}
