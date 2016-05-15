package com.saiyancoder.saibaman;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.eclipse.jetty.util.log.Log;

import com.saiyancoder.saibaman.http.HttpStatus;
import com.saiyancoder.saibaman.model.Event;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

/**
 * The controller that wraps the Meetup API
 *
 * @author mdumrauf
 *
 */
public final class MeetupController {

	private static MeetupService meetupService;

	static {
		final Retrofit retrofit = new Retrofit.Builder()
			.baseUrl("https://api.meetup.com/")
			.addConverterFactory(GsonConverterFactory.create())
			.build();
		meetupService = retrofit.create(MeetupService.class);
	}

	public static ModelAndView getEvents(Request request, Response response) {
		final String key = request.queryParams("key");

		retrofit2.Response<List<Event>> res;
		try {
			res = meetupService.getMyEvents(key).execute();
		} catch (final IOException e) {
			Log.getLog().debug("Could not retrieve events", e);
			throw new RuntimeException(e);
		}
		response.status(HttpStatus.OK.getCode());

		final HashMap<String, Object> map = new HashMap<>();
		map.put("events", res.body());
		return new ModelAndView(map, "events.vm");
	}

}
