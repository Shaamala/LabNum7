import java.util.Scanner;

/*
 * Abduljabbar Shaamala
 * Lab Number 7
 */
public class Lab7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "yes"; // loop break 
		String answerInput;  
		String nextInput;
		int input;

		// student information assigned as array
		// 0 array postion null because no ID equal 0
		int[] studentID = { 0, 1, 2, 3, 4, 5};
		String[] studentName = { "", "Abdul", "Rual", "Nash", "Moe","Ali" };
		String[] studentHomeTown = { "", "Dearborn", "Detroit", "Ann arbor", "Lansing","Novi" };
		String[] studentFavoritFood = { "", "Rice", "Pasta", "Shwarma", "Chicken","Pizza" };

		System.out.print("Welcome to our Java class. ");

		while (cont.equalsIgnoreCase("yes")) {

			System.out.println("Which student would you like to learn more about?)(enter a number 1-20): ");

			input = scan.nextInt();
			// throw exception
			if (input <= 0) {
				throw new IllegalArgumentException(" Studen Id must be positive");
			}
			// throw exception
			try {
				// check the range of student ID
				if (studentID[input] == 1 || studentID[input] == 2 || studentID[input] == 3 || studentID[input] == 4
						|| studentID[input] == 5) {
					System.out.print("Student " + studentID[input] + " is " + studentName[input]);
					System.out.print(" What would yoy like to know about " + studentName[input] + "?");
					System.out.println("(enter \"hometown\" or \"food\"): ");
					nextInput = scan.next();
					// check the more information
					if (nextInput.equalsIgnoreCase("hometown") || nextInput.equalsIgnoreCase("food")) {
						if (nextInput.equalsIgnoreCase("hometown")) {
							System.out.print(studentName[input] + " is from " + studentHomeTown[input] + ".");
							System.out.println(" Would you like to know more?(enter \"yes\" or \"no\"): ");
						} else {
							System.out
									.print(studentName[input] + " favorite food is " + studentFavoritFood[input] + ".");
							System.out.println(" Would you like to know more?(enter \"yes\" or \"no\"): ");
						}
						answerInput = scan.next();

						if (answerInput.equalsIgnoreCase("yes")) {
							if (nextInput.equalsIgnoreCase("hometown")) {
								System.out.println(
										studentName[input] + " favorite food is " + studentFavoritFood[input] + ".");
							} else {
								System.out.println(studentName[input] + " is from " + studentHomeTown[input] + ".");

							}
						}
					} else {

						System.out.println("That data does not exist. Please try again.");
						System.out.print(" \"(enter \\\"hometown\\\" or \\\"favorite food\\\"):  ");
					}
				} else {
					System.out.println("That student does not exist. Please try again.(enter a number 1-20): ");
					scan.next();
				}
				
				// catch the throw exception
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Oops, the student ID out of rang");
				e.printStackTrace();
			}

			// countinue condetion
			System.out.println("Do yo want to continue? (yes/no)");
			cont = scan.next();

		}
		scan.close();
		// message of ending
		System.out.println("Goodbye!");
		

	}
}
