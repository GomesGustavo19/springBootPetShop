package br.com.estudo.petshop.springBootPetShop.validations.validation;


import br.com.estudo.petshop.springBootPetShop.exception.PesquisaCepException;
import br.com.estudo.petshop.springBootPetShop.validations.constrains.Cep;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CepValidation implements ConstraintValidator<Cep, String> {

    @Override
    public void initialize(Cep constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        String cep = s;

        if (cep == null) throw new PesquisaCepException("Cep informado é invaliado");

        return cep.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
