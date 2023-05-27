package br.com.estudo.petshop.springBootPetShop.validations.constrains;

import br.com.estudo.petshop.springBootPetShop.validations.validation.CepValidation;
import jakarta.validation.Constraint;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CepValidation.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Cep {

    String message() default "Digite somente numeros";

    Class<?>[] groups() default {};

    Class<? extends jakarta.validation.Payload>[] payload() default {};

}
