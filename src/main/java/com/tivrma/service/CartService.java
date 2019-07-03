package com.tivrma.service;

import com.tivrma.domain.CartItem;
import com.tivrma.exception.TivrmaException;

/**
 * @author shriram
 *
 */
public interface CartService {
	
	/**
	 * @param cartItem
	 * @return
	 */
	CartItem createCart(CartItem cartItem) throws TivrmaException;

}
