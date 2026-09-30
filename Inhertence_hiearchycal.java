package loops_function_object_java01;
class  Parent{
	int age=20;
}
class  Child1 extends Parent{
	
}
class Child2 extends Parent{
	
}
//public class starts here==>:::::::::::
public class Inhertence_hiearchycal {

	public static void main(String[] args) {
	//object of child1
	Child1 o =new Child1();
	System.out.println(o.age);
	
	//object of child2
    Child2 n=new Child2();
    System.out.println(n.age);
	}

}
