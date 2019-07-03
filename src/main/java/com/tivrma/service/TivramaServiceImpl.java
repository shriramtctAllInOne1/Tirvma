/**
 * The ResourceServer Project, BSD License,Copyright (c) 2019
 * All rights reserved.
**/
package com.tivrma.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tivrma.config.TivrmaSuccesCode;
import com.tivrma.dao.TivramaDAO;
import com.tivrma.domain.Mother;
import com.tivrma.domain.MotherMenu;
import com.tivrma.domain.MotherRating;
import com.tivrma.domain.Order;
import com.tivrma.domain.User;
import com.tivrma.exception.TivrmaException;
import com.tivrma.util.CommonUtility;

/**
 * 
 * Service class for curd operation using mongoTemplate and mongoRepository
 * 
 * @author shriam
 *
 */

@Service
public class TivramaServiceImpl implements TivramaService {

	/**
	 * Logger Object
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(TivramaServiceImpl.class);

	/**
	 * 
	 */
	@Autowired
	TivramaDAO tivramaDAO;

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
	 * Add mother
	 * 
	 * @param mother
	 * @return
	 */
	@Override
	public Mother addMother(Mother mother) throws TivrmaException {
		LOGGER.debug("Entering TivramaServiceImpl.class addMother()");
		Mother motherObj = null;
		try {
			motherObj = tivramaDAO.addMother(mother);
		} catch (TivrmaException e) {
			LOGGER.error("Error while creating mother()");
			throw e;
		}
		return motherObj;
	}

	/**
	 * Crate user
	 * 
	 * @param user
	 * @return
	 * @throws TivrmaException
	 */
	@Override
	public User addUser(User user) throws TivrmaException {
		LOGGER.debug("Entering TivramaServiceImpl.class addUser()");
		User userObj = null;
		try {
			userObj = tivramaDAO.addUser(user);
		} catch (TivrmaException e) {
			LOGGER.error("Error while creating user()");
			throw e;
		}
		return userObj;
	}

	/**
	 * add mother menu
	 * 
	 * @param motherMenu
	 * @return
	 */
	@Override
	public MotherMenu addMotherMenu(MotherMenu motherMenu) throws TivrmaException {
		LOGGER.debug("Entering TivramaServiceImpl.class addMotherMenu()");
		MotherMenu motherMenuObj = null;
		try {
			motherMenuObj = tivramaDAO.addMotherMenu(motherMenu);

		} catch (TivrmaException e) {
			LOGGER.debug("Entering TivramaServiceImpl.class addMotherMenu()");
			throw e;
		}
		return motherMenuObj;
	}

	/**
	 * Create order
	 * 
	 * @param order
	 * @return
	 */
	@Override
	public Order createOrder(Order order) throws TivrmaException {
		LOGGER.debug("Entering TivramaServiceImpl.class createOrder()");
		Order orderObj = null;
		try {
			orderObj = tivramaDAO.createOrder(order);
		} catch (TivrmaException e) {
			LOGGER.debug("Entering TivramaServiceImpl.class createOrder()");
		}
		return orderObj;
	}

	/**
	 * 
	 * Update mother menu
	 * 
	 * @return
	 */
	@Override
	public String updateMotherMenu() {

		return null;
	}

	/**
	 * update user
	 * 
	 * @return
	 */
	@Override
	public String updateUser() {
		return null;
	}

	/**
	 * @return
	 * @throws TivrmaException
	 */
	@Override
	public List<Mother> getAllMother() throws TivrmaException {
		LOGGER.debug("Entering TivramaServiceImpl.class getAllMother()");
		List<Mother> motherList = null;
		try {
			motherList = tivramaDAO.getAllMother();
		} catch (TivrmaException e) {
			LOGGER.error("Entering TivramaServiceImpl.class getAllMother()");
			throw e;
		}
		return motherList;
	}

	/**
	 * @param id
	 * @return
	 * @throws TivrmaException
	 */
	@Override
	public Mother getMotherById(String id) throws TivrmaException {
		Mother mother = null;
		try {
			mother = tivramaDAO.getMotherById(id);
		} catch (TivrmaException e) {
			LOGGER.error("Entering TivramaServiceImpl.class getMotherById()");
			throw e;
		}
		return mother;
	}

	/**
	 * @param id
	 * @return
	 * @throws TivrmaException
	 */
	@Override
	public Map<String, String> getMotherContact(String id) throws TivrmaException {
		Map<String, String> mothersDetailMap = new HashMap<String, String>();
		try {
			mothersDetailMap = tivramaDAO.getMotherContact(id);
		} catch (TivrmaException e) {
			LOGGER.error("Entering TivramaServiceImpl.class getMotherContact()");
			throw e;
		}
		return mothersDetailMap;
	}

	/**
	 * @param motherRating
	 * @return
	 */
	@Override
	public String addMotherRating(MotherRating motherRating) throws TivrmaException {
		LOGGER.debug("Entering TivramaServiceImpl.class addMotherRating()");
		String response = null;
		try {
			MotherRating motherRatingObj = tivramaDAO.addMotherRating(motherRating);
			if (motherRatingObj.getMotherId() != null) {
				response = commonUtility.createSucessResponse(succCode.getSucccode2());
			}
		} catch (TivrmaException e) {
			LOGGER.error("Error while adding mother rating");
			throw e;
		}
		return response;
	}

	/**
	 * @param motherId
	 * @return
	 * @throws TivrmaException
	 */
	@Override
	public MotherRating getMotherRating(String motherId) throws TivrmaException {
		LOGGER.debug("Entering TivramaServiceImpl.class getMotherRating()");
		MotherRating ratingObj=null;
		try {
			ratingObj= tivramaDAO.getMotherRating(motherId);
		}catch(TivrmaException e) {
			LOGGER.error("Error while getting mother rating");
			throw e;
		}
		return ratingObj;
	}

}
