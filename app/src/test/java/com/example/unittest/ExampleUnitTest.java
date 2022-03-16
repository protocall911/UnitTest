package com.example.unittest;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import android.widget.EditText;

public class ExampleUnitTest {
    String email = "dayni@mail.com";
    String password = "qwertY1@";
    String confirmPassword = "qwertY1";
    @Test
    public void testIsEmail(){
        Assert.assertThat(String.format("Email невалидный %s", email),
                Utilits.checkEmail(email), is(true));
    }

    @Test
    public void testIsPassword(){
        Assert.assertThat(String.format("Password невалидный %s", password),
                Utilits.checkPassword(password), is(true));
    }
    @Test
    public void testPasswordConfirm(){
        Assert.assertEquals(password,confirmPassword);
    }

}