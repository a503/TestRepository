package ch06.homework03;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static{
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS; //  Math.PI 는 자바에서 기본으로 제공하는 상수, 스태틱이기때문에 객체필요없음
	}
}
