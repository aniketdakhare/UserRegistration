package com.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    /**
     * TEST CASES FOR FIRST NAME
     */
    @Test
    public void givenValidFirstNameReturnsTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Aniket");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameStartWithSmallerCaseReturnsFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("aniket");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstNameHasTwoCharacterReturnsFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("An");
        Assert.assertFalse(result);
    }

    /**
     * TEST CASES FOR LAST NAME
     */
    @Test
    public void givenValidLastNameReturnsTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Dakhare");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameStartWithSmallerCaseReturnsFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("dakhare");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameHasTwoCharacterReturnsFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Da");
        Assert.assertFalse(result);
    }
}

