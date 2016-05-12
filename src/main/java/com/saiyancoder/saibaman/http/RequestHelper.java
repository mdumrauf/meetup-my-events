package com.saiyancoder.saibaman.http;

import spark.Request;

/**
 * Helper methods for {@link Request}.
 *
 * @author mdumrauf
 *
 */
public final class RequestHelper {

	private RequestHelper() {
		throw new IllegalStateException("This is a helper class!");
	}

	/**
	 * Checks if the specified request is authenticated.
	 *
	 * @param request
	 * @return true if the {@link Request} is authenticated, false otherwise
	 */
	public static boolean isAuthenticated(Request request) {
		final String authKey = request.queryParams("key");
		return authKey != null && !authKey.isEmpty();
	}

}
