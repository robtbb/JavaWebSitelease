package com.chivunk;

import com.chivunk.service.GeolocalizacaoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChivunkApplication {

	public static void main(String[] args) {


		SpringApplication.run(ChivunkApplication.class, args);

		// Criar um objeto do serviço de geolocalização
		GeolocalizacaoService localizacaoServico = new GeolocalizacaoService();
		localizacaoServico.mostrarLocalizacaoAtual();
	}

}
