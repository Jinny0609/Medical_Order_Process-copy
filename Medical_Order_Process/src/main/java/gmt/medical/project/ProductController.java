package gmt.medical.project;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import gmt.medical.model.Product_info;
import gmt.medical.model.Product_option;
import gmt.medical.service.CategoryService;
import gmt.medical.service.Product_info_Service;


@Controller
public class ProductController {
	@Autowired
    private Product_info_Service productService;
	
	@Autowired 
	private CategoryService categoryService;
	
	@RequestMapping(value = "/Product_add", method = RequestMethod.GET)
	public String Product_details() {
		return "Product_add";
	}

	@RequestMapping(value = "/Product_add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("productInfo") Product_info productInfo, @RequestParam(value = "product_image", required = false) MultipartFile productImage) {
		// 이미지 파일 처리 코드
		if (productImage != null && !productImage.isEmpty()) {
		    String fileName = generateRandomFileName(productImage.getOriginalFilename());
		    String imagePath = saveImageFile(productImage, fileName);
		    productInfo.setProduct_image(fileName);
		    productInfo.setImage_path(imagePath);
		}

	    // 상품 정보 저장
	    int productId = productService.addProduct(productInfo);

	    // 옵션 정보 저장
	    List<String> optionNames = productInfo.getOptionNames();
	    if (optionNames != null && !optionNames.isEmpty()) {
	        for (String option_name : optionNames) {
	            Product_option productOption = new Product_option();
	            productOption.setProduct_id(productId);
	            productOption.setOption_name(option_name);
	            productOption.setCategory_id(productInfo.getCategory_id());
	            productService.addOption(productOption);
	            System.out.println("Option: " + productOption.toString());
	        }
	    }

	    return "redirect:/Product_add"; // 등록이 성공한 후 이동할 페이지 지정
	}
	
	private String generateRandomFileName(String originalFileName) {
	    String extension = originalFileName.substring(originalFileName.lastIndexOf('.'));
	    return UUID.randomUUID().toString() + extension;
	}
	
	private String saveImageFile(MultipartFile file, String productImage) {
	    String uploadFolder = "D:\\upload";

	    try {
	        // 파일 이름 처리
	        String originalFileName = file.getOriginalFilename();
	        String fileName = UUID.randomUUID().toString() + "_" + originalFileName;

	        // 파일 저장
	        File saveFile = new File(uploadFolder, fileName);
	        file.transferTo(saveFile);

	        // 파일 경로 반환
	        return uploadFolder + "\\" + fileName;
	    } catch (Exception e) {
	        e.printStackTrace();
	        // 파일 저장 실패 처리를 원하는 방식으로 구현할 수 있습니다.
	        return null;
	    }
	}
}
// root context에 아래 코드 추가해야함..
//<bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
//<!-- one of the properties available; the maximum file size in bytes -->
//<property name="maxUploadSize" value="104857600"/> <!-- 100 * 1024 * 1024 = 100MB -->
//</bean>

//	@RequestMapping(value = "/addOption", method = RequestMethod.POST)
//	public String addOption(@RequestParam("option_name") String option_name, @ModelAttribute("productInfo") Product_info productInfo) {
//	    // Product_option 객체 생성
//	    Product_option productOption = new Product_option();
//	    productOption.setProduct_id(productInfo.getProduct_id());
//	    productOption.setOption_name(option_name);
//	    productOption.setCategory_id(productInfo.getCategory_id());
//
//	    // ProductService를 통해 addOption 메서드 호출, 옵션 정보 저장
//	    productService.addOption(productOption);
//
//	    System.out.println("Option: " + productOption.toString());
//
//	    return "redirect:/Product_add"; // 등록이 성공한 후 이동할 페이지 지정
//	}

	
//	@RequestMapping(value = "/Product_add", method = RequestMethod.POST)
//    public String addProduct(@ModelAttribute("productInfo") Product_info productInfo) {
//        productService.addProduct(productInfo); // ProductService에 등록 로직 구현
//        System.out.println(productInfo);
//        return "redirect:/Product_add"; // 등록이 성공한 후 이동할 페이지 지정
//    }


//	@RequestMapping(value = "/Product_add", method = RequestMethod.POST)
//		public String addProduct(@ModelAttribute("productInfo") Product_info productInfo) {
//    	// 상품 정보 저장
//    	productService.addProduct(productInfo); // ProductService에 등록 로직 구현
//    	System.out.println(productInfo);
//
//    	return "redirect:/Product_add"; // 등록이 성공한 후 이동할 페이지 지정
//	}
//}
