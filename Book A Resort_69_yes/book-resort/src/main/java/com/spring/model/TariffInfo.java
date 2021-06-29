package com.spring.model;

import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
//pojo class with required attributes,getters and setters 
//use appropriate annotation to make this class as component class
@Component
@PropertySource(value="roomTariff.properties")
public class TariffInfo {
	
	//Fill the code
	@Value("${roomTypeWithTariff.map}")
	private  Map<String,Double> tariffInfo;

	public Map<String, Double> getTariffInfo() {
		return tariffInfo;
	}

	public void setTariffInfo(Map<String, Double> tariffInfo) {
		this.tariffInfo = tariffInfo;
	}	
	 
}
