package oops2;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

	public static void main(String[] args) {
		
		String language = "hn";
		String country = "IN";
		
		Locale locale = new Locale(language, country);
		ResourceBundle rb = ResourceBundle.getBundle("messages", locale);
//		"messages_<language>_<country>.properties"
		
		System.out.println(rb.getString("hello") + " " + rb.getString("world"));

	}

}
