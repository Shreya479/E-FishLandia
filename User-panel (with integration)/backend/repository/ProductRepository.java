package com.examly.springapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.ProductModel;
import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<ProductModel,Integer>{
    
}