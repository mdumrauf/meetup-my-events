package com.saiyancoder.saibaman.http;


/**
 * An object that represents a HTTP status code.
 *
 * @author mdumrauf
 *
 */
public enum HttpStatus {

	OK(200),
	UNAUTHORIZED(401);

	private final int code;

	private HttpStatus(int code) {
		this.code = code;
	}

	/**
	 * Returns the status code.
	 *
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
}
