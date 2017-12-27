package org.sdrc.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"org.sdrc.oauth2.service", "org.sdrc.oauth2.config", "org.sdrc.oauth2.resource"})
@EntityScan("org.sdrc.oauth2.domain")
@EnableJpaRepositories("org.sdrc.oauth2.repository")
public class Oauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2Application.class, args);
	}
}
