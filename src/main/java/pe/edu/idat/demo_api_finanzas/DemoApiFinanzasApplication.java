package pe.edu.idat.demo_api_finanzas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoApiFinanzasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApiFinanzasApplication.class, args);
	}

}
