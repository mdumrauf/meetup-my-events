package com.saiyancoder.saibaman.model;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;


/**
 * Event DTO.
 *
 * @author mdumrauf
 *
 */
public final class Event {

	private final String id;
	private final String name;
	private final String status;
	private final String link;
	private final String description;
	private final Venue venue;
	private final Group group;
	@SerializedName("waitlist_count")
	private final int waitlistCount;
	@SerializedName("yes_rsvp_count")
	private final int yesRsvpCount;

	public Event(String id, String name, String status, String link, String description,
			Venue venue, Group group, int waitlistCount, int yesRsvpCount) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.link = link;
		this.description = description;
		this.venue = venue;
		this.group = group;
		this.waitlistCount = waitlistCount;
		this.yesRsvpCount = yesRsvpCount;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStatus() {
		return status;
	}

	public String getLink() {
		return link;
	}

	public String getDescription() {
		return description;
	}

	public Venue getVenue() {
		return venue;
	}

	public Group getGroup() {
		return group;
	}

	public int getWaitlistCount() {
		return waitlistCount;
	}

	public int getYesRsvpCount() {
		return yesRsvpCount;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
			.add("id", id)
			.add("name", name)
			.add("status", status)
			.add("link", link)
			.add("description", description)
			.add("venue", venue)
			.add("group", group)
			.add("waitlistCount", waitlistCount)
			.add("yesRsvpCount", yesRsvpCount)
			.toString();
	}

}
