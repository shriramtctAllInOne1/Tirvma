package com.tivrma.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.tivrma.config.ErrorCodeMsgConstant;
import com.tivrma.domain.CartItem;
import com.tivrma.exception.TivrmaException;
import com.tivrma.web.CartController;

/**
 * @author shriram
 *
 */
@Component
public class CartDAOImpl implements CartDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(CartDAOImpl.class);

	/**
	 * 
	 */
	@Autowired
	MongoTemplate mongoTemplate;

	/**
	 * 
	 */
	@Autowired
	ErrorCodeMsgConstant errConfig;

	/**
	 * @param cartItem
	 * @return
	 */
	@Override
	public CartItem createCart(CartItem cartItem) throws TivrmaException {
		LOGGER.debug("Entering CartDAOImpl.class createCart()");
		CartItem cartItemObj = null;
		try {
			cartItemObj = mongoTemplate.save(cartItem);
		} catch (Exception e) {
			LOGGER.error("Error saving  createCart()");
			throw new TivrmaException(errConfig.getErrdaocode7(), e.getLocalizedMessage());
		}
		return cartItemObj;
	}

}
