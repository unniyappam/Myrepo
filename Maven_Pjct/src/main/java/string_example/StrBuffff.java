package string_example;

public class StrBuffff {

	public static void main(String[] args) {
	  StringBuffer b= new StringBuffer("Hello ");
	  System.out.println(b);
	  StringBuilder b1=new StringBuilder("Farseena");
	  System.out.println(b1);
	  //append()
	  System.out.println(b.append(b1));
	  //insert()
	  System.out.println(b.insert(3,"hi"));
	  System.out.println(b);
	  //replace()
	  System.out.println(b.replace(2, 5, "hi"));
	  //reverse();
	  System.out.println(b.reverse());
	  //delete()
	  System.out.println(b.delete(3, 5));

	}

}
