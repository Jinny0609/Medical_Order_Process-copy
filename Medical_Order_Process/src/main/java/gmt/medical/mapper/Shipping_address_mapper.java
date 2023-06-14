package gmt.medical.mapper;

import java.util.List;

import gmt.medical.model.Shipping_address;

public interface Shipping_address_mapper {
	// 배송지 저장
	public void saveAddress(Shipping_address address);
	// 배송지 리스트
	public List<Shipping_address> getAllAddresses(int user_id);
	// 배송지 수정 데이터 가져오기
	public Shipping_address getAddressById(int address_id,int user_id);
	// 배송지 정보 수정 후 저장
	public void updateAddress(Shipping_address address);
	// 배송지 정보 삭제
	public void deleteAddress(int address_id,int user_id);
}
