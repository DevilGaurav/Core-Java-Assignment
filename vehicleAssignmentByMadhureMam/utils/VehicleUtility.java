package utils;

import static utils.Validationrule.checkColor;
import static utils.Validationrule.checkInsurance;
import static utils.Validationrule.checkmanufacturedate;

import java.time.LocalDate;
import java.util.Scanner;

import Custom_Exception.ColorException;
import Custom_Exception.InsuranceExpiry;
import Custom_Exception.ManufactureException;
import Custom_Exception.PollutionException;
import vehicleAssignmentByMadhureMam.Color;
import vehicleAssignmentByMadhureMam.Vehicle;

public class VehicleUtility {
	public static Vehicle addvehicle(Vehicle[] arr)
			throws ManufactureException, InsuranceExpiry, PollutionException, ColorException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter chasis no. ");
		String chasisno = (sc.next());

		System.out.println("Enter color ");
		Color clr = checkColor(sc.next());

		System.out.println("enter price ");
		double price = sc.nextDouble();

		System.out.println("enter manufacturing date in (yyyy-MM-dd) ");
		LocalDate manufacturedate = checkmanufacturedate(LocalDate.parse(sc.next()));

		System.out.println("enter insurance date in (yyyy-MM-dd) ");
		LocalDate insurancedate = checkInsurance(manufacturedate, LocalDate.parse(sc.next()));

		return new Vehicle(chasisno, clr, price, manufacturedate, insurancedate);

	}
}
