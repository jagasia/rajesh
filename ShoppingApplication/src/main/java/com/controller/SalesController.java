package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.SaleProduct;
import com.service.SalesService;

//use appropriate annotation to configure SalesController as Controller
@Controller
public class SalesController {

// fill the code	  
	@Autowired
	private SalesService salesService;

//use appropriate annotation
//invoke the service class - calculateDiscountedPrice method.
	@RequestMapping(method = RequestMethod.GET, value = "/saleProduct")
	public String salesPage(@ModelAttribute("saleProductObj") SaleProduct saleProductObj) {
		return "saleProduct";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/calculateDiscountedPrice")
	public String calculateDiscountedPrice(@Valid @ModelAttribute("saleProductObj") SaleProduct saleProductObj,
			BindingResult result, ModelMap model) {
		String res = "";
		if (result.hasErrors()) {
			res = "saleProduct";
		} else {
			double discountedPrice = salesService.calculateDiscountedPrice(saleProductObj);
			model.addAttribute("discountedPrice", discountedPrice);
			model.addAttribute("productType", saleProductObj.getProductType());
			model.addAttribute("actualPrice", saleProductObj.getProductPrice());
			model.addAttribute("discountPercentage", saleProductObj.getDiscountPercentage());
			res = "viewDiscountedPrice";
		}

		return res;
	}

	@ModelAttribute("productList")
	public List<String> buildState() {
		List<String> list = new ArrayList<>();
		list.add("Furniture");
		list.add("Electronics");
		list.add("Fashion");
		list.add("General");
		return list;
	}

}
