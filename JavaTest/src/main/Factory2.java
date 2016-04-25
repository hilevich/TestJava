package main;

public class Factory2 {
// можливо не зрозумів завдання ... чому створювати новий клас якщо поля попереднього factory можна було занулити ... 
	
	private double weight;
	private double speed;
	private double height;
	private double name;
	private double colore;
	public Factory2(double weight, double speed, double height, double name, double colore) {
		super();
		this.weight = weight;
		this.speed = speed;
		this.height = height;
		this.name = name;
		this.colore = colore;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getName() {
		return name;
	}
	public void setName(double name) {
		this.name = name;
	}
	public double getColore() {
		return colore;
	}
	public void setColore(double colore) {
		this.colore = colore;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(colore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(name);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(speed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factory2 other = (Factory2) obj;
		if (Double.doubleToLongBits(colore) != Double.doubleToLongBits(other.colore))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(name) != Double.doubleToLongBits(other.name))
			return false;
		if (Double.doubleToLongBits(speed) != Double.doubleToLongBits(other.speed))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Factory2 [weight=" + weight + ", speed=" + speed + ", height=" + height + ", name=" + name + ", colore="
				+ colore + "]";
	}










}

