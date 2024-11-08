public class EncapsulationSample {
	public static void main(String[] args) {
		
	Student student1 = new Student();
	student1.setId(1234);
	student1.setname("Iverene Grace M. Causapin");
	
	System.out.println("Student Id: " + student1.getId());
	System.out.println("Student Name: " + student1.getname());
	
	
	System.out.println(" \n ");
	
	Book book1 = new Book ();
	book1.setbook_number(1);
	book1.settitle("He's Into Her");
	book1.setauthor("maxinejiji");
	book1.setprice(2097.00);
	
	System.out.println("Book Number: " + book1.getbook_number());
	System.out.println("Book Title: " + book1.gettitle());
	System.out.println("Book Author: " + book1.getauthor());
	System.out.println("Book Price:  " + book1.getprice() + " php");
	
	}
}

class Student {
    private int Student_Id;
    private String name;
    
    public void setId (int s_id) {
        this.Student_Id = s_id;
    }
    
    public void setname (String s_name) {
        this.name = s_name;
    }
    
    public int getId () {
        return Student_Id;
    }
    
    public String getname() {
        return name;
    }
}

class Book {
    private int book_number;
    private String title;
    private String author;
    private double price;
    
    public void setbook_number (int book_num) {
        this.book_number = book_num;
    }
    
    public void settitle (String book_title) {
        this.title = book_title;
    }
    
    public void setauthor (String book_author) {
        this.author = book_author;
    }
    
    public void setprice (double book_price) {
        this.price = book_price;
    }
    
    public int getbook_number () {
        return book_number;
    }
    
    public String gettitle () {
        return title;
    }
    
    public String getauthor () {
        return author;
    }
    
    public double getprice() {
        return price;
    }
    
}