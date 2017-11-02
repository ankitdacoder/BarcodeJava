package pdf;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
	
		 HashMap hm=new HashMap();
		 
		 for(int i=0;i<=10;i++)
		 {
			 hm.put(i,"Ankit"+i);
						 
		 }
		 
		 Boolean key= hm.containsKey(5);
		 
		 if(key==true)
		 {
		 System.out.println("Value of "+5+" is "+hm.get(5));	 
		 }
		 
//		 hm.put(2, "Verma");
//		 hm.put(3,"Indore");
//		 hm.put(1, "Vicky");
//		 hm.put(4,"Vicky");
		 
		 System.out.println("Hashmap key value is"+hm);
		 

	}

}
