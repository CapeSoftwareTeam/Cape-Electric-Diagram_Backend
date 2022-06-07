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
public class SupplyCharcteristicsHVIncoming {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SUPPLYCHARCTERISTICS_HV_INCOMING_ID")
	private Integer supplyCharcteristicsHVIncomingId;
	
	@Column(name = "REFERENCE_NAME")
	private String referenceName;
	
	@Column(name = "VOLTAGE_RATING")
	private Integer voltageRating;
	
	@Column(name = "CABLE_SIZE_PHASE")
	private Integer cableSizePhase;
	
	@Column(name = "CABLE_SIZE_NEUTRAL")
	private Integer cableSizeNeutral;
	
	@Column(name = "CABLE_SIZE_PROTECTIVE_CONDUCTOR")
	private Integer cableSizeProtectiveConductor;
	
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SUPPLYCHARACTERISTICS_HV_ID")
	private SupplyCharacteristicsHV supplyCharacteristicsHV;

	public Integer getSupplyCharcteristicsHVIncomingId() {
		return supplyCharcteristicsHVIncomingId;
	}

	public void setSupplyCharcteristicsHVIncomingId(Integer supplyCharcteristicsHVIncomingId) {
		this.supplyCharcteristicsHVIncomingId = supplyCharcteristicsHVIncomingId;
	}

	public String getReferenceName() {
		return referenceName;
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

	public Integer getVoltageRating() {
		return voltageRating;
	}

	public void setVoltageRating(Integer voltageRating) {
		this.voltageRating = voltageRating;
	}

	public Integer getCableSizePhase() {
		return cableSizePhase;
	}

	public void setCableSizePhase(Integer cableSizePhase) {
		this.cableSizePhase = cableSizePhase;
	}

	public Integer getCableSizeNeutral() {
		return cableSizeNeutral;
	}

	public void setCableSizeNeutral(Integer cableSizeNeutral) {
		this.cableSizeNeutral = cableSizeNeutral;
	}

	public Integer getCableSizeProtectiveConductor() {
		return cableSizeProtectiveConductor;
	}

	public void setCableSizeProtectiveConductor(Integer cableSizeProtectiveConductor) {
		this.cableSizeProtectiveConductor = cableSizeProtectiveConductor;
	}

	public SupplyCharacteristicsHV getSupplyCharacteristicsHV() {
		return supplyCharacteristicsHV;
	}

	public void setSupplyCharacteristicsHV(SupplyCharacteristicsHV supplyCharacteristicsHV) {
		this.supplyCharacteristicsHV = supplyCharacteristicsHV;
	}

	

}
