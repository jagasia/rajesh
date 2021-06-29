package com.service;

import org.springframework.stereotype.Service;

import com.model.SaleProduct;

//use appropriate annotation to configure SalesService as a Service class
@Service
public class SalesService {

	// calculate the discountedPrice and return it
	public double calculateDiscountedPrice(SaleProduct saleProductBean) {
		double discountedPrice = 0.0;

		// fill code

		double price = saleProductBean.getProductPrice();
		if (saleProductBean.getProductType().equals("Furniture")) {
			saleProductBean.setDiscountPercentage(10);
			discountedPrice = price - ((price * 10) / 100);
		} else if (saleProductBean.getProductType().equals("Electronics")) {
			saleProductBean.setDiscountPercentage(15);
			discountedPrice = price - ((price * 15) / 100);
		} else if (saleProductBean.getProductType().equals("Fashion")) {
			saleProductBean.setDiscountPercentage(12);
			discountedPrice = price - ((price * 12) / 100);
		} else {
			saleProductBean.setDiscountPercentage(8);
			discountedPrice = price - ((price * 8) / 100);
		}

		return discountedPrice;
	}
}
