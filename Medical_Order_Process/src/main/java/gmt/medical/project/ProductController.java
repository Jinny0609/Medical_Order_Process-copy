package gmt.medical.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gmt.medical.model.ProductDTO;
import gmt.medical.service.Product_add_Service;

@Controller
public class ProductController {
	@Autowired
	private Product_add_Service productService;
	
	@RequestMapping(value = "/Product_add", method = RequestMethod.GET)
	public String Product_details() {
		return "Product_add";
	}
	
	@RequestMapping(value = "/Product_add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String productAddSubmit(@RequestBody ProductDTO productDTO) {
	    productService.saveProduct(productDTO.getProductInfo(), productDTO.getProductOptions(), productDTO.getProductImages());
	    return "Categorie";  //성공했을 경우 리다이렉트할 페이지
	}
}
