package NewFolder;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		al.ensureCapacity(100);
//		int a[] = new int[5];
//		al[0] = 100;
//		int a = 10;
		al.add(10);
		//Autoboxing
		Integer obj = Integer.valueOf(10);
		al.add(obj);
		al.add( (byte) 10); 
		al.add( Byte.valueOf( (byte) 10 ));
		al.add( (short) 10); 
		al.add(100000000000000l);
		al.add(10.20f);
		al.add(100.200);
		al.add('a');
		al.add(true);
		al.add(false);
		al.add(obj);
		al.add( (byte) 10); 
		al.add( Byte.valueOf( (byte) 10 ));
		al.add( (short) 10); 
		al.add(100000000000000l);
		al.add(10.20f);
		al.add(100.200);
		al.add('a');
		al.add(true);
		al.add(false);
		al.add(0, "zero");
		
		System.out.println(al);
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("Java");
		subjects.add("English");
		subjects.add("French");
		subjects.add("Computer Science");
		subjects.add("Chemistry");
		subjects.add("Physics");
		
		subjects.remove(4);
//		subjects.add(true);
		
		System.out.println(subjects);
		
//		ArrayList<int> al2 = new ArrayList<>();
		
		ArrayList<Integer> al3 = new ArrayList<>();
		
		System.out.println(al3);
		
		ArrayList<Byte> al4 = new ArrayList<>();
		
		ArrayList<Short> al5 = new ArrayList<>();
		
		ArrayList<Long> al6 = new ArrayList<>();
		
		ArrayList<Character> al7 = new ArrayList<>();
		
		ArrayList<Boolean> al8 = new ArrayList<>();
		
		ArrayList<Float> al9 = new ArrayList<>();
		
		ArrayList<Double> al10 = new ArrayList<>();
	}

}
