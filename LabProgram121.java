import java.util.Scanner; 

public class LabProgram121 {
   public static void main(String[] args) {
	   
	   Scanner scnr = new Scanner(System.in);	   
	   int tempValue = scnr.nextInt();  
	   
	   String[] nameArray = new String[tempValue];
	   int[] counter= new int[tempValue];
	   
	   for (int i=0; i<tempValue; i++) {
		   nameArray[i] = scnr.next();
	   }
	   
	   for (int i=0; i<nameArray.length; i++) {
		   for (int j=0; j<nameArray.length; j++) {
			   if (nameArray[i].equals(nameArray[j])) {
				   counter[i]++;
			   }
		   }
	   }	   
	   for (int i=0; i<nameArray.length; i++) {
		   System.out.println(nameArray[i] + " - " + counter[i]);
	   }
	   
   }
}
