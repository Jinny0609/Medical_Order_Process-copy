package gmt.medical.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gmt.medical.model.Categories;
import gmt.medical.model.ProductForm;
import gmt.medical.model.Product_info;
import gmt.medical.model.Product_option;
import gmt.medical.service.CategoryService;
import gmt.medical.service.Product_info_Service;


@Controller
public class ProductController {
	@Autowired
    private Product_info_Service productService;
	
	@Autowired CategoryService categoryService;
	
//	@RequestMapping(value = "/Product_add", method = RequestMethod.GET)
//	public String Product_details() {
//		return "Product_add";
//	}
	
//	@RequestMapping(value = "/Product_add", method = RequestMethod.POST)
//    public String addProduct(@ModelAttribute("productInfo") Product_info productInfo) {
//        productService.addProduct(productInfo); // ProductService에 등록 로직 구현
//        System.out.println(productInfo);
//        return "redirect:/Product_add"; // 등록이 성공한 후 이동할 페이지 지정
//    }
	
	@RequestMapping(value = "/Product_add", method = RequestMethod.GET)
    public String Product_details(Model model) {
        model.addAttribute("productForm", new ProductForm());
        model.addAttribute("categories", categoryService.getcategory());
        return "Product_add";
    }
    
    @RequestMapping(value = "/Product_add", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("productForm") ProductForm productForm) {
        // 여기에서 productForm을 사용하여 상품 정보를 저장하는 로직을 작성합니다.
        // 예를 들어, productService.addProduct(productForm.getProductInfo())를 호출할 수 있습니다.
        productService.addProduct(productForm.getProductInfo());
        productService.addOptions(productForm.getProductOptions());
        
        // 저장이 완료된 후에는 사용자를 다른 페이지로 리다이렉트하거나 결과를 보여주는 뷰를 반환합니다.
        return "redirect:/Product_add";
    }
}
