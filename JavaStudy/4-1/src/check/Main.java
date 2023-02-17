package check;

import constants.Constants;

public class Main {
	
	private String firstName = "Samuel";
	private String lastName = "Takamatsu";
	
	private void printName() {
		System.out.println(firstName + lastName);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		main.printName();
		pet.introduce();
		robotPet.introduce();
		
		
	}
}