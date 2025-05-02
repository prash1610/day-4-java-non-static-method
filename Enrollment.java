 public class Enrollment {
    public String getEnrollmentInfo(String platform, String course, String student) {
        return "Platform : " + platform + "\n" + "Course : " + course + "\n"
             + "Student : " + student + "\n"
             + "----------------------------------";
    }

    public static void main(String[] args) {
        Enrollment enroll = new Enrollment();
        
        String info1 = enroll.getEnrollmentInfo("Udemy", "Java Programming", "Alice");
        String info2 = enroll.getEnrollmentInfo("Udemy", "Web Development", "Bob");
        
        System.out.println(info1);
        System.out.println(info2);
    }
}