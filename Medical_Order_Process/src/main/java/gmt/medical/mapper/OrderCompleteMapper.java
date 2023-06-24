package gmt.medical.mapper;

import gmt.medical.model.OrderCompleteInfo;

public interface OrderCompleteMapper {
	OrderCompleteInfo getOrderCompleteInfo(int product_id);

	int getTotalPrice(int user_id);
}
