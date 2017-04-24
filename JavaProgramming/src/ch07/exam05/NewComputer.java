package ch07.exam05;

public class NewComputer extends Computer{
	@Override
	double circleArea(double radious) {
		return Math.PI * radious * radious;
	}
}
