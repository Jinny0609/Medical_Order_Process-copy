package gmt.medical.model;

import java.util.List;

public class ProductDTO {
	private ProductInfo productInfo;
//    private List<ProductOption> productOptions;	// 이미지및 옵션은 나중에 테스트
//    private List<ProductImage> productImages;		// 이미지및 옵션은 나중에 테스트

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }
    
    // 이미지및 옵션은 나중에 테스트
    /*
    public List<ProductOption> getProductOptions() {
        return productOptions;
    }

    public void setProductOptions(List<ProductOption> productOptions) {
        this.productOptions = productOptions;
    }

    public List<ProductImage> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<ProductImage> productImages) {
        this.productImages = productImages;
    }
    */
}
