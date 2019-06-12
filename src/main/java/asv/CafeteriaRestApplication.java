package asv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("asv")
@EnableJpaRepositories(basePackages = "asv.repositories")
@EntityScan(basePackages = "asv.models")
public class CafeteriaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CafeteriaRestApplication.class, args);
	}

}
