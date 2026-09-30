package java_02basics;

class java_02 {

	public static void main(String[] args) {
		byte b=20;
		short s=4;
		char c='c';
		int i=6;
		float f=35.79f;
		long l=786775657;
		double d=8.98674258;
		String S="karthik";
		boolean o=true;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(f);
		System.out.println(l);
		System.out.println(d);
		System.out.println(S);
		System.out.println(o);

		System.out.println((b+i));
		System.out.println("hi this is " + S);
		
		for(int k=0; k<=b;k++) {
			System.out.print(k);
			System.out.print(",");
		}
		System.out.println();
		if(S=="karthik") {
			System.out.println("hi sir welcome , this is ROG tech AI");
		}
		else if(S=="gamezone") {
			System.out.println("game interpration is completed and your codebase is ready");
		}
		else {
			System.out.println("ERORR 404 code currupt");
		}
	}

}
