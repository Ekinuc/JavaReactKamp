package nLayeredDemo.bussines.abstracts;

import java.util.List;

import nLayeredDemo.entities.concrates.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
}
