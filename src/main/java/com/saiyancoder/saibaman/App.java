package com.saiyancoder.saibaman;

import static com.saiyancoder.saibaman.http.RequestHelper.isAuthenticated;
import static spark.Spark.before;
import static spark.Spark.get;
import static spark.Spark.halt;

import com.saiyancoder.saibaman.http.HttpStatus;

import spark.template.velocity.VelocityTemplateEngine;

/**
 * Main Spark router.
 *
 * @author mdumrauf
 *
 */
public class App {

	public static void main(String[] args) {

		before((request, response) -> {
		    if (!isAuthenticated(request)) {
		        halt(HttpStatus.UNAUTHORIZED.getCode(), "Auth key is missing!");
		    }
		});

		get("/events", MeetupController::getEvents, new VelocityTemplateEngine());

	}
}
