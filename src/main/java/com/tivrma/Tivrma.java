/**
 * The ResourceServer Project, BSD License,Copyright (c) 2019
 * All rights reserved.
**/
package com.tivrma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Shriram
 *
 */
@SpringBootApplication
@ComponentScan("com.tivrma")
public class Tivrma {

	public static void main(String[] args) {
		SpringApplication.run(Tivrma.class);
	}
}
