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
}

