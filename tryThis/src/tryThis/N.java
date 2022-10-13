package tryThis;

public class N {
	 int x = 10;
	 int y = 20;
	 int temp;
	
	public void swap() {
		temp = x;  	//	temp = 10
		x = y;		//	x = 20
		y = temp;	//	y = 10;
	}
	
	public static void main(String[] args) {
		N n = new N();
		System.out.println(n.x);
		System.out.println(n.y);
		System.out.println("------------------");
		n.swap();
		System.out.println(n.x);
		System.out.println(n.y);
	}
}
