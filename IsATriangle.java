package ex;

public class IsATriangle {

	public static void main(String[] args) {
		System.out.println(checkTriangle(4,5,6));

	}

	public static String checkTriangle(int a, int b, int c) {
		if(a<1|| b<1||c<1) return "Invalid Input Value";
		if(a>200|| b>200||c>200) return "Invalid Input Value";
		if(a!=b && b!=c) return "Scalene";
		return "test";
	}
}
