package manish.beerManagement.beerWorkManagement.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import manish.beerManagement.beerWorkManagement.model.BeerDto;
import manish.beerManagement.beerWorkManagement.service.BeerService;

@RestController
@RequestMapping("api/v1/beer")
public class BeerController {
	
    @Autowired
	private BeerService beerservice;
	
	
	

	@GetMapping(path="/{beerid}")
	public ResponseEntity<BeerDto> getBeet(@PathVariable("beerid") UUID beerId){
		System.out.println(beerId);

	return new ResponseEntity<BeerDto>(beerservice.getBeerById(beerId), HttpStatus.OK);	
		
	}
	
	@PostMapping
	public ResponseEntity saveBeer(BeerDto beerDto) {
		BeerDto savedBeer=beerservice.saveBeerDto();
		HttpHeaders httpHeader=new HttpHeaders();
		httpHeader.add("location", "api/v1/beer"+savedBeer.getId());
		return new ResponseEntity(httpHeader, HttpStatus.CREATED);
		
	}
	
	
	@PutMapping("/{beerId}")
	@ResponseStatus(code = HttpStatus.OK)
	public void updateBeer(@PathVariable("beerId") UUID beerId) {
		
		System.out.println("Beer updated successfullyu"+beerId);
	}
	
	
	
	@DeleteMapping("/{beerId}")
	public void deleteBeer(@PathVariable("beerId") UUID beerUuid) {
		System.out.println("BeerDeleted  having Id"+beerUuid);
	}
	
	

}
