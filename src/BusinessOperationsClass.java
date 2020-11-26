import java.io.*;

class BusinessOperationsClass {

	public void businessOperations(int choice) {

		BusinessLogic bl = new BusinessLogic();
		HelperClass hp = new HelperClass();

		switch (choice) {

		case 1:
			String fileName = null, result;
			System.out.println("Please enter the file name to be added");
			fileName = hp.inputChoiceString(fileName);
			result = bl.addUser(fileName);
			System.out.println(result);
			break;

		case 2:
			String fileName2 = null, result2;
			System.out.println("Please enter the file name to be deleted");
			fileName2 = hp.inputChoiceString(fileName2);
			result2 = bl.deleteUser(fileName2);
			System.out.println(result2);
			break;

		case 3:
			String fileName3 = null, result3;
			System.out.println("Please enter the file name to be searched");
			fileName3 = hp.inputChoiceString(fileName3);
			result3 = bl.searchUser(fileName3);
			System.out.println(result3);
			break;
		}

	}

}
