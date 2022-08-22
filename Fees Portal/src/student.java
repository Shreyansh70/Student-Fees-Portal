
import java.util.*;
class student{
     
    int AdmissionNo;
    String ChildName;
    String password;
    int ChildClass;


    public void disp()
    {
    	System.out.println("Admission No. :"+AdmissionNo +"\nStudent Name: "+ ChildName +"\nStudent Class: "+ ChildClass);
        
    }
     

     public void setPassword(String password) {
         this.password = password;
     }


     public int getAdmissionNo() {
         return AdmissionNo;
     }

     public void setAdmissionNo(int admissionNo) {
         AdmissionNo = admissionNo;
     }

     public String getChildName() {
         return ChildName;
     }

     public void setChildName(String childName) {
         ChildName = childName;
     }

     public String getPassword() {
         return password;
     }


     public int getChildClass() {
         return ChildClass;
     }

     public void setChildClass(int childClass) {
         ChildClass = childClass;
     }
 }
 
 class Studentfees extends student
 {
	 static int c =16000;

     int total;
	public Studentfees(String childName, int childClass) {
		
		c++;
        this.AdmissionNo = c;

        ChildName = childName;
        ChildClass = childClass;
		
	}
	 
	public void disp()
    {
		
    	System.out.println("Admission No. :"+AdmissionNo +"\nStudent Name: "+ ChildName +"\nStudent Class: "+ ChildClass);
        System.out.println("Total Fees Paid :"+total);
        System.out.println("\n");
    }
 }
