package com.mv.SpringCRUD;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//THIS IS A SERVICE CLASS TO 'INSTANTIATE' CRUD METHODS IN THEIR RAW FORMS.

@Service
@Transactional
public class ProductService
{
	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Product product)
	{
		repo.save(product);
	}
	
	public Product get(int id)
	{
		return repo.findById(id).get();
	}
	
	public void delete(int id)
	{
		repo.deleteById(id);
	}
}
