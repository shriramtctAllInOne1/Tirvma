package com.tivrma.web;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tivrma.config.TivrmaSuccesCode;
import com.tivrma.constant.TivramaConstant;
import com.tivrma.domain.CartItem;
import com.tivrma.exception.TivrmaException;
import com.tivrma.service.CartService;
import com.tivrma.util.CommonUtility;

/**
 * @author shriram
 *
 */
@RestController()
public class CartController {

	/**
	 * Logger Object
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CartController.class);

	@Autowired
	CartService cartService;

	/**
	 * 
	 */
	@Autowired
	TivrmaSuccesCode succCode;

	/**
	 * 
	 */
	@Autowired
	CommonUtility commonUtility;

	/**
	 * Create the mother
	 * 
	 * @param strategy
	 * @return
	 * @throws Exception 
	 */
	@PreAuthorize(TivramaConstant.OAUTH)
	@PostMapping(path = "/admin/cart/addCartItem", consumes = TivramaConstant.CONTENTTYPE, produces = TivramaConstant.CONTENTTYPE)
	public ResponseEntity<String> createCart(@RequestBody String cartItem) throws Exception {
		LOGGER.debug("Entering CartController.class createCart()");
		CartItem cartItemObj = null;
		String response = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			CartItem cartItemObj1 = (CartItem) mapper.readValue(cartItem, CartItem.class);
			cartItemObj = cartService.createCart(cartItemObj1);
			if (cartItemObj.getId() != null) {
				response = commonUtility.createSucessResponse(succCode.getSucccode1());
			}
		} catch (TivrmaException | IOException e) {
			LOGGER.error("Error while creating cartItem");
			throw e;
		}
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

}
