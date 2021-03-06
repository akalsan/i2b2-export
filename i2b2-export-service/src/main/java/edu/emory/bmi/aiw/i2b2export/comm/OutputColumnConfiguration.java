package edu.emory.bmi.aiw.i2b2export.comm;

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

import edu.emory.bmi.aiw.i2b2export.entity.AggregationType;
import edu.emory.bmi.aiw.i2b2export.entity.DisplayFormat;
import edu.emory.bmi.aiw.i2b2export.entity.I2b2ConceptEntity;
import edu.emory.bmi.aiw.i2b2export.entity.OutputColumnConfigurationEntity;
import org.codehaus.jackson.annotate.JsonBackReference;
import org.eurekaclinical.i2b2.client.comm.I2b2Concept;


/**
 * A JPA entity representing an output column configuration.
 *
 * @author Michel Mansour
 * @since 1.0
 */
public class OutputColumnConfiguration implements
		Comparable<OutputColumnConfiguration> {

	private Long id;

	private OutputConfiguration outputConfig;

	private Integer columnOrder;

	private I2b2Concept i2b2Concept;

	private String columnName;

	private DisplayFormat displayFormat;

	private Integer howMany;

	private Boolean includeUnits;

	private Boolean includeTimeRange;

	private AggregationType aggregation;

	/**
	 * Gets the record's ID.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the output configuration this column configuration belongs to.
	 *
	 * @return the {@link OutputConfiguration} this column configuration belongs to
	 */
	@JsonBackReference
	public OutputConfiguration getOutputConfig() {
		return outputConfig;
	}

	/**
	 * Sets the output configuration this column configuration belongs to.
	 *
	 * @param outputConfig the output configuration
	 */
	@JsonBackReference
	public void setOutputConfig(OutputConfiguration outputConfig) {
		this.outputConfig = outputConfig;
	}

	/**
	 * Gets the order of this column's placement in the output.
	 *
	 * @return the column order
	 */
	public Integer getColumnOrder() {
		return columnOrder;
	}

	/**
	 * Sets the column order.
	 *
	 * @param columnOrder the column order
	 */
	public void setColumnOrder(Integer columnOrder) {
		this.columnOrder = columnOrder;
	}

	/**
	 * Gets the i2b2 concept this column is configured for.
	 *
	 * @return the {@link I2b2Concept} this column is configured for
	 */
	public I2b2Concept getI2b2Concept() {
		return i2b2Concept;
	}

	/**
	 * Sets the i2b2 concept.
	 * @param i2b2Concept the i2b2 concept
	 */
	public void setI2b2Concept(I2b2Concept i2b2Concept) {
		this.i2b2Concept = i2b2Concept;
	}

	/**
	 * Gets the name of the column.
	 *
	 * @return the column name
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * Sets the column name.
	 *
	 * @param columnName the column name
	 */
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	/**
	 * Gets the display format of this column configuration, one of: EXISTENCE, VALUE, or
	 *
	 * @return the {@link DisplayFormat} used by this column configuration
	 */
	public DisplayFormat getDisplayFormat() {
		return displayFormat;
	}

	/**
	 * Sets the display format.
	 *
	 * @param displayFormat the display format
	 */
	public void setDisplayFormat(
			DisplayFormat displayFormat) {
		this.displayFormat = displayFormat;
	}

	/**
	 * Gets how many repetitions of this column to output.
	 *
	 * @return how many repetitions of this column to output
	 */
	public Integer getHowMany() {
		return howMany;
	}

	/**
	 * Sets how many repetitions of this column to output if the display format is {@link DisplayFormat#VALUE}.
	 *
	 * @param howMany how many
	 */
	public void setHowMany(Integer howMany) {
		this.howMany = howMany;
	}

	/**
	 * Gets whether or not to include units if the display format is {@link DisplayFormat#VALUE}
	 * or {@link DisplayFormat#AGGREGATION}.
	 *
	 * @return whether or not to include units
	 */
	public Boolean getIncludeUnits() {
		return includeUnits;
	}

	/**
	 * Sets whether or not to include units.
	 *
	 * @param includeUnits whether or not to include units
	 */
	public void setIncludeUnits(Boolean includeUnits) {
		this.includeUnits = includeUnits;
	}

	/**
	 * Gets whether or not to include the time range if the display format is {@link DisplayFormat#VALUE}.
	 *
	 * @return whether or not to include time range
	 */
	public Boolean getIncludeTimeRange() {
		return includeTimeRange;
	}

	/**
	 * Sets whether or not to include the time range.
	 *
	 * @param includeTimeRange whether or not to include the time range
	 */
	public void setIncludeTimeRange(Boolean includeTimeRange) {
		this.includeTimeRange = includeTimeRange;
	}

	/**
	 * Gets the type of aggregation if the display format is {@link DisplayFormat#AGGREGATION}.
	 *
	 * @return the aggregation type
	 */
	public AggregationType getAggregation() {
		return aggregation;
	}

	/**
	 * Sets the aggregation type.
	 *
	 * @param aggregation the aggregation type
	 */
	public void setAggregation(
			AggregationType aggregation) {
		this.aggregation = aggregation;
	}

	@Override
	public int compareTo(OutputColumnConfiguration other) {
		return this.columnOrder.compareTo(other.getColumnOrder());
	}
	
	OutputColumnConfigurationEntity toEntity() {
		OutputColumnConfigurationEntity result = new OutputColumnConfigurationEntity();
		result.setAggregation(this.aggregation);
		result.setColumnName(this.columnName);
		result.setColumnOrder(this.columnOrder);
		result.setDisplayFormat(this.displayFormat);
		result.setHowMany(this.howMany);
		result.setI2b2Concept(new I2b2ConceptEntity(this.i2b2Concept));
		result.setIncludeTimeRange(this.includeTimeRange);
		result.setIncludeUnits(this.includeUnits);
		return result;
	}
}
