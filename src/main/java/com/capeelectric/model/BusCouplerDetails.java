/**
 * 
 */
package com.capeelectric.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author CAPE-SOFTWARE
 *
 */
@Entity
@Table(name = "SUPPLY_CHARACTERISTICS_HV_INCOMING")
public class BusCouplerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BUS_COUPLER_DETAILS_ID")
	private Integer busCouplerDetailsId;
	
	@Column(name = "MANUFACTURER_OCPD")
	private String manufacturerOCPD;
	
	@Column(name = "RATING")
	private Integer rating;
	
	@Column(name = "NO_OF_POLES")
	private String noOfPoles;
	
	@Column(name = "TYPE")
	private String type;
	
	@Column(name = "MANUFACTURER_RELAY")
	private String manufacturerRelay;
	
	@Column(name = "MODEL")
	private String model;
	
	@Column(name = "HIGH_STAGE_OVERCURRENT")
	private Integer highStageOverCurrent;
	
	@Column(name = "OVER_CURRENT_SET_TIME")
	private Integer overCurrentSetTime;
	
	@Column(name = "HIGH_STAGE_EARTH_FAULT")
	private Integer highStageEarthFault;
	
	@Column(name = "EARTH_FAULT_SET_TIME")
	private Integer earthFaultSetTime;

	@Column(name = "OVER_VOLTAGE_PROTECTION")
	private String overVoltageProtection;
	
	@Column(name = "OVER_VOLTAGE_SET_VOLTAGE")
	private Integer overVoltageSetVoltage;
	
	@Column(name = "OVER_VOLTAGE_SET_TIME")
	private Integer overVoltageSetTime;
	
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SUPPLYCHARACTERISTICS_HV_ID")
	private SupplyCharacteristicsHV supplyCharacteristicsHV;

	public Integer getBusCouplerDetailsId() {
		return busCouplerDetailsId;
	}

	public void setBusCouplerDetailsId(Integer busCouplerDetailsId) {
		this.busCouplerDetailsId = busCouplerDetailsId;
	}

	public String getManufacturerOCPD() {
		return manufacturerOCPD;
	}

	public void setManufacturerOCPD(String manufacturerOCPD) {
		this.manufacturerOCPD = manufacturerOCPD;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getNoOfPoles() {
		return noOfPoles;
	}

	public void setNoOfPoles(String noOfPoles) {
		this.noOfPoles = noOfPoles;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturerRelay() {
		return manufacturerRelay;
	}

	public void setManufacturerRelay(String manufacturerRelay) {
		this.manufacturerRelay = manufacturerRelay;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getHighStageOverCurrent() {
		return highStageOverCurrent;
	}

	public void setHighStageOverCurrent(Integer highStageOverCurrent) {
		this.highStageOverCurrent = highStageOverCurrent;
	}

	public Integer getOverCurrentSetTime() {
		return overCurrentSetTime;
	}

	public void setOverCurrentSetTime(Integer overCurrentSetTime) {
		this.overCurrentSetTime = overCurrentSetTime;
	}

	public Integer getHighStageEarthFault() {
		return highStageEarthFault;
	}

	public void setHighStageEarthFault(Integer highStageEarthFault) {
		this.highStageEarthFault = highStageEarthFault;
	}

	public Integer getEarthFaultSetTime() {
		return earthFaultSetTime;
	}

	public void setEarthFaultSetTime(Integer earthFaultSetTime) {
		this.earthFaultSetTime = earthFaultSetTime;
	}

	public String getOverVoltageProtection() {
		return overVoltageProtection;
	}

	public void setOverVoltageProtection(String overVoltageProtection) {
		this.overVoltageProtection = overVoltageProtection;
	}

	public Integer getOverVoltageSetVoltage() {
		return overVoltageSetVoltage;
	}

	public void setOverVoltageSetVoltage(Integer overVoltageSetVoltage) {
		this.overVoltageSetVoltage = overVoltageSetVoltage;
	}

	public Integer getOverVoltageSetTime() {
		return overVoltageSetTime;
	}

	public void setOverVoltageSetTime(Integer overVoltageSetTime) {
		this.overVoltageSetTime = overVoltageSetTime;
	}

	public SupplyCharacteristicsHV getSupplyCharacteristicsHV() {
		return supplyCharacteristicsHV;
	}

	public void setSupplyCharacteristicsHV(SupplyCharacteristicsHV supplyCharacteristicsHV) {
		this.supplyCharacteristicsHV = supplyCharacteristicsHV;
	}

	
}
