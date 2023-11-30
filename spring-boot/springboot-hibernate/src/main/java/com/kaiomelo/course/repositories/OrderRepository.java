package com.kaiomelo.course.repositories;

import com.kaiomelo.course.entities.Order;
import com.kaiomelo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
