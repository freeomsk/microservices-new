package ru.freeomsk.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.freeomsk.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
