import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Toy[] toysArray = new Toy[3];
		toyProgram(toysArray);
	}
	public static Toy[] createToysArr(Toy[] toysArray){
		int code, year;
		String group, manuFact;
		for (int i = 0; i < toysArray.length; i++) {
			System.out.println("| Enter details for toy - " + (i+1)+" |");
			System.out.print("Group: ");
			group = s.next();
			System.out.print("Code: ");
			code = s.nextInt();
			System.out.print("Manu Fact: ");
			manuFact = s.next();
			System.out.print("The age for which the toy is intended: ");
			year = s.nextInt();
			toysArray[i] = new Toy(code,group,manuFact,year);
		}
		return toysArray;
	}
	public static void toyProgram(Toy[] toysArray){
		createToysArr(toysArray);// call to the array
		System.out.print("Enter the age of the child you are looking for a toy for: ");
		int ageBoy = s.nextInt();

		System.out.println("Toys that are suitable for age |" + ageBoy +"| are:");
		for (int i = 0; i < toysArray.length; i++) {
			if (toysArray[i].getYear() <= ageBoy){
				System.out.println(toysArray[i].toString());
				System.out.println();
			}
		}
	}
	public static Scanner s = new Scanner(System.in);
}
