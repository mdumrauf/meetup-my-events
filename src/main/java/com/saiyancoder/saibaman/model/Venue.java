package com.saiyancoder.saibaman.model;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

/**
 * Venue DTO.
 *
 * @author mdumrauf
 *
 */
public final class Venue {

	private final String id;
	private final String name;
	private final String lat;
	private final String lon;
	@SerializedName("address_1")
	private final String address1;
	private final String city;
	@SerializedName("localized_country_name")
	private final String countryName;


	public Venue(String id, String name, String lat, String lon, String address1, String city, String countryName) {
		this.id = id;
		this.name = name;
		this.lat = lat;
		this.lon = lon;
		this.address1 = address1;
		this.city = city;
		this.countryName = countryName;
	}


	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLat() {
		return lat;
	}

	public String getLon() {
		return lon;
	}

	public String getAddress1() {
		return address1;
	}

	public String getCity() {
		return city;
	}

	public String getCountryName() {
		return countryName;
	}


	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
			.add("id", id)
			.add("name", name)
			.add("lat", lat)
			.add("lon", lon)
			.add("address1", address1)
			.add("city", city)
			.add("countryName", countryName)
			.toString();
	}


}
