package com.saiyancoder.saibaman;

import java.util.List;

import com.saiyancoder.saibaman.model.Event;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Rest wrapper of the Meetup API.
 *
 * @author mdumrauf
 *
 */
public interface MeetupService {

	@GET("/self/events?sign=true&photo-host=public&page=20")
	Call<List<Event>> getMyEvents(@Query("key") String key);

}
