import java.util.*;

public class MainClass {

	public static void main(String args[]) {

		int choice = 0;
		HelperClass hp = new HelperClass();
		BusinessOperationsClass boc = new BusinessOperationsClass();
		BusinessLogic bl = new BusinessLogic();
		hp.developerDetails();
		do {
			System.out.println();
			hp.outerMenu();
			choice = hp.inputChoice(choice);

			switch (choice) {

			case 1:
				String files[];
				files = bl.getFiles();
				if (files == null) {
					System.out.println("No Files Found");
				} else {
					for (String fileName : files)
						System.out.println(fileName);

				}
				break;

			case 2:

				int innerChoice = 0;
				do {

					hp.innerMenu();
					innerChoice = hp.inputChoice(innerChoice);
					boc.businessOperations(innerChoice);
				} while (innerChoice >= 1 && innerChoice <= 3);
				break;
			case 3:
				System.out.println("Application exited successfully");
				System.exit(0);
				break;

			default:
				System.out.println("invalid choice. Please try again");
			}

		} while (true);

	}

}
