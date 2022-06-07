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

@Entity
@Table(name = "DIESEL_GENERATOR_DETAILS")
public class DieselGeneratorDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DIESEL_GENERATOR_DETAIL_ID")
	private Integer dieselGeneratorDetailId;
	
	@Column(name = "REFERENCE_NAME")
	private String referenceName;
	
	@Column(name = "CAPACITY_RATING")
	private Integer capacityRating;
	
	@Column(name = "VOLTAGE_RATING")
	private Integer voltageRating;
	
	@Column(name = "FAULT_CURRENT")
	private Integer faultCurrent;
	
	@Column(name = "BUSHBAR_PHASE_DETAILS")
	private Integer bushbarPhaseDetails;
	
	@Column(name = "BUSHBAR_NEUTRAL_DETAILS")
	private Integer bushbarNeutralDetails;
	
	@Column(name = "BUSHBAR_PROTECTIVE_DETAILS")
	private Integer bushbarProtectiveDetails;
	
	@Column(name = "CONNECTED_NEUTRAL")
	private String connectedNeutral;
	
	@Column(name = "DIESEL_GENERATOR_TEST")
	private String dieselGeneratorTest;
	
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SUPPLYCHARACTERISTICS_HV_ID")
	private SupplyCharacteristicsHV supplyCharacteristicsHV;

	public Integer getDieselGeneratorDetailId() {
		return dieselGeneratorDetailId;
	}

	public void setDieselGeneratorDetailId(Integer dieselGeneratorDetailId) {
		this.dieselGeneratorDetailId = dieselGeneratorDetailId;
	}

	public String getReferenceName() {
		return referenceName;
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

	public Integer getCapacityRating() {
		return capacityRating;
	}

	public void setCapacityRating(Integer capacityRating) {
		this.capacityRating = capacityRating;
	}

	public Integer getVoltageRating() {
		return voltageRating;
	}

	public void setVoltageRating(Integer voltageRating) {
		this.voltageRating = voltageRating;
	}

	public Integer getFaultCurrent() {
		return faultCurrent;
	}

	public void setFaultCurrent(Integer faultCurrent) {
		this.faultCurrent = faultCurrent;
	}

	public Integer getBushbarPhaseDetails() {
		return bushbarPhaseDetails;
	}

	public void setBushbarPhaseDetails(Integer bushbarPhaseDetails) {
		this.bushbarPhaseDetails = bushbarPhaseDetails;
	}

	public Integer getBushbarNeutralDetails() {
		return bushbarNeutralDetails;
	}

	public void setBushbarNeutralDetails(Integer bushbarNeutralDetails) {
		this.bushbarNeutralDetails = bushbarNeutralDetails;
	}

	public Integer getBushbarProtectiveDetails() {
		return bushbarProtectiveDetails;
	}

	public void setBushbarProtectiveDetails(Integer bushbarProtectiveDetails) {
		this.bushbarProtectiveDetails = bushbarProtectiveDetails;
	}

	public String getConnectedNeutral() {
		return connectedNeutral;
	}

	public void setConnectedNeutral(String connectedNeutral) {
		this.connectedNeutral = connectedNeutral;
	}

	public String getDieselGeneratorTest() {
		return dieselGeneratorTest;
	}

	public void setDieselGeneratorTest(String dieselGeneratorTest) {
		this.dieselGeneratorTest = dieselGeneratorTest;
	}

	public SupplyCharacteristicsHV getSupplyCharacteristicsHV() {
		return supplyCharacteristicsHV;
	}

	public void setSupplyCharacteristicsHV(SupplyCharacteristicsHV supplyCharacteristicsHV) {
		this.supplyCharacteristicsHV = supplyCharacteristicsHV;
	}

	
}
