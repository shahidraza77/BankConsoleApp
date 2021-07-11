package com.junit.bankapp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.citibank.dao.UserDAOImplementation;

public class UserRegister {

	@Test
	public void test() {
		UserDAOImplementation dao=new UserDAOImplementation();
		long result=dao.balance("shahid", "shahid@com");
		assertEquals(6000,result);
	}

}
