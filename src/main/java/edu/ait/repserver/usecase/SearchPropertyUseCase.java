package edu.ait.repserver.usecase;

import java.util.Optional;

import edu.ait.repserver.usecase.entity.Property;

public interface SearchPropertyUseCase {

	Optional<Property> findById(Long id);

}
