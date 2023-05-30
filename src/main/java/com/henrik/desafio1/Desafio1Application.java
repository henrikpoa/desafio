package com.henrik.desafio1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.henrik.desafio1.entities.Order;
import com.henrik.desafio1.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner{
	
	private OrderService orderService;

	public Desafio1Application(OrderService orderService) {		
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order order = new Order(1034, 150.0, 20.0);
		System.out.println("\nPedido código " + order.getCode() + "\nValor total: R$ " + orderService.total(order));
		
		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.println("\nPedido código " + order2.getCode() + "\nValor total: R$ " + orderService.total(order2));
		
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("\nPedido código " + order3.getCode() + "\nValor total: R$ " + orderService.total(order3));
		
	}

}
