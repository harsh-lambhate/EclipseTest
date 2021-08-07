package Test;

public class ABC {
	
	ABC()
	{
		System.out.println("Hii this is my first project changes");
	}
	ABC(int a)
	{
		System.out.println("This is parametric constructor");
	}
	
	public static void main(String[] args) {
		
		ABC abc=new ABC();
		ABC abc1=new ABC(4);
		
	}
	
	

}
