public class Patient{
public void printDetails(String hospitalName, String patientName, int age){
System.out.println("Hospital name:"+ hospitalName);
System.out.println("Patient name:"+ patientName);
System.out.println("Age:"+ age);
System.out.println("-----------------------------------------");
}
public static void main(String [] args){
Patient patient=new Patient();
patient.printDetails("city Care Hospital","John Doe",45);
patient.printDetails("City Care Hospiatal","Emma Watson",30);
}
}