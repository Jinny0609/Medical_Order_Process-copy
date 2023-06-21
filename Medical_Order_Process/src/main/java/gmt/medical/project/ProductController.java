package gmt.medical.project;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
	public String addProduct(@ModelAttribute("productInfo") Product_info productInfo, @RequestParam(value = "save_image", required = false) MultipartFile saveImage) {
	    // 이미지 파일 처리 코드
	    if (saveImage != null && !saveImage.isEmpty()) {
	        String fileName = generateRandomFileName(saveImage.getOriginalFilename());
	        String imagePath = saveImageFile(saveImage, fileName, Integer.toString(productInfo.getCategory_id()));
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
	        }
	    }
	    
	    return "redirect:/Product_add"; // 등록이 성공한 후 이동할 페이지 지정
	}

	private String generateRandomFileName(String originalFileName) {
	    String extension = originalFileName.substring(originalFileName.lastIndexOf('.'));
	    return UUID.randomUUID().toString() + extension;
	}

	private String saveImageFile(MultipartFile file, String fileName, String categoryId) {
	    String uploadDirectory = "C:/Users/GR/Desktop/Medical Order Process/Medical_Order_Process/src/main/webapp/resources/img/Category/" + categoryId + "/";
	    
	    try {
	        byte[] bytes = file.getBytes();
	        Path path = Paths.get(uploadDirectory + fileName);
	        if (!Files.exists(path.getParent())) {
	            Files.createDirectories(path.getParent());
	        }
	        Files.write(path, bytes);
	        return "resources/img/Category/" + categoryId + "/" + fileName;
	    } catch (IOException e) {
	        e.printStackTrace();
	        return null;
	    }
	}
	
//	private String saveImageFile(MultipartFile file, String fileName, String categoryId) {
//	    String uploadDirectory = "C:\\Users\\GR\\Desktop\\Category\\" + categoryId + "\\";
//	    try {
//	        byte[] bytes = file.getBytes();
//	        Path path = Paths.get(uploadDirectory + fileName);
//	        // 디렉토리가 없을 경우 생성
//	        if (!Files.exists(path)) {
//	            Files.createDirectories(path.getParent());
//	        }
//	        Files.write(path, bytes);
//	        return uploadDirectory + fileName;
//	    } catch (IOException e) {
//	        e.printStackTrace();
//	        return null;
//	    }
//	}
	
}
