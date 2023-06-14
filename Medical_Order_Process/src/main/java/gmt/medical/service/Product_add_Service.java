package gmt.medical.service;

import java.util.List;

import gmt.medical.model.ProductImage;
import gmt.medical.model.ProductInfo;
import gmt.medical.model.ProductOption;

public interface Product_add_Service {
	public void saveProduct(ProductInfo productInfo/*, List<ProductOption> productOptions, List<ProductImage> productImages*/);
}
