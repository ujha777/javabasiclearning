package streamtutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//count the number of  name start with 'a' in list
		ArrayList<String> al = new ArrayList<>();
		al.add("Abhijeet");
		al.add("Dom");
		al.add("Alikhya");
		al.add("Adam");
		al.add("Ram");
		int count =0;
		for(int i=0;i<al.size();i++) {
			
			String names = al.get(i);
			if(names.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
		
		//with stream concept
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Abhijeet");
		al1.add("Dom");
		al1.add("Alikhya");
		al1.add("Adam");
		al1.add("Ram");
		
		//assign element of list in stream method
		long c = al1.stream().filter(s->s.startsWith("A")).count();
		System.out.println("with stream concept "+c);
		
		al1.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		al1.stream().filter(s->s.endsWith("a"))
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String> name = Arrays.asList("Gangesh","Ajay","Ram","Bholaa","Asim");
		name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		 
	}
	

	

	
	

}
