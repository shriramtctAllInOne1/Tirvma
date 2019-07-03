package com.tivrma.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@EnableConfigurationProperties
@PropertySource(value = "classpath:application-errorcodedao.yml")
@ConfigurationProperties(prefix = "succcode")
public class TivrmaSuccesCode {

	/**
	 * 
	 */
	@Value("${succmsg}")
	String succmsg;

	/**
	 * 
	 */
	@Value("${succcode1}")
	public String succcode1;
	/**
	 * 
	 */
	@Value("${succcode2}")
	public String succcode2;
	/**
	 * 
	 */
	@Value("${succcode3}")
	public String succcode3;

	/**
	 * 
	 */
	@Value("${succcode4}")
	public String succcode4;

	/**
	 * 
	 */
	@Value("${succcode5}")
	public String succcode5;

	/**
	 * 
	 */
	@Value("${succcode6}")
	public String succcode6;

	/**
	 * 
	 */
	@Value("${succcode7}")
	public String succcode7;

	/**
	 * 
	 */
	@Value("${succcode8}")
	public String succcode8;

	/**
	 * 
	 */
	@Value("${succcode9}")
	public String succcode9;

	/**
	 * 
	 */
	@Value("${succcode10}")
	public String succcode10;

	/**
	 * 
	 */
	@Value("${succcode11}")
	public String succcode11;

	/**
	 * 
	 */
	@Value("${succcode12}")
	public String succcode12;

	public String getSuccmsg() {
		return succmsg;
	}

	public void setSuccmsg(String succmsg) {
		this.succmsg = succmsg;
	}

	public String getSucccode1() {
		return succcode1;
	}

	public void setSucccode1(String succcode1) {
		this.succcode1 = succcode1;
	}

	public String getSucccode2() {
		return succcode2;
	}

	public void setSucccode2(String succcode2) {
		this.succcode2 = succcode2;
	}

	public String getSucccode3() {
		return succcode3;
	}

	public void setSucccode3(String succcode3) {
		this.succcode3 = succcode3;
	}

	public String getSucccode4() {
		return succcode4;
	}

	public void setSucccode4(String succcode4) {
		this.succcode4 = succcode4;
	}

	public String getSucccode5() {
		return succcode5;
	}

	public void setSucccode5(String succcode5) {
		this.succcode5 = succcode5;
	}

	public String getSucccode6() {
		return succcode6;
	}

	public void setSucccode6(String succcode6) {
		this.succcode6 = succcode6;
	}

	public String getSucccode7() {
		return succcode7;
	}

	public void setSucccode7(String succcode7) {
		this.succcode7 = succcode7;
	}

	public String getSucccode8() {
		return succcode8;
	}

	public void setSucccode8(String succcode8) {
		this.succcode8 = succcode8;
	}

	public String getSucccode9() {
		return succcode9;
	}

	public void setSucccode9(String succcode9) {
		this.succcode9 = succcode9;
	}

	public String getSucccode10() {
		return succcode10;
	}

	public void setSucccode10(String succcode10) {
		this.succcode10 = succcode10;
	}

	public String getSucccode11() {
		return succcode11;
	}

	public void setSucccode11(String succcode11) {
		this.succcode11 = succcode11;
	}

	public String getSucccode12() {
		return succcode12;
	}

	public void setSucccode12(String succcode12) {
		this.succcode12 = succcode12;
	}

}
