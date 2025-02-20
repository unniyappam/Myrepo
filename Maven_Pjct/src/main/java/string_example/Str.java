package string_example;

public class Str {
	

	public static void main(String[] args) {
		String s="Farseena ";
		String s3="JAVA";
		String s4="java";
		String S5="java";
		String s6="selenium";
		System.out.println(s);
		String s1=new String("Hello");
		System.out.println(s1);
		char a[]= {'h','i'};
		String s2= new String(a);
		System.out.println(s2);
       //charAt()
		char c=s.charAt(2);
		System.out.println(c);
		//length()
		int l=s.length();
		System.out.println(l);
		//concat()
		System.out.println(s.concat(s1));
		//contains()
		System.out.println(s.contains("lll"));
		//equals()
		System.out.println(s4.equals(S5));
		System.out.println(S5.equals(s6));
		//equalsignorecase()
		System.out.println(s3.equalsIgnoreCase(s4));
		//touppercase()
		System.out.println(s4.toUpperCase());
		//tolowercase()
		System.out.println(s3.toLowerCase());
		//isempty();
		String q="sss";
		System.out.println(q.isEmpty());
		System.out.println(s4==S5); //equals
		String u=new String("java");
		System.out.println(s4==u);
		//value()
		int f=10;
		String f1=String.valueOf(f); //used for type conversion
		System.out.println(f1);
		
	}

}
