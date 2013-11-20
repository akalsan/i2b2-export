package edu.emory.cci.aiw.i2b2export.comm;

/*
 * #%L
 * i2b2 Export Service
 * %%
 * Copyright (C) 2013 Emory University
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

import edu.emory.cci.aiw.i2b2export.entity.OutputConfiguration;

/**
 * A bean to communicate save requests from the client. It will generally populated from a JSON object.
 * Encapsulates the i2b2 authentication metadata and the output configuration ID required to complete the request.
 *
 * @author Michel Mansour
 * @since 1.0
 */
public class SaveRequest {

	/*
	 * i2b2 authentication metadata of the user making the request
	 */
	private I2b2AuthMetadata authMetadata;

	/*
	 * the output configuration to save
	 */
	private OutputConfiguration outputConfiguration;

	/**
	 * Gets the i2b2 authentication metadata of the user making the request.
	 *
	 * @return {@link I2b2AuthMetadata} object containing the metadata of the user making the request
	 */
	public I2b2AuthMetadata getAuthMetadata() {
		return authMetadata;
	}

	/**
	 * Sets the i2b2 authentication metadata of the user making the request.
	 *
	 * @param authMetadata contains the i2b2 authentication metadata of the user making the request
	 */
	public void setAuthMetadata(I2b2AuthMetadata authMetadata) {
		this.authMetadata = authMetadata;
	}

	/**
	 * Gets the output configuration to save.
	 *
	 * @return the {@link OutputConfiguration} to save
	 */
	public OutputConfiguration getOutputConfiguration() {
		return outputConfiguration;
	}

	/**
	 * Sets the output configuration to save.
	 *
	 * @param outputConfiguration the output configuration to save
	 */
	public void setOutputConfiguration(OutputConfiguration outputConfiguration) {
		this.outputConfiguration = outputConfiguration;
	}

}
