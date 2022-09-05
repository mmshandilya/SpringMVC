package com.dao;

import com.model.MyModel;

public interface MyInt {
	public void createProduct(MyModel p);
	
	//public List<Person> listPersons();
	public MyModel getProduct(int id);
	public void deleteProduct(int id);

}
