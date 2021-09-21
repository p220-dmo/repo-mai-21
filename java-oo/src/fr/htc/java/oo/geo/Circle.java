package fr.htc.java.oo.geo;

class Circle {
	public double x, y; // coordonnées du centre
	private double r; // rayon du cercle

	public Circle(double r) {
		this.r = r;
	}

	public double area() {
		return 3.14159 * r * r;
	}
}
