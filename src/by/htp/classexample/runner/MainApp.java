package by.htp.classexample.runner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainApp {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//		try {
			Date date1 = df.parse("13-01-2001");
			Date date2 = df.parse("06-06-1903");
			Date date3 = df.parse("06-06-1903");
			Date date4 = df.parse("06-06-1903");
			Date date5 = df.parse("06-06-1903");
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
		
		Author auth1 = new Author("NameAuthor1", "SurnameAuthor1", date1);	
		Author auth2 = new Author("NameAuthor2", "SurnameAuthor2", date2);
		Author auth3 = new Author("NameAuthor3", "SurnameAuthor3", date3);
		Author auth4 = new Author("NameAuthor4", "SurnameAuthor4", date4);
		Author auth5 = new Author("NameAuthor5", "SurnameAuthor5", date5);
		
		Book book1 = new Book("Book1", 2006);
		Book book2 = new Book("Book2", 1950);
		Book book3 = new Book("Book3", 2017);
		
//		book1.author = new Author[]{auth1, auth2};
		
		Author[] authors = new Author[] {auth1, auth2};
		book1.setAuthors(authors);
		
		book2.addAuthors(auth5);
		book2.addAuthors(auth4);
		book2.addAuthors(auth3);
		System.out.println();
		
	}

}
