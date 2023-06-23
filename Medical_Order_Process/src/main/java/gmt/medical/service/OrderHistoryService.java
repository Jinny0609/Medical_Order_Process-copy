package gmt.medical.service;

import java.util.List;

import gmt.medical.model.OrderHistory;

public interface OrderHistoryService {
	List<OrderHistory> getOrderList();
}
