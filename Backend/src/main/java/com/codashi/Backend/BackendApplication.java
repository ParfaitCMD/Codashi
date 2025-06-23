package com.codashi.Backend; // Define o pacote onde esta classe está localizada. Pacotes ajudam a organizar as classes em grupos lógicos.

import org.springframework.boot.SpringApplication; // Importa a classe SpringApplication, que é usada para iniciar a aplicação Spring Boot.

// Anotação que marca esta classe como a principal da aplicação Spring Boot.
// Ela combina três outras anotações:
// @Configuration (indica que a classe pode conter configurações),
// @EnableAutoConfiguration (ativa a configuração automática do Spring Boot),
// @ComponentScan (ativa a varrimento de componentes, permitindo que o Spring encontre e registre beans automaticamente).
public class BackendApplication {

    // Método principal (main), ponto de entrada da aplicação Java.
	// O SpringApplication.run inicializa todo o contexto Spring, configura o servidor embutido (como Tomcat)
	// e inicia a aplicação.
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
