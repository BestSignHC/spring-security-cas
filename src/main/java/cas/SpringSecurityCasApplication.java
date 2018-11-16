package cas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityCasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityCasApplication.class, args);
	}
}
