
import java.io.IOException;




public class task1 {

	private static boolean isProperFile(File f) {

		if (!f.exists()) { //If the given file dosen't exsit
			return false;
		}
		return true;
	}



	public static void notCatchingNull(File f) throws IOException {

		try {
			if (f.exists()) //If given file exsits don't create it
				System.out.println("File already exists");
			else {
				File newFile= new File ("notCatchingNull.txt"); //If not- create it
				if (newFile.createNewFile()) {
					System.out.println("File created: "+newFile.getName()); //Approval for creation
				}

			}
		}
		catch(NullPointerException e){ //If the file is null- catch exception
			System.out.println("Error. Could not create file");
			e.printStackTrace();
		}

	}
	public static void main(String[] args) throws IOException {
		File f = null; //Create a null file

		//Test both function with it, demonstrating the issues 
		notCatchingNull(f);
		isProperFile(f);
	}
