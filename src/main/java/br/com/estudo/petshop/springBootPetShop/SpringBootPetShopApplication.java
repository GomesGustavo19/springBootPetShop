package br.com.estudo.petshop.springBootPetShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "br.com.estudo.petshop.springBootPetShop.model")
@SpringBootApplication
public class SpringBootPetShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPetShopApplication.class, args);
	}

}
