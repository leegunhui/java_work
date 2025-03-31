package ex04_api;

public class Book {
	String bookName;
	String author;
	
	public Book(String bookName,String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	@Override
	public String toString() {
		String str = "책 제목 : " + bookName + "저자 : " + author;
		return str;
	}
}
