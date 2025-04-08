package com.springboot.core.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD }) // Annotation này sẽ được apply ở đâu
@Retention(RUNTIME) // Annotation này sẽ được xử lý khi nào
@Constraint(validatedBy = { DobValidator.class }) // class sẽ chịu trách nhiệm validate cho annotation này
public @interface DobConstraint {
    String message() default "Invalid date of birth";

    int min();

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
