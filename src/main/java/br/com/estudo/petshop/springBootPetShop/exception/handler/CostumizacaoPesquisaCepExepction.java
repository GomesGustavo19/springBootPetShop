package br.com.estudo.petshop.springBootPetShop.exception.handler;

import br.com.estudo.petshop.springBootPetShop.exception.PesquisaCepException;
import br.com.estudo.petshop.springBootPetShop.exception.response.PesquisaCepResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice
public class CostumizacaoPesquisaCepExepction extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PesquisaCepException.class)
    public final ResponseEntity<PesquisaCepResponse> PesquisaCepExepction(Exception ex, WebRequest request){

        PesquisaCepResponse response = new PesquisaCepResponse(new Date(), ex.getMessage(),request.getDescription(false));

        return new ResponseEntity<>(response, HttpStatus.OK);

    }

}
