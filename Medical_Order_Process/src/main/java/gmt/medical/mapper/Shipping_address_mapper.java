package gmt.medical.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import gmt.medical.model.OrderVO;
import gmt.medical.model.Shipping_address;

public interface Shipping_address_mapper {
	// 배송지 저장
	public void saveAddress(Shipping_address address);
	// 배송지 리스트
	public List<Shipping_address> getAllAddresses(int user_id);
	// 배송지 수정 데이터 가져오기
	public Shipping_address getAddressById(@Param("address_id") int address_id, @Param("user_id")int user_id);
	// 배송지 정보 수정 후 저장
	public void updateAddress(Shipping_address address);
	// 배송지 정보 삭제
	public void deleteAddress(@Param("address_id") int address_id, @Param("user_id")int user_id);
	// 최근 배송지 갖고오기(구매 확정 페이지용)
	public Shipping_address getaddressdate(int user_id);
	// 회원이 주문한 상품 정보 가져오기
	public List<OrderVO> getitemlist(int user_id);
	// 회원이 주문한 상품 정보 가져오기 이미지.ver
	public List<OrderVO> getimglist(@Param("product_id") int productId);
}
