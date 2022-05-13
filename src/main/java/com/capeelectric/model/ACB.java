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
@Table(name = "ACB")
public class ACB {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ACB_ID")
	private Integer acbId;
	
	@Column(name = "REFERENCE_NAME")
	private String referenceName;
		
	@Column(name = "MANUFACTURER_NAME")
	private String manufacturerName;
	
	@Column(name = "RATING")
	private Integer rating;
	
	@Column(name = "VOLTAGE")
	private Integer voltage;
	
	@Column(name = "NO_OF_POLES")
	private Integer noOfPoles;
	
	@Column(name = "RELAY_MANUFACTURER_NAME")
	private String relayManufacturerName;
	
	@Column(name = "TYPE")
	private String type;
	
	@Column(name = "HIGH_STAGE_CURRENT")
	private String highStageCurrent;
	
	@Column(name = "HIGH_STAGE_CURRENT_SET_TIME")
	private String highStageCurrentSetTime;
	
	@Column(name = "HIGH_STAGE_EARTH_FAULT")
	private String highStageEarthFault;
	
	@Column(name = "HIGH_STAGE_EARTH_FAULT_SET_TIME")
	private String highStageEarthFaultSetTime;
	
	@Column(name = "OUTGOING_SIZE_PHASE")
	private Integer outgoingSizePhase;
	
	@Column(name = "OUTGOING_SIZE_NEUTRAL")
	private Integer outgoingSizeNeutral;
	
	@Column(name = "OUTGOING_SIZE_PROTECTIVE")
	private Integer outgoingSizeProtective;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "acb", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<GeneralTestingACB> generalTestingACB;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "acb", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<SafetyTestingACB> safetyTestingACB;

	public Integer getAcbId() {
		return acbId;
	}

	public void setAcbId(Integer acbId) {
		this.acbId = acbId;
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

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getVoltage() {
		return voltage;
	}

	public void setVoltage(Integer voltage) {
		this.voltage = voltage;
	}

	public Integer getNoOfPoles() {
		return noOfPoles;
	}

	public void setNoOfPoles(Integer noOfPoles) {
		this.noOfPoles = noOfPoles;
	}

	public String getRelayManufacturerName() {
		return relayManufacturerName;
	}

	public void setRelayManufacturerName(String relayManufacturerName) {
		this.relayManufacturerName = relayManufacturerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHighStageCurrent() {
		return highStageCurrent;
	}

	public void setHighStageCurrent(String highStageCurrent) {
		this.highStageCurrent = highStageCurrent;
	}

	public String getHighStageCurrentSetTime() {
		return highStageCurrentSetTime;
	}

	public void setHighStageCurrentSetTime(String highStageCurrentSetTime) {
		this.highStageCurrentSetTime = highStageCurrentSetTime;
	}

	public String getHighStageEarthFault() {
		return highStageEarthFault;
	}

	public void setHighStageEarthFault(String highStageEarthFault) {
		this.highStageEarthFault = highStageEarthFault;
	}

	public String getHighStageEarthFaultSetTime() {
		return highStageEarthFaultSetTime;
	}

	public void setHighStageEarthFaultSetTime(String highStageEarthFaultSetTime) {
		this.highStageEarthFaultSetTime = highStageEarthFaultSetTime;
	}

	public Integer getOutgoingSizePhase() {
		return outgoingSizePhase;
	}

	public void setOutgoingSizePhase(Integer outgoingSizePhase) {
		this.outgoingSizePhase = outgoingSizePhase;
	}

	public Integer getOutgoingSizeNeutral() {
		return outgoingSizeNeutral;
	}

	public void setOutgoingSizeNeutral(Integer outgoingSizeNeutral) {
		this.outgoingSizeNeutral = outgoingSizeNeutral;
	}

	public Integer getOutgoingSizeProtective() {
		return outgoingSizeProtective;
	}

	public void setOutgoingSizeProtective(Integer outgoingSizeProtective) {
		this.outgoingSizeProtective = outgoingSizeProtective;
	}

	public List<GeneralTestingACB> getGeneralTestingACB() {
		return generalTestingACB;
	}

	public void setGeneralTestingACB(List<GeneralTestingACB> generalTestingACB) {
		this.generalTestingACB = generalTestingACB;
	}

	public List<SafetyTestingACB> getSafetyTestingACB() {
		return safetyTestingACB;
	}

	public void setSafetyTestingACB(List<SafetyTestingACB> safetyTestingACB) {
		this.safetyTestingACB = safetyTestingACB;
	}
	
	
	
}
