package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Playstation 5", 5999.99));
		list.add(new Product("Iphone 11", 4999.90));
		list.add(new Product("TV Lg", 3999.99));
		list.add(new Product("The Sims 4", 99.90));
		list.add(new Product("Mafia III", 48.50));
		list.add(new Product("Xcom 2", 9.99));
		
		double factor = 1.1;
		
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);

	}

}
