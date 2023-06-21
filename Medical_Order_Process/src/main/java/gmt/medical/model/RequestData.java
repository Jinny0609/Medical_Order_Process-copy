package gmt.medical.model;

import java.util.List;

public class RequestData {
	    private int productId;
	    private int categoryId;
	    private String productName;
	    private int productPrice;
		private String image_path;
	    private List<OptionData> selectedOptions;
	    
	    public List<OptionData> getSelectedOptions() {
			return selectedOptions;
		}
		public void setSelectedOptions(List<OptionData> selectedOptions) {
			this.selectedOptions = selectedOptions;
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public int getCategoryId() {
			return categoryId;
		}
		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getProductPrice() {
			return productPrice;
		}
		public void setProductPrice(int productPrice) {
			this.productPrice = productPrice;
		}
		 public String getImage_path() {
				return image_path;
			}
			public void setImage_path(String image_path) {
				this.image_path = image_path;
			}
}
