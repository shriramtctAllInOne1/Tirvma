/**
 * The ResourceServer Project, BSD License,Copyright (c) 2019
 * All rights reserved.
**/
package com.tivrma.dao;

import java.util.List;
import java.util.Map;

import com.tivrma.domain.Mother;
import com.tivrma.domain.MotherMenu;
import com.tivrma.domain.MotherRating;
import com.tivrma.domain.Order;
import com.tivrma.domain.User;
import com.tivrma.exception.TivrmaException;

/**
 * 
 * DAO Layer to handle db operation
 * 
 * @author Shriram
 *
 */
public interface TivramaDAO {

	/**
	 * @param mother
	 * @return
	 * @throws TivrmaException 
	 */
	Mother addMother(Mother mother) throws TivrmaException ;
	
	/**
	 * @return
	 * @throws TivrmaException
	 */
	List<Mother> getAllMother() throws TivrmaException ;
	
	/**
	 * @return
	 * @throws TivrmaException
	 */
	 Mother getMotherById(String id) throws TivrmaException ;
	 
		/**
		 * @return
		 * @throws TivrmaException
		 */
		 Map<String,String> getMotherContact(String id) throws TivrmaException ;
	/**
	 * @param user
	 * @return
	 * @throws TivrmaException 
	 */
	User addUser(User user) throws TivrmaException ;
	/**
	 * @param motherMenu
	 * @return
	 * @throws TivrmaException 
	 */
	MotherMenu addMotherMenu(MotherMenu motherMenu) throws TivrmaException;
	/**
	 * @param order
	 * @return
	 * @throws TivrmaException 
	 */
	Order createOrder(Order order) throws TivrmaException;
	
	/**
	 * @return
	 */
	String updateMotherMenu();
	
	
	/**
	 * @return
	 */
	String updateUser();
	
	/**
	 * @param motherRating
	 * @return
	 */
	MotherRating addMotherRating(MotherRating motherRating) throws TivrmaException;
	
	/**
	 * @param motherRating
	 * @return
	 */
	MotherRating getMotherRating(String motherId) throws TivrmaException;
}
