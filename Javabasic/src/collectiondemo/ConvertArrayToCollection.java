package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input array
		String employee_Arrays[]= {"Ajay","Vijay","Sanjay","Ranvijay"};

		System.out.println(Arrays.toString(employee_Arrays));
		// asList method
		List<String> emplist = Arrays.asList(employee_Arrays);
		System.out.println(emplist);
		// addAll method
		String countryarray[]= {"India","Pakistan","USA","NewZealanad"};
		List<String> countrylist= new ArrayList<String>();
		Collections.addAll(countrylist,countryarray);
		 System.out.println("Converted ArrayList elements: "
                 + countrylist);
		 //List.of() method
		 List<String> cl= new ArrayList<String>(List.of(countryarray));
		 System.out.println(cl);
		
	}

}
