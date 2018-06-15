package com.interfaceexample;
public class Shape {
	public static void main(String[] args) {
		Polygon R = new Polygon();
		System.out.println("Area of polygon is" + R.area(12, 4));
		Square S = new Square();
		System.out.println("Area of square is" + S.area(4, 0));

	}

	public interface Area {
		int area(int l, int b);
}
}


