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
@Table(name = "INCOMER_DETAILS_LV")
public class IncomerDetailsLV {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "INCOMER_DETAILS_LV_ID")
	private Integer incomerDetailsLVId;
	
	@Column(name = "TOTAL_NO_OF_INCOMING_SUPPLY")
	private Integer totalNoOfIncomingSupply;
	
	@Column(name = "REFERENCE_NAME")
	private String referenceName;
		
	@Column(name = "INCOMING_FROM")
	private Integer incomingFrom;
	
	@Column(name = "MANUFACTURER_OCPD")
	private String manufacturerOCPD;
	
	@Column(name = "RATING")
	private Integer rating;
	
	@Column(name = "NO_OF_POLES")
	private String noOfPoles;
	
	@Column(name = "CURRENT_CURVE")
	private String currentCurve;
	
	@Column(name = "CURRENT_CURVE_MCB")
	private String currentCurveMCB;
	
	@Column(name = "CURRENT_DEVICE_TYPE")
	private String currentDeviceType;
	
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
	
	@Column(name = "OUT_GOING_CABLE_PHASE")
	private Integer outGoingCablePhase;
	
	@Column(name = "OUT_GOING_CABLE_NEUTRAL")
	private Integer outGoingCableNeutral;
	
	@Column(name = "OUT_GOING_CABLE_PROTECTIVE")
	private Integer outGoingCableProtective;
	
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SUPPLYCHARACTERISTICS_HV_ID")
	private SupplyCharacteristicsHV supplyCharacteristicsHV;
	
}
