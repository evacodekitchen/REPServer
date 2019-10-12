package edu.ait.repserver.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ait.repserver.rest.dto.NewPropertyDTO;
import edu.ait.repserver.rest.dto.PropertyMapper;
import edu.ait.repserver.usecase.CreatePropertyUseCase;
import edu.ait.repserver.usecase.SearchPropertyUseCase;
import edu.ait.repserver.usecase.entity.Property;

@RestController
@RequestMapping("/api/v1/properties")
public class PropertyController {
	
	CreatePropertyUseCase createPropertyUseCase;
	private SearchPropertyUseCase searchPropertyUseCase;

	public PropertyController(CreatePropertyUseCase createPropertyUseCase, SearchPropertyUseCase searchPropertyUseCase) {
		this.createPropertyUseCase = createPropertyUseCase;
		this.searchPropertyUseCase = searchPropertyUseCase;
	}

	@PostMapping
	public Property createProperty(@ModelAttribute NewPropertyDTO newPropertyDTO) {
		Property propertyToBeAdded = PropertyMapper.INSTANCE.newPropertyDTOToProperty(newPropertyDTO);
		return createPropertyUseCase.create(propertyToBeAdded);
	}
	
	@GetMapping("/{id}")
	public Property getById(@PathVariable Long id) {
		return searchPropertyUseCase.findById(id).get();
	}
	

}
