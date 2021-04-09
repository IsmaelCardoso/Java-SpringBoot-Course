package model.entities;

public class Vehicle {
	
	private String carModel;
	
	public Vehicle() {
	}

	public Vehicle(String carModel) {
		this.carModel = carModel;
	}

	public String getcarModel() {
		return carModel;
	}

	public void setcarModel(String carModel) {
		this.carModel = carModel;
	}
}
