import java.io.*;
import java.util.*;

class BusinessLogic {

	HelperClass h = new HelperClass();

	public String addUser(String fileName) {

		try {

			File file = new File(fileName);
			if (file.createNewFile()) {
				return "file is sucessfully added ";
			} else {
				return "File already exists";
			}
		}

		catch (IOException e1) {

			return "Invalid file name";
		} catch (Exception e) {
			System.out.println("Invalid entry");
			return e.toString();
		}

	}

	public String deleteUser(String fileName) {

		String files[] = getFiles();
		int f = 0;
		for (int i = 0; i < files.length; i++) {
			if (files[i].equals(fileName)) {
				f = 1;
				break;
			}
		}
		if (f == 1) {
			File f1 = new File(fileName);
			f1.delete();

			return ("File deleted successfully");
		} else {
			return "File Not found";
		}

	}

	public String searchUser(String fileName) {
		String files[] = getFiles();
		int f = 0;
		for (int i = 0; i < files.length; i++) {
			if (files[i].equals(fileName)) {
				f = 1;
				break;
			}
		}
		if (f == 1) {

			return ("File Found");
		} else {
			return "File Not found";
		}
	}

	public String[] getFiles() {
		ArrayList<String> ts = new ArrayList<String>();
		File file = new File(".\\");
		File[] arrf = file.listFiles();
		String[] arr;
		if (arrf != null) {
			for (int i = 0; i < arrf.length; i++) {
				if (arrf[i].isFile()) {
					ts.add(arrf[i].getName());
				}
			}
			arr = new String[ts.size()];
			ts.toArray(arr);
			h.sort(arr, 0, arr.length - 1);
		} else
			arr = null;

		return arr;
	}

}
