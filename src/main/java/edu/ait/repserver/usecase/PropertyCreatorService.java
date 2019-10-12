package edu.ait.repserver.usecase;

import org.springframework.stereotype.Service;

import edu.ait.repserver.usecase.entity.Property;
import edu.ait.repserver.usecase.persistence.PropertyRepository;

@Service
public class PropertyCreatorService implements CreatePropertyUseCase {

	public PropertyCreatorService(PropertyRepository propertyRepository) {

		this.propertyRepository = propertyRepository;
	}

	PropertyRepository propertyRepository;

	@Override
	public Property create(Property propertyToBeAdded) {
		return propertyRepository.save(propertyToBeAdded);
	}

}
