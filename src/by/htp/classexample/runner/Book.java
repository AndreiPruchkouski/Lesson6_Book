package by.htp.classexample.runner;

public class Book {

	private String title;
	private int year;
	private Author[] authors;
	private int authorCounter;

	public Book() {

	}

	public Book(String title, int year) {
		this.title = title;
		this.year = year;
	}

	public void setAuthors(Author[] authors) {
		if (authors != null) {
			this.authors = authors;
		}

	}

	public Author[] getAuthors() {
		return this.authors;
	}

	public void addAuthors(Author author) {
		if (this.authors != null) {
			if (authorCounter < authors.length) {
				authors[authorCounter] = author;
				authorCounter++;
			}else {
				// Мы уперлись в размер старого массива(он заполнен) и теперь мы создаем новый массив
				Author[] authors = new Author[this.authors.length+10];
				for(int i = 0; i < this.authors.length; i++) {
					authors[i] = this.authors[i];
				}
				this.authors = authors;
				this.authors[authorCounter] = author;
				authorCounter++;
			}
			} else {
				this.authors = new Author[2];
				this.authors[0] = author;
				authorCounter++;
			}
		}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

}
