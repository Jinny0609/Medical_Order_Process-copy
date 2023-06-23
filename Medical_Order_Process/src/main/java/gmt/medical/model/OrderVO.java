package gmt.medical.model;

public class OrderVO {
	private int productId;
	private String productName;
    private String cartOption;
    private int purchaseQuantity;
    private String hcode;
    private int userId;
    
    public String getHcode() {
		return hcode;
	}
	public void setHcode(String hcode) {
		this.hcode = hcode;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
    public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCartOption() {
		return cartOption;
	}
	public void setCartOption(String cartOption) {
		this.cartOption = cartOption;
	}
	public int getPurchaseQuantity() {
		return purchaseQuantity;
	}
	public void setPurchaseQuantity(int purchaseQuantity) {
		this.purchaseQuantity = purchaseQuantity;
	}
}
