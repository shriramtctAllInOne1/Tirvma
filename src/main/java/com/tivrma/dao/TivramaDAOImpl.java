/**
 * The ResourceServer Project, BSD License,Copyright (c) 2019
 * All rights reserved.
**/
package com.tivrma.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.tivrma.config.ErrorCodeMsgConstant;
import com.tivrma.domain.Mother;
import com.tivrma.domain.MotherMenu;
import com.tivrma.domain.MotherRating;
import com.tivrma.domain.Order;
import com.tivrma.domain.User;
import com.tivrma.exception.TivrmaException;

/**
 * DAO layer to perform mongocurd operation using mongoTemplate
 * 
 * @author Shriram
 *
 */
@Component
public class TivramaDAOImpl implements TivramaDAO {

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
	 * Logger Object
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(TivramaDAOImpl.class);

	/**
	 * Add mother
	 * 
	 * @param mother
	 * @return
	 */
	@Override
	public Mother addMother(Mother mother) throws TivrmaException {
		LOGGER.debug("Entering TivramaDAOImpl.class addMother()");
		Mother motherOBJ = null;
		try {
			motherOBJ = mongoTemplate.save(mother);
		} catch (Exception e) {
			LOGGER.error("Error while creating mother()");
			throw new TivrmaException(errConfig.getErrdaocode1(), e.getLocalizedMessage());
		}
		return motherOBJ;
	}

	/**
	 * Crate user
	 * 
	 * @param user
	 * @return
	 */
	@Override
	public User addUser(User user) throws TivrmaException {
		LOGGER.debug("Entering TivramaDAOImpl.class addUser()");
		User userSaved = null;
		try {
			userSaved = mongoTemplate.save(user);
		} catch (Exception e) {
			LOGGER.error("Error while creating user)");
			throw new TivrmaException(errConfig.getErrdaocode2(), e.getLocalizedMessage());
		}

		return userSaved;
	}

	/**
	 * add mother menu
	 * 
	 * @param motherMenu
	 * @return
	 */
	@Override
	public MotherMenu addMotherMenu(MotherMenu motherMenu) throws TivrmaException {
		LOGGER.debug("Entering TivramaDAOImpl.class addMotherMenu()");
		MotherMenu savedMotherMenu = null;
		try {
			savedMotherMenu = mongoTemplate.save(motherMenu);
		} catch (Exception e) {
			LOGGER.error("Error while creating mother menu");
			throw new TivrmaException(errConfig.getErrdaocode3(), e.getLocalizedMessage());
		}
		return savedMotherMenu;
	}

	/**
	 * Create order
	 * 
	 * @param order
	 * @return
	 */
	@Override
	public Order createOrder(Order order) throws TivrmaException {
		LOGGER.debug("Entering TivramaDAOImpl.class createOrder()");
		Order orderObj = null;
		try {
			orderObj = mongoTemplate.save(order);
		} catch (Exception e) {
			LOGGER.error("Error while creating order");
			throw new TivrmaException(errConfig.getErrdaocode4(), e.getLocalizedMessage());
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
		LOGGER.debug("Entering TivramaDAOImpl.class getAllMother()");
		List<Mother> motherList;
		try {
			motherList = mongoTemplate.findAll(Mother.class);
		} catch (Exception e) {
			LOGGER.error("Error find all mothers");
			throw new TivrmaException(errConfig.getErrdaocode4(), e.getLocalizedMessage());
		}
		return motherList;
	}

	/**
	 * @return
	 * @throws TivrmaException
	 */
	@Override
	public Mother getMotherById(String id) throws TivrmaException {
		LOGGER.debug("Entering TivramaDAOImpl.class getMotherById()");
		Mother motherObj = null;
		try {
			motherObj = mongoTemplate.findById(id, Mother.class);
		} catch (Exception e) {
			LOGGER.error("Error while find mother by Id)");
			throw new TivrmaException(errConfig.getErrdaocode5(), e.getLocalizedMessage());
		}
		return motherObj;
	}

	@Override
	public Map<String, String> getMotherContact(String id) throws TivrmaException {
		LOGGER.debug("Entering TivramaDAOImpl.class getMotherContact()");
		Map<String, String> motherDetails = new HashMap<String, String>();
		try {
			Mother motherObj = mongoTemplate.findById(id, Mother.class);
			motherDetails.put("name", motherObj.getName());
			motherDetails.put("mobile", motherObj.getMobile());
			motherDetails.put("address", motherObj.getAddress());
		} catch (Exception e) {
			LOGGER.error("Error while getting mother");
			throw new TivrmaException(errConfig.getErrdaocode6(), e.getLocalizedMessage());
		}
		return motherDetails;
	}

	/**
	 * @param motherRating
	 * @return
	 */
	@Override
	public MotherRating addMotherRating(MotherRating motherRating) throws TivrmaException {
		LOGGER.debug("Entering TivramaDAOImpl.class addMotherRating()");
		MotherRating motehrRating = null;
		try {
			motehrRating = mongoTemplate.save(motherRating);
		} catch (Exception e) {
			LOGGER.error("Error while adding mother rating");
			throw new TivrmaException(errConfig.getErrdaocode7(), e.getLocalizedMessage());
		}
		return motehrRating;
	}

	/**
	 * @param motherId
	 * @return
	 * @throws TivrmaException
	 */
	@Override
	public MotherRating getMotherRating(String motherId) throws TivrmaException {
		LOGGER.debug("Entering TivramaDAOImpl.class getMotherRating()");
		MotherRating motherRating = null;
		try {
			Query query = new Query();
			query.addCriteria(Criteria.where("motherId").is(motherId));
			motherRating = mongoTemplate.findOne(query, MotherRating.class);
		} catch (Exception e) {
			LOGGER.error("Error while getting mother rating");
			throw new TivrmaException(errConfig.getErrdaocode8(), e.getLocalizedMessage());
		}
		return motherRating;
	}

}
