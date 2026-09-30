package loops_function_object_java01;

//KRATOS is parent class=>
class KRATOS{
	String k="kratos";
	int level=100;
}
//single level-inhertence=>
class KRAKEN extends KRATOS
{
    String t="praglide";
}


public class Inhertance_single_level {
	public static void main(String[] args) {
		KRATOS n = new KRATOS();
		System.out.println(n.k);
		//System.out.println(n.t); is not posiible..
	}

}
