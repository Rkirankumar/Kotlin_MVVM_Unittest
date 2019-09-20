package com.login_mvvm.model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginUserTest {

    LoginUser loginUser;


    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        loginUser = new LoginUser("abc@gmail.com", "12345");
    }

    @Test
    public void emialPassword() {
        assertTrue(loginUser.getStrEmailAddress().equals("abc@gmail.com"));
        assertTrue(loginUser.getStrPassword().equals("12345"));
        assertEquals(loginUser.isPasswordLengthGreaterThan5(), false);
    }

    @Test
    public void ispasswardValid() {
        LoginUser loginUser = new LoginUser("abc@gmail.com", "123455");
        assertEquals(loginUser.isPasswordLengthGreaterThan5(), true);
    }

    @Test
    public void isInvalidpassward() {
        LoginUser loginUser = new LoginUser("abc@gmail.com", "1234");
        assertEquals(loginUser.isPasswordLengthGreaterThan5(), false);
    }

    @Test
    public void isEmail(){
        assertFalse(loginUser.isEmailValid());
    }
}