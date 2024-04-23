
public class LibraryBook implements Book {

	private String isbn;
	private String title;
	private String author;
	private int year;
	private boolean available;

	public LibraryBook(Book book) {
	    this.isbn = book.getIsbn();
	    this.available = true;
	}

	public LibraryBook(String isbn, String title, String author, int year) {
	    this.isbn = isbn;
	    this.title = title;
	    this.author = author;
	    this.year = year;
	    this.available = true;
	}


	@Override
	public String getIsbn() {
		// TODO Auto-generated method stub
		return isbn;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return author;
	}

	@Override
	public int getYear() {
		// TODO Auto-generated method stub
		return year;
	}

	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return available;
	}

	@Override
	public void setAvailable(boolean available) {
		// TODO Auto-generated method stub
		this.available = available;
	}

}
