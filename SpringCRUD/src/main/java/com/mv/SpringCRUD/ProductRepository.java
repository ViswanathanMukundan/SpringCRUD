package com.mv.SpringCRUD;

import org.springframework.data.jpa.repository.JpaRepository;

//THIS INTERFACE EXTENDS THE JpaRepository INTERFACE WHICH CONTAINS ALL THE CRUD METHODS THAT CAN BE PERFORMED
//ON A DATABASE TABLE

public interface ProductRepository extends JpaRepository<Product, Integer>
{

}
