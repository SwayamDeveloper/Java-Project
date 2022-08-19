/*Sapphire = 1 5 9 13 17 21
  Peri = 2 6 10 14 18 22
  Ruby = 3 7 11 15 19 23
  Emerald = 4 8 12 16 20 24
 */

import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int num , caseCheck;
         System.out.println("Enter the Roll Number of the student to know their group :");
         num = sc.nextInt();
         
         
         caseCheck = (num+5)%5;
         
//         So basically we have 4 cases
         
         switch(caseCheck) {
         case 1 : System.out.println(num + " is in group SAPPHIRE"); break; 
         case 2 : System.out.println(num + " is in group PERI"); break;
         case 3 : System.out.println(num + " is in group RUBY"); break;
         case 4 : System.out.println(num + " is in group EMERALD");break;
         
         default : System.out.println("! INVALID"); break;
         }
	}

}
