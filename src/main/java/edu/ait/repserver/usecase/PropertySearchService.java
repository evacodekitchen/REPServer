package edu.ait.repserver.usecase;

import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.ait.repserver.usecase.entity.Property;
import edu.ait.repserver.usecase.persistence.PropertyRepository;

@Service
public class PropertySearchService implements SearchPropertyUseCase {

	PropertyRepository propertyRepository;

	public PropertySearchService(PropertyRepository propertyRepository) {
		this.propertyRepository = propertyRepository;
	}

	@Override
	public Optional<Property> findById(Long id) {
		return propertyRepository.findById(id);
	}

}
