package cerchi;

/**
 *
 * @author alex.cazziolato
 */
public class Cerchio {
	private double radius;
	private String color;

	public Cerchio() {
	}

	public Cerchio(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calcolaArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "Cerchio{" + "radius=" + radius + ", color=" + color + '}';
	}
	
	
}
