package gmt.medical.service;

import gmt.medical.model.OrderCompleteInfo;

public interface OrderCompleteService {
	OrderCompleteInfo getOrderCompleteInfo(int product_id);

	int getTotalPrice(int user_id);
}
