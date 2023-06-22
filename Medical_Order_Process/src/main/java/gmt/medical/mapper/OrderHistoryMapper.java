package gmt.medical.mapper;

import java.util.List;

import gmt.medical.model.OrderHistory;

public interface OrderHistoryMapper {
	  List<OrderHistory> getOrderHistory(String email);
//    public void insertOrderHistory(OrderHistory orderHistory);  // 주문 이력을 추가하는 메서드
//    public void getHname(Hcode hCode);
//    public void getCount(Product_info product_Info);

	
}

