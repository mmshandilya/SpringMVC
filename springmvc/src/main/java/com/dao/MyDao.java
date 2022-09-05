package com.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.model.MyModel;


@Component
	public class MyDao implements MyInt{

		@Autowired
		private HibernateTemplate hibernateTemplate;

		// create
		@Transactional
		public void createProduct(MyModel product) {

			this.hibernateTemplate.save(product);

		}

		// delete the single product
		@Transactional
		public void deleteProduct(int pid) {
			MyModel p = this.hibernateTemplate.load(MyModel.class, pid);
			this.hibernateTemplate.delete(p);
		}

		// get the single product
		public MyModel getProduct(int pid) {
			return this.hibernateTemplate.get(MyModel.class, pid);
		}
	

}
