/*
 * #%L
 * Eureka Common
 * %%
 * Copyright (C) 2012 - 2013 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package edu.emory.bmi.aiw.i2b2export.resource;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 *
 * @author Andrew Post
 */
public class HttpStatusException extends WebApplicationException {
	private Status status;

	public HttpStatusException(Status status) {
		super(Response.status(status).entity(status.getReasonPhrase()).type("text/plain").build());
		this.status = status;
	}

	public HttpStatusException(Status status, String message) {
		super(Response.status(status).entity(message).type("text/plain").build());
		this.status = status;
	}

	public HttpStatusException(Status status, Throwable cause) {
		super(cause,
			Response.status(status).entity(cause != null ? cause.getMessage() : status.getReasonPhrase()).type("text/plain").build());
		this.status = status;
	}

	public HttpStatusException(Status status, String message, Throwable cause) {
		super(cause,
			Response.status(status).entity(message).type("text/plain").build());
		this.status = status;
	}
	
	public Status getStatus() {
		return this.status;
	}



}
