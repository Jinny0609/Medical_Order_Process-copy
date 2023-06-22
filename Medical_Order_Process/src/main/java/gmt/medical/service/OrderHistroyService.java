package gmt.medical.service;

import java.util.List;

import gmt.medical.model.OrderHistory;

public interface OrderHistroyService {
	public List<OrderHistory> getOrderHistory(String email);  // 모든 주문 이력 조회
//	public void addOrderHistory(OrderHistory orderHistory);
//
//	// hcode 에서 병원명 가져올때 사용
//	public void getHname(Hcode hCode);
//	
//	// product_count 가져올때 사용
//	public void getCount(Product_info productInfo);
}
