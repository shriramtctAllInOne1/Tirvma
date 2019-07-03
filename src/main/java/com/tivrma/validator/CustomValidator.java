package com.tivrma.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.tivrma.dto.TivrmaDTO;
import com.tivrma.util.CommonUtility;


@Component
public class CustomValidator implements Validator   {
	
	/**
	 * 
	 */
	@Autowired
	CommonUtility commonUtility;
	
	/**
	 * @param clazz
	 * @return
	 */
	@Override
    public boolean supports(Class<?> clazz) {
        return TivrmaDTO.class.equals(clazz);
    }
 
    @Override
    public void validate(Object obj, Errors errors) {
    	TivrmaDTO tirmadto = (TivrmaDTO) obj;
    	


    }
 
   

}
