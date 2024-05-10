package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(20);
		ll.add(22);
		ll.add(46);
		ll.add(3);

		Integer min = Collections.min(ll);
		Integer max = Collections.max(ll);
		if (min==max) {
			System.out.println("Equals elements");
		}
		else
		{
			System.out.println(min+"   "+max);
		}


	}

}
