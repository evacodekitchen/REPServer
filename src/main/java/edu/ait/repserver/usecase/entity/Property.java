package edu.ait.repserver.usecase.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Property {

	private String city;

	private String description;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Lob
	private byte[] picture;

	private Double price;

	private SaleOrRent saleOrRent;

	private String street;

	private PropertyType type;

	public Property() {
	}

	public Property(Long id, PropertyType type, SaleOrRent saleOrRent, Double price, String description, String city,
			String street, byte[] picture) {
		super();
		this.id = id;
		this.setType(type);
		this.saleOrRent = saleOrRent;
		this.price = price;
		this.description = description;
		this.city = city;
		this.street = street;
		this.picture = picture;
	}

	public Property(PropertyType type, SaleOrRent saleOrRent, Double price, String description, String city,
			String street, byte[] picture) {
		super();
		this.setType(type);
		this.saleOrRent = saleOrRent;
		this.price = price;
		this.description = description;
		this.city = city;
		this.street = street;
		this.picture = picture;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Property other = (Property) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (!Arrays.equals(picture, other.picture))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (saleOrRent != other.saleOrRent)
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public String getCity() {
		return city;
	}

	public String getDescription() {
		return description;
	}

	public Long getId() {
		return id;
	}

	public byte[] getPicture() {
		return picture;
	}

	public Double getPrice() {
		return price;
	}

	public SaleOrRent getSaleOrRent() {
		return saleOrRent;
	}

	public String getStreet() {
		return street;
	}

	public PropertyType getType() {
		return type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + Arrays.hashCode(picture);
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((saleOrRent == null) ? 0 : saleOrRent.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setSaleOrRent(SaleOrRent saleOrRent) {
		this.saleOrRent = saleOrRent;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setType(PropertyType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Property [type=" + type + ", city=" + city + ", description=" + description + ", id=" + id
				+ ", picture=" + Arrays.toString(picture) + ", price=" + price + ", saleOrRent=" + saleOrRent
				+ ", street=" + street + "]";
	}

}
