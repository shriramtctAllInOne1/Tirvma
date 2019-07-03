package com.tivrma.dao;

import com.tivrma.domain.CartItem;
import com.tivrma.exception.TivrmaException;

/**
 * @author shriram
 *
 */
public interface CartDAO {
	
	/**
	 * @param cartItem
	 * @return
	 */
	CartItem createCart(CartItem cartItem) throws TivrmaException;
	

}
