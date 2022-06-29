package com.cg.collection;

import java.util.HashSet;

public class Product {
	int id;
	String Name;

	public Product(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	public Product() {
		super();
	}

	public static void main(String[] args) {
		HashSet<Product> al = new HashSet<Product>();
		Product p1 = new Product(1, "Mask");
		Product p2 = new Product(2, "Mask");
		Product p3 = new Product(3, "Mask");
		Product p4 = new Product(4, "Mask");
		Product p5 = new Product(5, "cap");
		Product p6 = new Product(6, "cap");

		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		al.add(p6);

		for (Product product : al) {
			System.out.println(product);
		}

	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + "]";
	}

}
