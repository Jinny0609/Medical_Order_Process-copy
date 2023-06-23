package gmt.medical.service;

import java.util.List;

import gmt.medical.model.CartVO;



public interface CartService {
	// 장바구니 담기
	public void	addcatedata(int productId,String productName,int productPrice,int user_id,String name,int quantity,String imagePath);
    // 장바구니 불러오기
	public List<CartVO> addToCart(int uesr_id);
	// 바로 구매 테이블에 담기전 지우는 메소드
	public void additemdelete(int user_id);
	// 바로 구매 테이블에 담기
	public void	additemdata(int productId,String productName,int productPrice,int user_id,String name,int quantity,String imagePath);
	// 바로 구매 테이블에서 갖고오기
	public List<CartVO> getitemdata(int user_id);
	
	// 장바구니 상품 삭제
	public void deleteCart(int user_id, int product_id);
	
}
