package com.henrik.desafio1.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {
	
	public double shippiment(double amount) {
		
		double ship = 0.0;
		
		if (amount < 100) {
			
			ship = 20.0;
			
		}else if (amount < 200){
			
			ship = 12.0;
			
		}else {
			
			ship = 0.0;
		}		
		
		return ship;
		
	};
}
