package test;
import java.io.*;
@SuppressWarnings("serial")
public class StudentBean implements Serializable
{
	private String rollNo, lBook="Empty";
	public StudentBean() {}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getlBook() {
		return lBook;
	}
	public void setlBook(String lBook) {
		this.lBook = lBook;
	}
	
}
