package gmt.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gmt.medical.mapper.ProductImagesMapper;
import gmt.medical.mapper.ProductInfoMapper;
import gmt.medical.mapper.ProductOptionMapper;
import gmt.medical.model.ProductImage;
import gmt.medical.model.ProductInfo;
import gmt.medical.model.ProductOption;

@Service
public class Product_add_Servicelmpl implements Product_add_Service{
	@Autowired
    private ProductInfoMapper productInfoMapper;

//    @Autowired
//    private ProductOptionMapper productOptionMapper;
//
//    @Autowired
//    private ProductImagesMapper productImagesMapper;

    @Override
    public void saveProduct(ProductInfo productInfo/*, List<ProductOption> productOptions, List<ProductImage> productImages*/) {
        productInfoMapper.insertProductInfo(productInfo);

//        for (ProductOption option : productOptions) {
//            option.setProductId(productInfo.getProductId());  // 상품 정보에서 가져온 id를 설정
//            productOptionMapper.insertProductOption(option);
//        }
//
//        for (ProductImage image : productImages) {
//            image.setProductId(productInfo.getProductId());  // 상품 정보에서 가져온 id를 설정
//            productImagesMapper.insertProductImage(image);
//        }
    }
}
