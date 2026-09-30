package loops_function_object_java01;

public class Object_creation_refreence_variable {
	//static is accessable |||  while variable d is non-static and cannot accsesed without 
	//.... object
    static int b=80; int d=90;
	public static void main(String[] args) {
		int a=60;
		
		//classname EX = new classname();
		Object_creation_refreence_variable l= new Object_creation_refreence_variable();
		System.out.println(a);
		System.out.println(b);
		System.out.println(l.d);

	}

}
