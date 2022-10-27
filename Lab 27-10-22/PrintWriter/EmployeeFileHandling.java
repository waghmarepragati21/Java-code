package Lab_27_Oct;
	

	import java.io.PrintWriter;
	import java.io.*;

	public class EmployeeFileHandling {
		 public static void main(String[] args) throws IOException {
		        File file = new File("emp.txt");
		        if(file.exists()){
		            file.createNewFile();
		        }
		        PrintWriter p1 = new PrintWriter(file);
		        p1.println("Employee name: Pragati");
		        p1.println("Employee id: 27");
		        p1.println("Employee salary - 35000");
		        p1.close();
		        p1.close();
		        System.out.println("Done Successfully");
		        
		    }

}
