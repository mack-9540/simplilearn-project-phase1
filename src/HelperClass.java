import java.util.*;

class HelperClass {

	public void developerDetails() {
		System.out.println("Application Name:- LockedMe.com");
		System.out.println("Developer Name  :- Mayank Singh");
		System.out.println();

	}

	public void outerMenu() {

		System.out.println("welcome to LockedMe.com.");
		System.out.println("Press 1 for getting file names");
		System.out.println("Press 2 to add, delete or search a file name");
		System.out.println("Press 3 to Exit");
		System.out.println("Please enter your choice");
	}

	public void innerMenu() {

		System.out.println();
		System.out.println("Press 1 to add file");
		System.out.println("Press 2 to delete file");
		System.out.println("Press 3 to search file");
		System.out.println("Press any other key to go back to previous menu");
	}

	public int inputChoice(int choice) {

		try {
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

		} catch (Exception e) {
			choice = -1;

		}
		return choice;
	}

	public String inputChoiceString(String choice) {
		Scanner sc = new Scanner(System.in);
		choice = sc.nextLine();
		return choice;
	}

	public void sort(String[] a, int l, int h) {
		if (l < h) {
			int p = partition(a, l, h);
			sort(a, l, p - 1);
			sort(a, p + 1, h);

		}
	}

	private int partition(String a[], int l, int h) {

		int i = l - 1;
		String pivot = a[h];
		pivot = pivot.toLowerCase();
		for (int j = l; j < h; j++) {

			if (a[j].toLowerCase().compareTo(pivot) < 0) {
				i++;
				String temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}

		String temp = a[i + 1];
		a[i + 1] = a[h];
		a[h] = temp;
		return i;
	}

}
