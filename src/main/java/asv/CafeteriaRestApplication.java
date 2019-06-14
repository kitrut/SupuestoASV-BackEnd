package asv;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import asv.services.PedidoService;

@SpringBootApplication
@ComponentScan("asv")
@EnableJpaRepositories(basePackages = "asv.repositories")
@EntityScan(basePackages = "asv.models")
@EnableScheduling
public class CafeteriaRestApplication {
	private static final Logger logger = LoggerFactory.getLogger(CafeteriaRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CafeteriaRestApplication.class, args);
	}
	
	//@Scheduled(cron = "0 0 13 * * *")
	


}
