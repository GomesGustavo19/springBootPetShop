package br.com.estudo.petshop.springBootPetShop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.OK)
public class PesquisaCepException extends RuntimeException{

    public PesquisaCepException(String ex){super(ex);}
}
