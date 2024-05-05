package tester;
import static utils.Validationrule.checkColor;

import java.util.Scanner;

import Custom_Exception.ColorException;
import vehicleAssignmentByMadhureMam.Color;
public class TestVehicle {

	public static void main(String[] args) throws ColorException {
		try(Scanner sc = new Scanner(System.in)){
		System.out.println("enter colore name:");
     	checkColor(sc.next());
		
		
	/*	for(Color c: Color.values()) {
			System.out.println(c.name());
		}
		
	}*/
	}

}
}