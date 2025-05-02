public class Book{
public void  displayInfo(String libraryName, String title, String author){
System.out.println("Library name:" + libraryName);
System.out.println("Book title:" + title);
System.out.println(" Book Author:"+ author);
System.out.println("---------------------");
}
public static void main(String[] args){
Book book=new Book();
book.displayInfo("City Public Library"," The Great Gatsby ","F.Scott Fitzgerald ");
book.displayInfo(" City Public Library ","1984","George Orwell ");
}
}
