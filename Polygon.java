package com.interfaceexample;

import com.interfaceexample.Shape.Area;

public class Polygon implements Area {
	@Override
	public int area(int l, int b) {
		int area = l * b;
		return area;

	}
}


