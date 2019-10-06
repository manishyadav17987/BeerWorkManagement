package manish.beerManagement.beerWorkManagement.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import manish.beerManagement.beerWorkManagement.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {
	
	@Override
	public BeerDto getBeerById(UUID beerID) {
		return BeerDto.builder().id(UUID.randomUUID())
		.berName("Beera")
		.beerStyle("indianHardCode").build();
	}

	@Override
	public BeerDto saveBeerDto() {
	
		return BeerDto.builder().id(UUID.randomUUID())
				.berName("americanbeer").beerStyle("AlexKeeth")
				.build();
	}
}
