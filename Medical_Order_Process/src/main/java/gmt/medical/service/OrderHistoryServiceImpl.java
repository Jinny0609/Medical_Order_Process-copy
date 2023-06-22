package gmt.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmt.medical.mapper.OrderHistoryMapper;
import gmt.medical.model.OrderHistory;

@Service
public class OrderHistoryServiceImpl implements OrderHistroyService{
	
	@Autowired
	private OrderHistoryMapper orderHistoryMapper;
	
	@Override
	public List<OrderHistory> getOrderHistory(String email){
		return orderHistoryMapper.getOrderHistory(email);
	}
	
//	@Override
//    public void addOrderHistory(OrderHistory orderHistory) {
//        orderHistoryMapper.insertOrderHistory(orderHistory);
//        System.out.println("Order History: " + orderHistory.toString());
//    }
//
//	@Override
//	public void getHname(Hcode hCode) {
//		orderHistoryMapper.getHname(hCode);
//	}
//
//	@Override
//	public void getCount(Product_info productInfo) {
//		orderHistoryMapper.getCount(productInfo);
//	}
	
}