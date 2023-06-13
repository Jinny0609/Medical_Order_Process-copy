package gmt.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gmt.medical.mapper.Shipping_address_mapper;
import gmt.medical.model.Shipping_address;

@Service
public class Shipping_address_ServiceImpl implements Shipping_address_Service {
	@Autowired
    private Shipping_address_mapper addressRepository;
	// 배송지 주소 저장
    public void saveAddress(Shipping_address address) {
        addressRepository.saveAddress(address);
    }
    // 배송지 주소 정보 갖고오기
    public List<Shipping_address> getAllAddresses(){
    	return addressRepository.getAllAddresses();
    }
}
