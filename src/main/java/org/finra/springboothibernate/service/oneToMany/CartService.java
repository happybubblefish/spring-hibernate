package org.finra.springboothibernate.service.oneToMany;

import org.finra.springboothibernate.model.oneToMany.Cart;

public interface CartService {
	public Cart addCart(Cart cart);
	public void deleteCart(Cart cart);
	public Cart findById(Long id);
}
