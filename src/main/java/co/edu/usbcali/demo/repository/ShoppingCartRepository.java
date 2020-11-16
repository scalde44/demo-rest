package co.edu.usbcali.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.usbcali.demo.domain.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer>{
	@Query("SELECT shca FROM ShoppingCart shca WHERE shca.customer.email=:email")
	public List<ShoppingCart> findShcaByEmail(String email);
}
