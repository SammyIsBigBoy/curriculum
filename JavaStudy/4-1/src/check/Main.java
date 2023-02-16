package check;

public class Main {
	
	private String firstName = "Samuel";
	private String lastName = "Takamatsu";
	
	private void printName() {
		System.out.println(firstName + lastName);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		Pet pet = new Pet("java吉", "hoge");
		RobotPet robotPet = new RobotPet("R2D2", "ルーク");
		
		main.printName();
		pet.introduce();
		robotPet.introduce();
		
		
	}
}