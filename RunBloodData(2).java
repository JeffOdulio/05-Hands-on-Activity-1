import java.util.Scanner;

public class RunBloodData{
	public static void main(String[] args){
	Scanner SC = new Scanner(System.in);
	
	BloodData obj1 = new BloodData();
	
	System.out.print("Enter blood type of patient: ");
	String input1 = SC.nextLine();
	obj1.setBloodType(input1);
	System.out.print("Enter the Rhesus factor (+ or -): ");
	String input2 = SC.nextLine();
	obj1.setRhFactor(input2);
	
	String inputComb = input1 + input2;
	
	if (inputComb.equals ("A+") || inputComb.equals ("A-") || inputComb.equals ("B+") || inputComb.equals("B-") || inputComb.equals ("0+") || inputComb.equals ("O-") || inputComb.equals ("AB+") || inputComb.equals ("AB-")){
		BloodData bd = new BloodData();
		obj1.display();
	}
	else if(inputComb.isEmpty()){
		BloodData bd = new BloodData();
		bd.display();
	}
	else if(input1.isEmpty()){
		BloodData bd = new BloodData();
		System.out.println("Invalid.");
	}
	else if(input2.isEmpty()){
		BloodData bd = new BloodData(); 
		System.out.println("Invalid.");
	}
	else{
		System.out.print("Invalid.");
	}
	SC.close();
}
}

