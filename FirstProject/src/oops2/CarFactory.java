package oops2;

import java.util.ResourceBundle;

public class CarFactory {

	static Car getCar() {
		Object object = null;
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String className = rb.getString("className");
		System.out.println(className);
		try {
			object = Class.forName(className).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
//		if(rb.getString("className").equals("Alto")) {
//			car = new Alto();
//		}
//		else if(rb.getString("className").equals("Mercedes")) {
//			car = new Mercedes();
//		}
		
		return (Car)object;
	}
	
}
