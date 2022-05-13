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
@Table(name = "RCBO")
public class RCBO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RCBO_ID")
	private Integer rcboId;
	
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
	
	@Column(name = "RESIDUAL_CURRENT")
	private Integer residualCurrent;
	
	@Column(name = "OUTGOING_SIZE_PHASE")
	private Integer outgoingSizePhase;
	
	@Column(name = "OUTGOING_SIZE_NEUTRAL")
	private Integer outgoingSizeNeutral;
	
	@Column(name = "OUTGOING_SIZE_PROTECTIVE")
	private Integer outgoingSizeProtective;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "rcbo", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<GeneralTestingRCBO> generalTestingRCBO;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "rcbo", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<SafetyTestingRCBO> safetyTestingRCBO;

	public Integer getRcboId() {
		return rcboId;
	}

	public void setRcboId(Integer rcboId) {
		this.rcboId = rcboId;
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

	public Integer getResidualCurrent() {
		return residualCurrent;
	}

	public void setResidualCurrent(Integer residualCurrent) {
		this.residualCurrent = residualCurrent;
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

	public List<GeneralTestingRCBO> getGeneralTestingRCBO() {
		return generalTestingRCBO;
	}

	public void setGeneralTestingRCBO(List<GeneralTestingRCBO> generalTestingRCBO) {
		this.generalTestingRCBO = generalTestingRCBO;
	}

	public List<SafetyTestingRCBO> getSafetyTestingRCBO() {
		return safetyTestingRCBO;
	}

	public void setSafetyTestingRCBO(List<SafetyTestingRCBO> safetyTestingRCBO) {
		this.safetyTestingRCBO = safetyTestingRCBO;
	}
	
	
}
