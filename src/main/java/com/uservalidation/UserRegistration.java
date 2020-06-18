package com.uservalidation;

import java.util.regex.Pattern;

public class UserRegistration
{
    /**
     * PATTERN FOR NAME AND EMAIL
     */
    private static final String NAME_PATTERN = "^[A-Z][A-Za-z0-9]{2,}$";
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([.+-]?[0-9a-zA-z])*[@][a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2}$";

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

    /**
     * METHOD TO VALIDATE LAST NAME
     * @param lastName takes Last Name for validation
     * @return value as true
     */
    public boolean validateLastName(String lastName)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    /**
     * METHOD TO VALIDATE EMAIL ID
     * @param email takes Email Id for validation
     * @return value as true
     */
    public boolean validateEmail(String email)
    {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}

