package com.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Order;
import com.demo.repo.MyRepo;
import com.demo.service.OrderService;

@Service
public class MyOrderService implements OrderService {

	@Autowired
	MyRepo myRepo;

	@Override
	public Order createOder(Order order) {

		Order ord = myRepo.save(order);

		return ord;
	}

}
