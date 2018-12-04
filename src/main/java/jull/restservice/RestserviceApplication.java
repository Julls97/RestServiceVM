package jull.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
//@EnableJpaRepositories("jull.restservice.repository")
//@EntityScan("jull.restservice.entity")
//@EnableWebMvc
@SpringBootApplication(scanBasePackages = "jull.restservice")
public class RestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestserviceApplication.class, args);
	}
}
