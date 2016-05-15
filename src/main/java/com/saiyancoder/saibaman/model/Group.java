package com.saiyancoder.saibaman.model;

import com.google.common.base.MoreObjects;

/**
 * Group DTO.
 *
 * @author mdumrauf
 *
 */
public final class Group {

	private final String id;
	private final String name;

	public Group(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
			.add("id", id)
			.add("name", name)
			.toString();
	}
}
