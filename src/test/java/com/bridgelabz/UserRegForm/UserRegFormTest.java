package com.bridgelabz.UserRegForm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegFormTest {
    UserRegForm u1test = new UserRegForm();

 @Test
  public void lastName() {

assertTrue( u1test.lastName("Kv"));

    }

    @Test
    public void emailId() {
     assertTrue(u1test.emailId("ksam071@gmail.com"));
    }

    @Test
    public void passwordtest() {

        assertEquals(true,u1test.password("Sam@7568487077"));

    }
}