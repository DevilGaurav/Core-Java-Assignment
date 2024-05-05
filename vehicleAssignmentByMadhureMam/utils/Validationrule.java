package utils;

import java.time.LocalDate;

import Custom_Exception.ColorException;
import Custom_Exception.InsuranceExpiry;
import Custom_Exception.ManufactureException;
import Custom_Exception.PollutionException;
import vehicleAssignmentByMadhureMam.Color;
import vehicleAssignmentByMadhureMam.Vehicle;


public class Validationrule {
	public static Color checkColor(String color)throws ColorException{
		for (Color c:Color.values()) {   //for each color variable c compare values of enum in array	
			System.out.println("c.name: "+c.name());
			System.out.println("color: "+color);
			if(c.name().equals(color)) {   //c.name checks enum names in array and color checkes the input value 
				return c;
			}
		}throw new ColorException("No such color");

	}
	public static void checkpollution(Vehicle v1)throws PollutionException{
		if(v1.getPollutionlevel()>20) {
		throw new PollutionException("pollution more than 20%");
		}
	}
	public static LocalDate checkmanufacturedate(LocalDate manufacturedate)throws ManufactureException{
		if(LocalDate.now().compareTo(manufacturedate)<=0) {
			throw new ManufactureException("Date of manufacture shouls be smaller than "+LocalDate.now());
			}return manufacturedate;
	}
	public static LocalDate checkInsurance(LocalDate manufacturedate,LocalDate date)throws InsuranceExpiry{
		if(manufacturedate.compareTo(date)>0) {
			throw new InsuranceExpiry("Insurance date should be greater than manufacture");
			}
		return date;
		}
}
