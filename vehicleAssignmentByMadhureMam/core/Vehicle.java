package vehicleAssignmentByMadhureMam;

import java.time.LocalDate;

public class Vehicle {
	private String chasisno;
	private Color color;
	private double price;
	private LocalDate manufacturedate;
	private LocalDate insuranceexpdate;
	
	private double pollutionlevel;
	private static int count=0;
	
	public Vehicle(String chasisno,Color color,double price ,LocalDate manufacturedate,LocalDate insurancedate) {
		this.chasisno=chasisno;
		this.color=color;
		this.price=price;
		this.manufacturedate=manufacturedate;
		this.insuranceexpdate=insurancedate;
		this.pollutionlevel=0;
		count++;
	}

	public String getChasisno() {
		return chasisno;
	}

	public void setChasisno(String chasisno) {
		this.chasisno = chasisno;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getManufacturedate() {
		return manufacturedate;
	}

	public void setManufacturedate(LocalDate manufacturedate) {
		this.manufacturedate = manufacturedate;
	}

	public LocalDate getInsuranceexpdate() {
		return insuranceexpdate;
	}

	public void setInsuranceexpdate(LocalDate insuranceexpdate) {
		this.insuranceexpdate = insuranceexpdate;
	}

	public double getPollutionlevel() {
		return pollutionlevel;
	}

	public void setPollutionlevel(double pulutionlevel) {
		this.pollutionlevel = pulutionlevel;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Vehicle.count = count;
	}
	@Override
	public String toString() {
		return "Vehicle [chasisno=" + chasisno + 
				", color=" + color +
				", price=" + price+
				", pulutionlevel=" + pollutionlevel + "]";
	}
}
