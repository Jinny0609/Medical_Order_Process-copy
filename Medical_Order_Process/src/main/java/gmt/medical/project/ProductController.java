package gmt.medical.project;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
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
	public String addProduct(@ModelAttribute("productInfo") Product_info productInfo, @RequestPart("product_image") MultipartFile uploadFile) {
	    																					// 여러 개의 파일을 업로드하려면 MultipartFile[] 배열을 사용
	    // 1. 이미지 파일 저장
	    String uploadFolder = "C:/Users/wlsgh/Desktop/Category/" + productInfo.getCategory_id(); // 카테고리에 따른 폴더 경로
	    File saveFile = new File(uploadFolder, uploadFile.getOriginalFilename()); // 저장할 파일

	    try {
	        uploadFile.transferTo(saveFile); // 파일 저장
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	    
	    // 2. 상품 정보에 이미지 경로 및 이름 설정
	    productInfo.setImage_path(uploadFolder);
	    productInfo.setProduct_image(uploadFile.getOriginalFilename());
	    
	    // 3. 상품 정보 저장
	    int productId = productService.addProduct(productInfo); // ProductService에 등록 로직 구현
	    System.out.println(productInfo);

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


}
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
