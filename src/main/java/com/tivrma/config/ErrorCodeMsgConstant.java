package com.tivrma.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * Error constant and msg code
 * 
 * @author shriram
 *
 */

@EnableConfigurationProperties
@PropertySource(value = "classpath:application-errorcodedao.yml")
@ConfigurationProperties(prefix = "errorcodedao")
public class ErrorCodeMsgConstant {

	
	/**
	 * 
	 */
	@Value("${msg}")
	String msg;
	
	/**
	 * 
	 */
	@Value("${msg101}")
	String msg101;
	
	/**
	 * 
	 */
	@Value("${errcode101}")
	String errcode101;
	
	/**
	 * 
	 */
	@Value("${errcode102}")
	String errcode102;
	/**
	 * 
	 */
	@Value("${msgdao1}")
	String msgdao1;
	/**
	 * 
	 */
	@Value("${msgdao2}")
	String msgdao2;
	/**
	 * 
	 */
	@Value("${msgdao3}")
	String msgdao3;
	/**
	 * 
	 */
	@Value("${msgdao4}")
	String msgdao4;
	/**
	 * 
	 */
	@Value("${msgdao5}")
	String msgdao5;
	/**
	 * 
	 */
	@Value("${msgdao6}")
	String msgdao6;
	/**
	 * 
	 */
	@Value("${msgdao7}")
	String msgdao7;
	/**
	 * 
	 */
	@Value("${msgdao8}")
	String msgdao8;
	/**
	 * 
	 */
	@Value("${msgdao9}")
	String msgdao9;
	/**
	 * 
	 */
	@Value("${msgdao10}")
	String msgdao10;
	/**
	 * 
	 */
	@Value("${errdaocode1}")
	String errdaocode1;
	/**
	 * 
	 */
	@Value("${errdaocode2}")
	String errdaocode2;
	/**
	 * 
	 */
	@Value("${errdaocode3}")
	String errdaocode3;
	/**
	 * 
	 */
	@Value("${errdaocode4}")
	String errdaocode4;
	/**
	 * 
	 */
	@Value("${errdaocode5}")
	String errdaocode5;
	/**
	 * 
	 */
	@Value("${errdaocode6}")
	String errdaocode6;
	/**
	 * 
	 */
	@Value("${errdaocode7}")
	String errdaocode7;
	/**
	 * 
	 */
	@Value("${errdaocode8}")
	String errdaocode8;
	/**
	 * 
	 */
	@Value("${errservicecode1}")
	String errservicecode1;
	/**
	 * 
	 */
	@Value("${errservicecode2}")
	String errservicecode2;
	/**
	 * 
	 */
	@Value("${errservicecode3}")
	String errservicecode3;
	/**
	 * 
	 */
	@Value("${errservicecode4}")
	String errservicecode4;
	/**
	 * 
	 */
	@Value("${errservicecode5}")
	String errservicecode5;
	/**
	 * 
	 */
	@Value("${errservicecode6}")
	String errservicecode6;
	/**
	 * 
	 */
	@Value("${errservicecode7}")
	String errservicecode7;
	/**
	 * 
	 */
	@Value("${errservicecode8}")
	String errservicecode8;
	/**
	 * 
	 */
	@Value("${errrestcode1}")
	String errrestcode1;
	/**
	 * 
	 */
	@Value("${errrestcode2}")
	String errrestcode2;
	/**
	 * 
	 */
	@Value("${errrestcode3}")
	String errrestcode3;
	/**
	 * 
	 */
	@Value("${errrestcode4}")
	String errrestcode4;
	/**
	 * 
	 */
	@Value("${errrestcode5}")
	String errrestcode5;
	/**
	 * 
	 */
	@Value("${errrestcode6}")
	String errrestcode6;
	/**
	 * 
	 */
	@Value("${errrestcode7}")
	String errrestcode7;

	public String getMsgdao1() {
		return msgdao1;
	}

	public void setMsgdao1(String msgdao1) {
		this.msgdao1 = msgdao1;
	}

	public String getMsgdao2() {
		return msgdao2;
	}

	public void setMsgdao2(String msgdao2) {
		this.msgdao2 = msgdao2;
	}

	public String getMsgdao3() {
		return msgdao3;
	}

	public void setMsgdao3(String msgdao3) {
		this.msgdao3 = msgdao3;
	}

	public String getMsgdao4() {
		return msgdao4;
	}

	public void setMsgdao4(String msgdao4) {
		this.msgdao4 = msgdao4;
	}

	public String getMsgdao5() {
		return msgdao5;
	}

	public void setMsgdao5(String msgdao5) {
		this.msgdao5 = msgdao5;
	}

	public String getMsgdao6() {
		return msgdao6;
	}

	public void setMsgdao6(String msgdao6) {
		this.msgdao6 = msgdao6;
	}

	public String getMsgdao7() {
		return msgdao7;
	}

	public void setMsgdao7(String msgdao7) {
		this.msgdao7 = msgdao7;
	}

	public String getMsgdao8() {
		return msgdao8;
	}

	public void setMsgdao8(String msgdao8) {
		this.msgdao8 = msgdao8;
	}

	public String getMsgdao9() {
		return msgdao9;
	}

	public void setMsgdao9(String msgdao9) {
		this.msgdao9 = msgdao9;
	}

	public String getMsgdao10() {
		return msgdao10;
	}

	public void setMsgdao10(String msgdao10) {
		this.msgdao10 = msgdao10;
	}

	public String getErrdaocode1() {
		return errdaocode1;
	}

	public void setErrdaocode1(String errdaocode1) {
		this.errdaocode1 = errdaocode1;
	}

	public String getErrdaocode2() {
		return errdaocode2;
	}

	public void setErrdaocode2(String errdaocode2) {
		this.errdaocode2 = errdaocode2;
	}

	public String getErrdaocode3() {
		return errdaocode3;
	}

	public void setErrdaocode3(String errdaocode3) {
		this.errdaocode3 = errdaocode3;
	}

	public String getErrdaocode4() {
		return errdaocode4;
	}

	public void setErrdaocode4(String errdaocode4) {
		this.errdaocode4 = errdaocode4;
	}

	public String getErrdaocode5() {
		return errdaocode5;
	}

	public void setErrdaocode5(String errdaocode5) {
		this.errdaocode5 = errdaocode5;
	}

	public String getErrdaocode6() {
		return errdaocode6;
	}

	public void setErrdaocode6(String errdaocode6) {
		this.errdaocode6 = errdaocode6;
	}

	public String getErrdaocode7() {
		return errdaocode7;
	}

	public void setErrdaocode7(String errdaocode7) {
		this.errdaocode7 = errdaocode7;
	}

	public String getErrdaocode8() {
		return errdaocode8;
	}

	public void setErrdaocode8(String errdaocode8) {
		this.errdaocode8 = errdaocode8;
	}

	public String getErrservicecode1() {
		return errservicecode1;
	}

	public void setErrservicecode1(String errservicecode1) {
		this.errservicecode1 = errservicecode1;
	}

	public String getErrservicecode2() {
		return errservicecode2;
	}

	public void setErrservicecode2(String errservicecode2) {
		this.errservicecode2 = errservicecode2;
	}

	public String getErrservicecode3() {
		return errservicecode3;
	}

	public void setErrservicecode3(String errservicecode3) {
		this.errservicecode3 = errservicecode3;
	}

	public String getErrservicecode4() {
		return errservicecode4;
	}

	public void setErrservicecode4(String errservicecode4) {
		this.errservicecode4 = errservicecode4;
	}

	public String getErrservicecode5() {
		return errservicecode5;
	}

	public void setErrservicecode5(String errservicecode5) {
		this.errservicecode5 = errservicecode5;
	}

	public String getErrservicecode6() {
		return errservicecode6;
	}

	public void setErrservicecode6(String errservicecode6) {
		this.errservicecode6 = errservicecode6;
	}

	public String getErrservicecode7() {
		return errservicecode7;
	}

	public void setErrservicecode7(String errservicecode7) {
		this.errservicecode7 = errservicecode7;
	}

	public String getErrservicecode8() {
		return errservicecode8;
	}

	public void setErrservicecode8(String errservicecode8) {
		this.errservicecode8 = errservicecode8;
	}

	public String getErrrestcode1() {
		return errrestcode1;
	}

	public void setErrrestcode1(String errrestcode1) {
		this.errrestcode1 = errrestcode1;
	}

	public String getErrrestcode2() {
		return errrestcode2;
	}

	public void setErrrestcode2(String errrestcode2) {
		this.errrestcode2 = errrestcode2;
	}

	public String getErrrestcode3() {
		return errrestcode3;
	}

	public void setErrrestcode3(String errrestcode3) {
		this.errrestcode3 = errrestcode3;
	}

	public String getErrrestcode4() {
		return errrestcode4;
	}

	public void setErrrestcode4(String errrestcode4) {
		this.errrestcode4 = errrestcode4;
	}

	public String getErrrestcode5() {
		return errrestcode5;
	}

	public void setErrrestcode5(String errrestcode5) {
		this.errrestcode5 = errrestcode5;
	}

	public String getErrrestcode6() {
		return errrestcode6;
	}

	public void setErrrestcode6(String errrestcode6) {
		this.errrestcode6 = errrestcode6;
	}

	public String getErrrestcode7() {
		return errrestcode7;
	}

	public void setErrrestcode7(String errrestcode7) {
		this.errrestcode7 = errrestcode7;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg101() {
		return msg101;
	}

	public void setMsg101(String msg101) {
		this.msg101 = msg101;
	}

	public String getErrcode101() {
		return errcode101;
	}

	public void setErrcode101(String errcode101) {
		this.errcode101 = errcode101;
	}

	public String getErrcode102() {
		return errcode102;
	}

	public void setErrcode102(String errcode102) {
		this.errcode102 = errcode102;
	}

	@Override
	public String toString() {
		return "ErrorCodeMsgConstant [msgdao1=" + msgdao1 + ", msgdao2=" + msgdao2 + ", msgdao3=" + msgdao3
				+ ", msgdao4=" + msgdao4 + ", msgdao5=" + msgdao5 + ", msgdao6=" + msgdao6 + ", msgdao7=" + msgdao7
				+ ", msgdao8=" + msgdao8 + ", msgdao9=" + msgdao9 + ", msgdao10=" + msgdao10 + ", errdaocode1="
				+ errdaocode1 + ", errdaocode2=" + errdaocode2 + ", errdaocode3=" + errdaocode3 + ", errdaocode4="
				+ errdaocode4 + ", errdaocode5=" + errdaocode5 + ", errdaocode6=" + errdaocode6 + ", errdaocode7="
				+ errdaocode7 + ", errdaocode8=" + errdaocode8 + "]";
	}
}
