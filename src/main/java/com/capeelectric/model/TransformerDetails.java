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
public class TransformerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TRANSFORMER_DETAILS_ID")
	private Integer transformerDetailsId;
	
	@Column(name = "REFERENCE_NAME")
	private String referenceName;
	
	@Column(name = "INCOMING_FROM")
	private String incomingFrom;
	
	@Column(name = "CAPACITY_RATING")
	private Integer capacityRating;
	
	@Column(name = "SIDE_VOLTAGE_HV")
	private Integer sideVoltageHV;
	
	@Column(name = "SIDE_VOLTAGE_LV")
	private Integer sideVoltageLV;
	
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
	
	@Column(name = "TRANSFORMER_TEST")
	private String transformerTest;
	
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SUPPLYCHARACTERISTICS_HV_ID")
	private SupplyCharacteristicsHV supplyCharacteristicsHV;

	public Integer getTransformerDetailsId() {
		return transformerDetailsId;
	}

	public void setTransformerDetailsId(Integer transformerDetailsId) {
		this.transformerDetailsId = transformerDetailsId;
	}

	public String getReferenceName() {
		return referenceName;
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

	public String getIncomingFrom() {
		return incomingFrom;
	}

	public void setIncomingFrom(String incomingFrom) {
		this.incomingFrom = incomingFrom;
	}

	public Integer getCapacityRating() {
		return capacityRating;
	}

	public void setCapacityRating(Integer capacityRating) {
		this.capacityRating = capacityRating;
	}

	public Integer getSideVoltageHV() {
		return sideVoltageHV;
	}

	public void setSideVoltageHV(Integer sideVoltageHV) {
		this.sideVoltageHV = sideVoltageHV;
	}

	public Integer getSideVoltageLV() {
		return sideVoltageLV;
	}

	public void setSideVoltageLV(Integer sideVoltageLV) {
		this.sideVoltageLV = sideVoltageLV;
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

	public String getTransformerTest() {
		return transformerTest;
	}

	public void setTransformerTest(String transformerTest) {
		this.transformerTest = transformerTest;
	}

	public SupplyCharacteristicsHV getSupplyCharacteristicsHV() {
		return supplyCharacteristicsHV;
	}

	public void setSupplyCharacteristicsHV(SupplyCharacteristicsHV supplyCharacteristicsHV) {
		this.supplyCharacteristicsHV = supplyCharacteristicsHV;
	}

	
}
