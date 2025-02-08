package com.mostlyrecipes.server.models;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PasswordValidator.class) //tells Spring that PasswordValidator will handle the validation logic
@Target( {ElementType.FIELD }) // specifies that this annotation can only be used on fields
@Retention(RetentionPolicy.RUNTIME) // ensures the annotation is available at runtime
public @interface ValidPassword { // @interface is required when defining an annotation

    String message() default "Password must contain at least one uppercase letter, one lowercase letter, one number and one special character. ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
