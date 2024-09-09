package com.fatihberkant.ecommerce.dao;

import com.fatihberkant.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> { //Burdaki long product'ın id'sinin tipi
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);
    Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable );
    // Behing the scene = Select * From product p Where p.name LIKE CONCAT('%', :name, '%')
}
