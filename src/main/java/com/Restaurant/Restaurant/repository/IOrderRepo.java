package com.Restaurant.Restaurant.repository;

import com.Restaurant.Restaurant.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Orders,Integer> {
}
