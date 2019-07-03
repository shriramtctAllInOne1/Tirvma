package com.tivrma.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tivrma.config.TivrmaSuccesCode;
import com.tivrma.dao.CartDAO;
import com.tivrma.domain.CartItem;
import com.tivrma.exception.TivrmaException;
import com.tivrma.util.CommonUtility;

/**
 * @author shriram
 *
 */

@Service
public class CartServiceImpl implements CartService {

	/**
	 * Logger Object
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CartServiceImpl.class);

	/**
	 * 
	 */
	@Autowired
	CartDAO cartDAO;

	/**
	 * 
	 */
	@Autowired
	CommonUtility commonUtility;

	/**
	 * 
	 */
	@Autowired
	TivrmaSuccesCode succCode;

	/**
	 * @param cartItem
	 * @return
	 * @throws TivrmaException
	 */
	@Override
	public CartItem createCart(CartItem cartItem) throws TivrmaException {
		LOGGER.debug("Entering CartServiceImpl.class createCart()");
		CartItem cartItemObj = null;
		try {
			cartItem = cartDAO.createCart(cartItem);
		} catch (TivrmaException e) {
			LOGGER.error("Error while saving card item");
			throw e;
		}
		return cartItemObj;
	}

}
