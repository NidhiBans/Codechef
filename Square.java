package com.interfaceexample;

import com.interfaceexample.Shape.Area;

public class Square implements Area {
	@Override
	public int area(int l, int b) {
		int area = l * l;
		return area;
	}
}


