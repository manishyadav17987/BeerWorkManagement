package manish.beerManagement.beerWorkManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
public class BeerWorkManagementApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext context = SpringApplication.run(BeerWorkManagementApplication.class, args);


	}

}
