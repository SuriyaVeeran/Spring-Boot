package com.demo.sample;

import org.springframework.stereotype.Component;

// @Component
public class District_Config {
	
	private String district_Name;
	
	private int district_Population;

	public String getDistrict_Name() {
		return district_Name;
	}

	public void setDistrict_Name(String district_Name) {
		this.district_Name = district_Name;
	}

	public int getDistrict_Population() {
		return district_Population;
	}

	public void setDistrict_Population(int district_Population) {
		this.district_Population = district_Population;
	}
	
	public void distict_Info() {

		System.out.println("district info");
		
	}
	
	

}
