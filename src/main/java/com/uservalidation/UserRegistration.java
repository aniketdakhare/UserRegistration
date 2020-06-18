package com.uservalidation;

import java.util.regex.Pattern;

public class UserRegistration
{
    /**
     * PATTERN FOR NAME
     */
    private static final String NAME_PATTERN = "^[A-Z][A-Za-z0-9]{2,}$";

    /**
     * METHOD TO VALIDATE FIRST NAME
     * @param firstName takes First Name for validation
     * @return value as true
     */
    public boolean validateFirstName(String firstName)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
}

