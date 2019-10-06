package manish.beerManagement.beerWorkManagement.model;

import java.util.UUID;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class BeerDto {
	
	private UUID id;
	private String berName;
	private String beerStyle;
	private Long upc;
	

}
