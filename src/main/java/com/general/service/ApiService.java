package com.general.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ApiService {
	
	public String firstFonction() {
		return "OK";
	}

	
}