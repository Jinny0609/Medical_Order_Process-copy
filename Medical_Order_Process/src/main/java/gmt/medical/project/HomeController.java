package gmt.medical.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "Home";
	}

	@RequestMapping(value = "/Product_details", method = RequestMethod.GET)
	public String Product_details() {
		return "Product_details";
	}
	
	@RequestMapping(value = "/Order_list", method = RequestMethod.GET)
	public String Order_list() {
		return "Order_list";
	}
	
	@RequestMapping(value = "/Shipping_address_New", method = RequestMethod.GET)
	public String Shipping_address_New() {
		return "Shipping_address_New";
	}
	
	@RequestMapping(value = "/Order_complete", method = RequestMethod.GET)
	public String Order_complete() {
		return "Order_complete";
	}
	
	@RequestMapping(value = "/Shipping_address_List", method = RequestMethod.GET)
	public String Shipping_address_List() {
		return "Shipping_address_List";
	}
	
	@RequestMapping(value = "/Shipping_address_Edit", method = RequestMethod.GET)
	public String Shipping_address_Edit() {
		return "Shipping_address_Edit";
	}
	
	@RequestMapping(value = "/Info_edit", method = RequestMethod.GET)
	public String Info_edit() {
		return "Info_edit";
	}
	
	@RequestMapping(value = "/Info_edit_Form", method = RequestMethod.GET)
	public String Info_edit_Form() {
		return "Info_edit_Form";
	}
	@RequestMapping(value = "/Categorie", method = RequestMethod.GET)
	public String Categorie() {
		return "Categorie";
	}
}