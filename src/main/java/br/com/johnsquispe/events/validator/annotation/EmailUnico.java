package br.com.johnsquispe.events.validator.annotation;

import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailUnico {

    String message() default "Email já está sendo utilizado";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
