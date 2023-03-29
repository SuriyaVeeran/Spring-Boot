package com.example.Spring_IO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class State_Config {

	private String state_Name;

	private String state_CM;

	private int no_Of_Districts;

	@Autowired
	private District_Config district;

	public District_Config getDistrict() {
		return district;
	}

	public void setDistrict(District_Config district) {
		this.district = district;
	}

	public String getState_Name() {
		return state_Name;
	}

	public void setState_Name(String state_Name) {
		this.state_Name = state_Name;
	}

	public String getState_CM() {
		return state_CM;
	}

	public void setState_CM(String state_CM) {
		this.state_CM = state_CM;
	}

	public int getNo_Of_Districts() {
		return no_Of_Districts;
	}

	public void setNo_Of_Districts(int no_Of_Districts) {
		this.no_Of_Districts = no_Of_Districts;
	}

	public void state_Info() {

		System.out.println("state info");
		district.distict_Info();

	}

}
