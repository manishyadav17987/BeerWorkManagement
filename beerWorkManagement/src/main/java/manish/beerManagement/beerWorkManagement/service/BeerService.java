package manish.beerManagement.beerWorkManagement.service;

import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import manish.beerManagement.beerWorkManagement.model.BeerDto;

@Component
public interface BeerService {

	public BeerDto getBeerById(UUID beerID);
	public BeerDto saveBeerDto();
}
