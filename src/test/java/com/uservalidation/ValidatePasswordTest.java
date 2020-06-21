package com.uservalidation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * TEST CASE FOR PASSWORD
 */
@RunWith(Parameterized.class)
public class ValidatePasswordTest
{
    private String passwordForTest;
    private boolean expectedResult;

    public ValidatePasswordTest(String passwordForTest, boolean result)
    {
        this.passwordForTest = passwordForTest;
        this.expectedResult = result;
    }

    @Test
    public void givenValidAndInvalidEmailId_ShouldReturnAsPerResult()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validPassword(this.passwordForTest);
        Assert.assertEquals(this.expectedResult,result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data()
    {
        Object[][] data = new Object[][]{
                {"Aniket@3456", true},
                {"Aniket@5", true},
                {"Anik@t9", false},
                {"anik@t4566", false},
                {"ani@et", false},
                {"Anikethj@hk", false},
                {"7777@77777", false},
                {"Aniket345", false},
                {"#$%&*$#@567", false}
                };

        return Arrays.asList(data);
    }
}

