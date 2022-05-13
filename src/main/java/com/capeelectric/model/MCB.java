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
@Table(name = "MCB")
public class MCB {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MCB_ID")
	private Integer mcbID;
	
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
	
	@Column(name = "CURRENT_CURVE")
	private Integer currentCurve;
	
	@Column(name = "OUTGOING_SIZE_PHASE")
	private Integer outgoingSizePhase;
	
	@Column(name = "OUTGOING_SIZE_NEUTRAL")
	private Integer outgoingSizeNeutral;
	
	@Column(name = "OUTGOING_SIZE_PROTECTIVE")
	private Integer outgoingSizeProtective;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "mcb", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<GeneralTestingMCB> generalTestingMCB;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "mcb", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<SafetyTestingMCB> safetyTestingMCB;

	public Integer getMcbID() {
		return mcbID;
	}

	public void setMcbID(Integer mcbID) {
		this.mcbID = mcbID;
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

	public Integer getCurrentCurve() {
		return currentCurve;
	}

	public void setCurrentCurve(Integer currentCurve) {
		this.currentCurve = currentCurve;
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

	public List<GeneralTestingMCB> getGeneralTestingMCB() {
		return generalTestingMCB;
	}

	public void setGeneralTestingMCB(List<GeneralTestingMCB> generalTestingMCB) {
		this.generalTestingMCB = generalTestingMCB;
	}

	public List<SafetyTestingMCB> getSafetyTestingMCB() {
		return safetyTestingMCB;
	}

	public void setSafetyTestingMCB(List<SafetyTestingMCB> safetyTestingMCB) {
		this.safetyTestingMCB = safetyTestingMCB;
	}
	
	
}
