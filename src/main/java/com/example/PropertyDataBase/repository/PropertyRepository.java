package com.example.PropertyDataBase.repository;

import com.example.PropertyDataBase.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
    // You can define custom query methods if needed
}
