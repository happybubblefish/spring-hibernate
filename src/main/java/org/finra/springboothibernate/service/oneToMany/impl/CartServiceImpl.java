package org.finra.springboothibernate.service.oneToMany.impl;

import org.finra.springboothibernate.model.oneToMany.Cart;
import org.finra.springboothibernate.repository.oneToMany.CartRepository;
import org.finra.springboothibernate.service.oneToMany.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;
	
	@Override
	public Cart addCart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public void deleteCart(Cart cart) {
		cartRepository.delete(cart);
	}

	@Override
	public Cart findById(Long id) {
		return cartRepository.findById(id).get();
	}
}
