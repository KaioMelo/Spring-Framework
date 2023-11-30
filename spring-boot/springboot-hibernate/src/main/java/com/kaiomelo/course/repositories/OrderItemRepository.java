package com.kaiomelo.course.repositories;

import com.kaiomelo.course.entities.OrderItem;
import com.kaiomelo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
