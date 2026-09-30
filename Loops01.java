package loops_function_object_java01;



public class Loops01 {

	public static void main(String[] args) {
		
		
		//for loop=>
		for(int i=1;i<=10;i++){
			System.out.print(i);System.out.print(",");
			
		}
		System.out.println();
		
		
		//while loop=>
		int k=20;
		int j=1;
		while( j<=20){
		System.out.println(j + "X" + k + "=" + j*k );
		j++;
		}
		
		
        //do-while loop=>
		int d=2000;
		do {
			System.out.println("hi your current bank balance is" + d);
			d++;
		}while(d<=2005);
		
		//enhanced for loop=>
		double f[]= {1.2,1.3,1.4,1.5}; //create a array
		for(double i:f) {              //(datatype itteration :arrayname)
			System.out.println(i);
		}
		
	}

}
