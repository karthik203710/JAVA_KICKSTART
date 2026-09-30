package loops_function_object_java01;

interface Mikcal{int dance=100;}
interface Prabudeva{int a=70;}
interface Maheshbabu{int b=50;}
interface Vijay extends Mikcal, Prabudeva, Maheshbabu{}

class Dancer implements Vijay{}

public class Multiple_inhertance {

	public static void main(String[] args) {
		
			Dancer k= new Dancer();
			System.out.println(k.a);
			System.out.println(k.b);
			System.out.print(k.dance);
		}

	}


