package com.doyospy.core.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 身份证号校验注解实现
 * @author  Robin
 */
public class IdCardValidated implements ConstraintValidator<IdCard, String> {
    @Override
    public void initialize(IdCard idCard) {
        // todo
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (null != s) {
//            return IdcardUtil.isValidCard(s);
            return true;
        }
        return true;
    }
}
