package com.example.ecom_project.repo;

import com.example.ecom_project.module.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
