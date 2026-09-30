package loops_function_object_java01;
//Engine is parent of gear and grand parent of shaft
    class Engine{
    int t=500;
    	
    }
    class Gear extends Engine{
    	
    int n=500;
    }
    class Shaft extends Gear{
    	
    	
    }
public class Inhertence_multi_level {
    
	public static void main(String[] args) {
	Shaft u=new Shaft();
	System.out.println(u.n);

	}

}
