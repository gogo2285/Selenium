package GB;

public class Prgm_19_mainclass {

	public static void main(String[] args) {
		
		Prgm_19_rectangle r =new Prgm_19_rectangle();
		Triangle t = new Triangle ();
		
		r.set_values(8, 9);
		t.set_values(6, 3);
		
	System.out.println("area of rectangle"+ r.area());
		System.out.println("area of triangle"+ t.area());

	}

}
