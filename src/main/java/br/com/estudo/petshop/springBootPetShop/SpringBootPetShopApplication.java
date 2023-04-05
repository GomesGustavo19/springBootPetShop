package br.com.estudo.petshop.springBootPetShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.com.estudo.petshop.springBootPetShop.model")
public class SpringBootPetShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPetShopApplication.class, args);
	}

}
