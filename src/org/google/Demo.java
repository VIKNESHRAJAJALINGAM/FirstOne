package org.google;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		Practice p = new Practice();
		p.setId(100);
		p.setName("Amal");
		Practice p1 = new Practice();
		p1.setId(200);
		p1.setName("Bala");

		List<Practice> l = new ArrayList<>();
		l.add(p);
		l.add(p1);
		
	  for (int i = 0; i < l.size(); i++) {
		  System.out.println(l.get(i).getId());
		  System.out.println(l.get(i).getName());
	  }
		

	}
}
