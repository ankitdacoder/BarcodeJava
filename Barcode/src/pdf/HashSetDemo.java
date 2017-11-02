package pdf;

import java.util.HashSet;

 class Book{

   String number;
	String name,address;
	
	public Book(String number,String name,String address)
	{
		 this.number=number;
		 this.name=name;
		 this.address=address;
		
	}
 }



public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Book> stringSet=new HashSet<Book>(8);
      
		Book b1=new Book("8120836123","ANkit", "Indore"); 
		 stringSet.add(b1);
 
	}

}
