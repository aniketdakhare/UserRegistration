package com.uservalidation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest
{
    UserRegistration userRegistration;

    @Before
    public void objectOf_UserRegistrationClass()
    {
        userRegistration = new UserRegistration();
    }

    @Test
    public void givenValidFirstName_ReturnsTrue()
    {
        boolean result = userRegistration.validateFirstName("Aniket");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_StartWithSmallerCase_ReturnsFalse()
    {
        boolean result = userRegistration.validateFirstName("aniket");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_HasTwoCharacter_ReturnsFalse()
    {
        boolean result = userRegistration.validateFirstName("An");
        Assert.assertFalse(result);
    }

    /**
     * TEST CASES FOR LAST NAME
     */
    @Test
    public void givenValidLastName_ReturnsTrue()
    {
        boolean result = userRegistration.validateLastName("Dakhare");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_StartWithSmallerCase_ReturnsFalse()
    {
        boolean result = userRegistration.validateLastName("dakhare");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_HasTwoCharacter_ReturnsFalse()
    {
        boolean result = userRegistration.validateLastName("Da");
        Assert.assertFalse(result);
    }

    /**
     * TEST CASES FOR MOBILE NUMBER
     */
    @Test
    public void givenMobileNumber_InPreDefinedFormat_ReturnsTrue()
    {
        boolean result = userRegistration.validateMobileNumber("92 9999999999");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WithNineDigit_ReturnsFalse()
    {
        boolean result = userRegistration.validateMobileNumber("92 888888888");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WithoutSpace_ReturnsFalse()
    {
        boolean result = userRegistration.validateMobileNumber("928888888889");
        Assert.assertFalse(result);
    }

}

