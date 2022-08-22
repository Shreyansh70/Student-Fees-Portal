import java.util.*;
import java.util.Random;
public class RegistrationInfo {
    static int h[][] = new int[13][3];
    
    static  Studentfees[][] s = new Studentfees[13][10];
    static Scanner sc = new Scanner (System.in);
    static int[] c = new int[13];
    Random rand = new Random();
    
    static void display(){
         for(int i=1;i<13;i++){
             for(int j=0;j<c[i];j++){
                 int sum=0;
                 
                 for(int k=0;k<3;k++)
                 {
                	 System.out.println(h[i][j]);
                	 sum+=h[i][k];
                 }
                 s[i][j].total=sum;
                 s[i][j].disp();
                 
             }
         }
        }

    static  boolean  search(String x){
        for(int i=1;i<13;i++){
            for(int j=0;j<c[i];j++){
                if(x.equals(s[i][j].ChildName)){
                    
                    return true;
                }
            }
        }
        return false;
    }
     static  void set(){
         String n;
         System.out.print("\nEnter Name :- ");
         n = sc.next();
         if(search(n)){
             System.out.println("Record Already Exists");
         }
         else {
             
             System.out.print("Enter Students's class : ");
             int x = sc.nextInt();
             int i= x;
             int j = c[x]++;
             s[i][j] = new Studentfees(n,x);
             
             System.out.print("Enter password : ");
             String p;
             p=sc.next();
             s[i][j].setPassword(p);

         }
    }
     public static void main(String[] args) {
     
    	 System.out.println("*************************  WELCOME TO SCHOOL FEES PORTAL  *************************\n\n");
    	 System.out.println("SELECT OPTION");
    	 Random rand = new Random();
    	 for(int i=0;i<13;i++){
    	        for(int j=0;j<3;j++){
    	            h[i][j] = rand.nextInt(5001) + 15000;

    	        }
    	    }
    	 while(true)
    	 {
    		 System.out.println("1. ADD STUDENT\n2. EXIT AND DISPLAY");
    		 System.out.print("Enter Choice : ");
    		 int choice=sc.nextInt();
    		 System.out.println("\n--------------------------------------------------");
    		 if(choice==1)
    			 set();
    		 
    		 else if(choice==2)
    			 break;
    		 
    		 else
    		 {
    			 System.out.println("INVALID OPTION SELECTED");
    		 }
    		 System.out.println("\n--------------------------------------------------\n");
    	 }
    	 System.out.println("\n*************************  STUDENT'S FEES RELATED DETAILS ARE PRINTED BELOW  *************************\n");
    	 
    	 display();
    	 
     }
}
