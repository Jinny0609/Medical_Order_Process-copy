package gmt.medical.project;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gmt.medical.model.ProductDTO;
import gmt.medical.model.ProductInfo;
import gmt.medical.model.ProductOption;
import gmt.medical.service.Product_add_Service;

@Controller
public class ProductController {
	@Autowired
	private Product_add_Service productService;
	
	@RequestMapping(value = "/Product_add", method = RequestMethod.GET)
	public String Product_details() {
		return "Product_add";
	}
	
	@RequestMapping(value = "/Product_add", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String productAddSubmit(@RequestParam("productInfo") String productInfoStr/*, 
	                               @RequestParam("productOptions") String productOptionsStr,
	                               @RequestParam("productImage") MultipartFile productImage*/) {

	    // ProductInfo와 ProductOptions를 JSON 문자열에서 객체로 변환
		ObjectMapper mapper = new ObjectMapper();
	    ProductInfo productInfo = null;
	    try {
	        productInfo = mapper.readValue(productInfoStr, ProductInfo.class);
	    } catch (JsonProcessingException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
//	    ProductInfo productInfo = mapper.readValue(productInfoStr, ProductInfo.class);
//	    ProductOption productOptions = mapper.readValue(productOptionsStr, ProductOption.class);

	    productService.saveProduct(productInfo /*, Arrays.asList(productOptions), Arrays.asList(productImage) */); // 이미지및 옵션은 나중에 테스트
	    return "Categorie";  // 성공했을 경우 리다이렉트할 페이지
	}

}
