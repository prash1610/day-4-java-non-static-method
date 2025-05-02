public class Faculty{
public void showFacultyDetails(String universityName, String facultyName, String department){
System.out.println("Univerty name:"+ universityName);
System.out.println("Faculty name:"+ facultyName);
System.out.println("Department:"+ department);
System.out.println("-----------------------------------------");
}
public static void main(String [] args){
Faculty faculty=new Faculty();
faculty.showFacultyDetails("Standford university","Dr.Robert Brown","Computer Science");
faculty.showFacultyDetails("Standford university","Dr.Lisa Green","Physics");
}
}