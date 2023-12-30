package test;
import java.io.*;
@SuppressWarnings("serial")
public class AdminLoginBean implements Serializable 
{
	private String uName, pWord;
	public AdminLoginBean() {}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getpWord() {
		return pWord;
	}
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
	
}
