package gmt.medical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmt.medical.mapper.OrderCompleteMapper;
import gmt.medical.model.OrderCompleteInfo;

@Service
public class OrderCompleteServiceImpl implements OrderCompleteService{

	@Autowired
	private OrderCompleteMapper ordercompleteMapper;
	
	@Override
	public OrderCompleteInfo getOrderCompleteInfo(int product_id) {
		return ordercompleteMapper.getOrderCompleteInfo(product_id);
	}
	
	@Override
	public int getTotalPrice(int user_id) {
	    return ordercompleteMapper.getTotalPrice(user_id);
	}

}
