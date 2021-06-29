package com.model;

//pojo class with required attributes,getters and setters 

//use appropriate annotation to make this class as component class
import java.util.List;
 
import javax.validation.constraints.Min;

public class SaleProduct {
	
	private String productType;	

	// use appropriate annotation for validating productPrice attribute
	@Min(value=100, message="Product price should not be less than 100")
	private double productPrice;

	private int discountPercentage;
	
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
}
