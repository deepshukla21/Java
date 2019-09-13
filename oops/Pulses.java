package com.bridgelabz.oops;

public class Pulses {
private String name;
private double weight;
private double price;

public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public double getWeight() {
	return weight;
}
public void setPrice(double price) {
	this.price = price;
}
public double getPrice() {
	return price;
}
@Override
public String toString() {
	return "Pulses [name=" + name + ", weight=" + weight + ", price=" + price + "]";
}

}
