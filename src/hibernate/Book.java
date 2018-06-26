package hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    
	@Id
	private int BookId;
	private String title;
	
	
	public int getBookId() {
		return BookId;
	}

	public void setBookId(int BookId) {
		this.BookId = BookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + BookId + ", title=" + title +"]";
    }
}
