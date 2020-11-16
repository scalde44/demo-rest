package co.edu.usbcali.demo.service;

import java.util.List;

import co.edu.usbcali.demo.domain.ShoppingProduct;

/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org/
 *         www.zathuracode.org
 *
 */
public interface ShoppingProductService extends GenericService<ShoppingProduct, Integer> {

	public Long totalShoppingProductByShoppingCart(Integer carId);

	public Integer totalItems(Integer carId);

	public List<Integer> getShprId(Integer carId, String proId);

	public List<Integer> getShprIdByCarId(Integer carId);

	public List<ShoppingProduct> findShprByCarId(Integer carId);

}