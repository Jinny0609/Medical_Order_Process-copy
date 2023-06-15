package gmt.medical.project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gmt.medical.model.Product_info;
import gmt.medical.service.Product_info_Service;


@Controller
public class ProductController {
	@Autowired
    private Product_info_Service productService;
	
	@RequestMapping(value = "/Product_add", method = RequestMethod.GET)
	public String Product_details() {
		return "Product_add";
	}
	
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("productInfo") Product_info productInfo) {
      productService.addProduct(productInfo); // ProductService에 등록 로직 구현

      return "redirect:/Product_add"; // 등록이 성공한 후 이동할 페이지 지정
    }
}
