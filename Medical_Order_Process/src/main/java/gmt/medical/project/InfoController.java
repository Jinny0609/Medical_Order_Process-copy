package gmt.medical.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gmt.medical.model.Shipping_address;
import gmt.medical.service.Shipping_address_Service;

@Controller
public class InfoController {
	
	@Autowired
    private Shipping_address_Service addressService;
	
	// 배송지주소 DB에 저장
	@RequestMapping(value = "/saveAddress", method = RequestMethod.GET)
	public String saveAddress(Shipping_address address) {
		addressService.saveAddress(address);
		System.out.println(address);
		return "redirect:/Shipping_address_List";
	}
}
