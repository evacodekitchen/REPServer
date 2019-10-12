package edu.ait.repserver.rest.dto;

import java.io.IOException;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.multipart.MultipartFile;

import edu.ait.repserver.usecase.entity.Property;

@Mapper
public interface PropertyMapper {

	public static PropertyMapper INSTANCE = Mappers.getMapper(PropertyMapper.class);

	Property newPropertyDTOToProperty(NewPropertyDTO newPropertyDTO);

	default byte[] mutipartFileToByteArray(MultipartFile value) {
		try {
			return value.getBytes();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}