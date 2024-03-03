package com.doyospy.core.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 邮箱校验注解实现
 * @author  Robin
 */
public class EmailValidated implements ConstraintValidator<Email, String> {
    private static final Pattern PATTERN = Pattern.compile("^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((.[a-zA-Z0-9_-]{2,3}){1,2})$");

    @Override
    public void initialize(Email email) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (null != s) {
            Matcher matcher = PATTERN.matcher(s);
            return matcher.find();
        }
        return true;
    }
}
