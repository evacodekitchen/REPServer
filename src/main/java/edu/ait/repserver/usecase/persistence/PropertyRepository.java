package edu.ait.repserver.usecase.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ait.repserver.usecase.entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {

}
