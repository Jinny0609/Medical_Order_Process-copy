package gmt.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmt.medical.mapper.OrderHistoryMapper;
import gmt.medical.model.OrderHistory;


@Service
public class OrderHistoryServiceImpl implements OrderHistoryService{
    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    @Override
    public List<OrderHistory> getOrderList() {
        return orderHistoryMapper.getOrderHistory(); // OrderHistoryMapper를 통해 데이터 조회
    }
}