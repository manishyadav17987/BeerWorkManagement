package manish.beerManagement.beerWorkManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BeerWorkManagementApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext context = SpringApplication.run(BeerWorkManagementApplication.class, args);


	}

}
