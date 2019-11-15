
public class Mantik {

	public static void main(String[] args) {
		
		boolean x;
		
		x= true || false;
		System.out.println("X:" +x);
		
		x= true || true;
		System.out.println("X:" +x);
		
		x= false || false;
		System.out.println("X:" +x);
		
		x= true && false;
		System.out.println("X:" +x);
		
		x= true && true;
		System.out.println("X:" +x);
		
		x= false && false;
		System.out.println("X:" +x);
		
		x= !false;
		System.out.println("X:" + x);
	
	}

}
