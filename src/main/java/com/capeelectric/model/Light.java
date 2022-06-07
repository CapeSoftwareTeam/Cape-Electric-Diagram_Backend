/**
 * 
 */
package com.capeelectric.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author CAPE-SOFTWARE
 *
 */
@Entity
@Table(name = "LIGHT")
public class Light {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LIGHT_ID")
	private Integer lightId;
	
	@Column(name = "REFERENCE_NAME")
	private String referenceName;
		
	@Column(name = "MANUFACTURER_NAME")
	private String manufacturerName;
	
	@Column(name = "POWER_CAPACITY")
	private Integer powerCapacity;
	
	@Column(name = "CURRENT_RATING")
	private Integer currentRating;
	
	@Column(name = "VOLTAGE")
	private Integer voltage;
	
	@Column(name = "TYPE")
	private Integer type;
	
	@Column(name = "INCOMING_SIZE_PHASE")
	private String incomingSizePhase;
	
	@Column(name = "INCOMING_SIZE_NEUTRAL")
	private String incomingSizeNeutral;
	
	@Column(name = "INCOMING_SIZE_PROTECTIVE")
	private Integer incomingSizeProtective;
	
	@Column(name = "INCOMING_LENGTH_PHASE")
	private String incomingLengthPhase;
	
	@Column(name = "INCOMING_LENGTH_NEUTRAL")
	private Integer incomingLengthNeutral;
	
	@Column(name = "INCOMING_LENGTH_PROTECTIVE")
	private String incomingLengthProtective;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "light", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<GeneralTestingLight> generalTestingLight;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "light", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<SafetyTestingLight> safetyTestingLight;

	public Integer getLightId() {
		return lightId;
	}

	public void setLightId(Integer lightId) {
		this.lightId = lightId;
	}

	public String getReferenceName() {
		return referenceName;
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public Integer getPowerCapacity() {
		return powerCapacity;
	}

	public void setPowerCapacity(Integer powerCapacity) {
		this.powerCapacity = powerCapacity;
	}

	public Integer getCurrentRating() {
		return currentRating;
	}

	public void setCurrentRating(Integer currentRating) {
		this.currentRating = currentRating;
	}

	public Integer getVoltage() {
		return voltage;
	}

	public void setVoltage(Integer voltage) {
		this.voltage = voltage;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getIncomingSizePhase() {
		return incomingSizePhase;
	}

	public void setIncomingSizePhase(String incomingSizePhase) {
		this.incomingSizePhase = incomingSizePhase;
	}

	public String getIncomingSizeNeutral() {
		return incomingSizeNeutral;
	}

	public void setIncomingSizeNeutral(String incomingSizeNeutral) {
		this.incomingSizeNeutral = incomingSizeNeutral;
	}

	public Integer getIncomingSizeProtective() {
		return incomingSizeProtective;
	}

	public void setIncomingSizeProtective(Integer incomingSizeProtective) {
		this.incomingSizeProtective = incomingSizeProtective;
	}

	public String getIncomingLengthPhase() {
		return incomingLengthPhase;
	}

	public void setIncomingLengthPhase(String incomingLengthPhase) {
		this.incomingLengthPhase = incomingLengthPhase;
	}

	public Integer getIncomingLengthNeutral() {
		return incomingLengthNeutral;
	}

	public void setIncomingLengthNeutral(Integer incomingLengthNeutral) {
		this.incomingLengthNeutral = incomingLengthNeutral;
	}

	public String getIncomingLengthProtective() {
		return incomingLengthProtective;
	}

	public void setIncomingLengthProtective(String incomingLengthProtective) {
		this.incomingLengthProtective = incomingLengthProtective;
	}

	public List<GeneralTestingLight> getGeneralTestingLight() {
		return generalTestingLight;
	}

	public void setGeneralTestingLight(List<GeneralTestingLight> generalTestingLight) {
		this.generalTestingLight = generalTestingLight;
	}

	public List<SafetyTestingLight> getSafetyTestingLight() {
		return safetyTestingLight;
	}

	public void setSafetyTestingLight(List<SafetyTestingLight> safetyTestingLight) {
		this.safetyTestingLight = safetyTestingLight;
	}
	

}
