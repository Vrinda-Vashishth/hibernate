package hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
 @Id
 private int authorid;
 private String fname;
 private String lname;
 private long contact;
 private String email;
public int getAuthorid() {
	return authorid;
}
public void setAuthorid(int authorid) {
	this.authorid = authorid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}	

@Override
	public String toString() {
		return "Author [id=" + authorid + ", first_name=" + fname + ", last_name=" + lname + ", Contact="
					+ contact + "]";
}
}
