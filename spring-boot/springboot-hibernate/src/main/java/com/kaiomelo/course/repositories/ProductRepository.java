package com.kaiomelo.course.repositories;

import com.kaiomelo.course.entities.Category;
import com.kaiomelo.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
