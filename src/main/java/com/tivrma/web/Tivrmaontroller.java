/**
 * The ResourceServer Project, BSD License,Copyright (c) 2019
 * All rights reserved.
**/
package com.tivrma.web;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tivrma.config.ErrorCodeMsgConstant;
import com.tivrma.constant.TivramaConstant;
import com.tivrma.domain.Mother;
import com.tivrma.domain.MotherRating;
import com.tivrma.exception.TivrmaException;
import com.tivrma.service.TivramaService;
import com.tivrma.util.CommonUtility;
import com.tivrma.validator.CustomValidator;

/**
 * 
 * Controller to handle mongo crud opeation
 * 
 * 
 * @author Shriram
 *
 */
@RestController()
public class Tivrmaontroller {

	/**
	 * StockDataAnalyzerservice
	 */
	@Autowired
	TivramaService tivramaService;

	/**
	 * 
	 */
	@Autowired
	CustomValidator validator;

	/**
	 * 
	 */
	@Autowired
	CommonUtility commonUtility;

	@Autowired
	ErrorCodeMsgConstant errormsgConfig;

	/**
	 * Logger Object
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Tivrmaontroller.class);

	/**
	 * Create the mother
	 * 
	 * @param strategy
	 * @return
	 * @throws TivrmaException
	 */
	@PreAuthorize(TivramaConstant.OAUTH)
	@PostMapping(path = "/admin/mother/addMother", consumes = TivramaConstant.CONTENTTYPE, produces = TivramaConstant.CONTENTTYPE)
	public ResponseEntity<Mother> addMother(@RequestBody Mother mother) throws TivrmaException {
		LOGGER.debug("Entering Tivrmaontroller.class addMother()");
		Mother motherResponse = null;
		try {
			motherResponse = tivramaService.addMother(mother);
		} catch (TivrmaException e) {
			LOGGER.error("Error while creating mother");
			throw e;
		}
		return new ResponseEntity<Mother>(motherResponse, HttpStatus.OK);
	}

	/**
	 * Fetch all mother
	 * 
	 * @param strategy
	 * @return
	 * @throws TivrmaException
	 */
	@PreAuthorize(TivramaConstant.OAUTH)
	@GetMapping(path = "/admin/mother/getMother/all", consumes = TivramaConstant.CONTENTTYPE, produces = TivramaConstant.CONTENTTYPE)
	public ResponseEntity<List<Mother>> getAllMother() throws TivrmaException {
		LOGGER.debug("Entering Tivrmaontroller.class getAllMother()");
		List<Mother> motherResponse = null;
		try {
			motherResponse = tivramaService.getAllMother();
		} catch (TivrmaException e) {
			LOGGER.error("Error while fetching all mother");
			throw e;
		}
		return new ResponseEntity<List<Mother>>(motherResponse, HttpStatus.OK);
	}

	/**
	 * Fetch mother by Id
	 * 
	 * @param strategy
	 * @return
	 * @throws TivrmaException
	 */
	@PreAuthorize(TivramaConstant.OAUTH)
	@GetMapping(path = "/admin/mother/getMother/{id}", consumes = TivramaConstant.CONTENTTYPE, produces = TivramaConstant.CONTENTTYPE)
	public ResponseEntity<Mother> getMotherById(@PathVariable String id) throws TivrmaException {
		LOGGER.debug("Entering Tivrmaontroller.class getMotherById()");
		Mother motherResponse = null;
		try {
			motherResponse = tivramaService.getMotherById(id);
		} catch (TivrmaException e) {
			LOGGER.error("Error while find mother by id");
			throw e;
		}
		return new ResponseEntity<Mother>(motherResponse, HttpStatus.OK);
	}

	/**
	 * Fetch mother contact by Id
	 * 
	 * @param strategy
	 * @return
	 * @throws TivrmaException
	 */
	@PreAuthorize(TivramaConstant.OAUTH)
	@GetMapping(path = "/admin/mother/{id}/getContact", consumes = TivramaConstant.CONTENTTYPE, produces = TivramaConstant.CONTENTTYPE)
	public ResponseEntity<Map<String, String>> getMotherContactById(@PathVariable String id) throws TivrmaException {
		LOGGER.debug("Entering Tivrmaontroller.class getMotherContactById()");
		Map<String, String> motherResponse = null;
		try {
			motherResponse = tivramaService.getMotherContact(id);
		} catch (TivrmaException e) {
			LOGGER.error("Error while find mother contact by id");
			throw e;
		}
		return new ResponseEntity<Map<String, String>>(motherResponse, HttpStatus.OK);
	}

	/**
	 * Create the mother
	 * 
	 * @param strategy
	 * @return
	 * @throws TivrmaException
	 */
	@PreAuthorize(TivramaConstant.OAUTH)
	@PostMapping(path = "/admin/mother/addMotherRating", consumes = TivramaConstant.CONTENTTYPE, produces = TivramaConstant.CONTENTTYPE)
	public ResponseEntity<String> addMotherRating(@RequestBody MotherRating motherRating) throws TivrmaException {
		LOGGER.debug("Entering Tivrmaontroller.class addMotherRating()");
		String response = null;
		try {
			response = tivramaService.addMotherRating(motherRating);
		} catch (TivrmaException e) {
			LOGGER.error("Error while creating mother rating");
			throw e;
		}
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@PreAuthorize(TivramaConstant.OAUTH)
	@GetMapping(path = "/admin/mother/{id}/rating", consumes = TivramaConstant.CONTENTTYPE, produces = TivramaConstant.CONTENTTYPE)
	public ResponseEntity<MotherRating> getMotherRating(@PathVariable String id) throws TivrmaException {
		LOGGER.debug("Entering Tivrmaontroller.class getMotherRating()");
		 MotherRating ratingObj=null;
		try {
			ratingObj = tivramaService.getMotherRating(id);
		} catch (TivrmaException e) {
			LOGGER.error("Error while findingn motherrating by id");
			throw e;
		}
		return new ResponseEntity<MotherRating>(ratingObj, HttpStatus.OK);
	}
}
