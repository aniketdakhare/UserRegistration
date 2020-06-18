package com.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    @Test
    public void testWelcomeMassage()
    {
        UserRegistration userRegistration = new UserRegistration();
        String massage = userRegistration.welcomeMassage("Display Welcome Massage");
        Assert.assertEquals("Welcome to User Registration Program",massage);
    }
}
