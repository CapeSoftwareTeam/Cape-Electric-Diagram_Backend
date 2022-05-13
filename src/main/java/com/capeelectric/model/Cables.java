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
@Table(name = "CABLES")
public class Cables {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CABLE_ID")
	private Integer cableId;
	
	@Column(name = "REFERENCE_NAME")
	private String referenceName;
		
	@Column(name = "MANUFACTURER_NAME")
	private String manufacturerName;
	
	@Column(name = "CONDUCTOR_TYPE")
	private String conductorType;
	
	@Column(name = "VOLTAGE")
	private Integer voltage;
	
	@Column(name = "BUS_DUCT_TYPE")
	private Integer busDuctType;
	
	@Column(name = "BUS_DUCT_SIZE")
	private Integer busDuctSize;
	
	@Column(name = "BUS_DUCT_PHASE_M")
	private String busDuctPhaseM;
	
	@Column(name = "BUS_DUCT_NEUTRAL_M")
	private String busDuctNeutralM;
	
	@Column(name = "BUS_DUCT_PROTECTIVE_M")
	private String busDuctProtectiveM;
	
	@Column(name = "BUS_DUCT_PHASE_SQM")
	private String busDuctPhaseSQM;
	
	@Column(name = "BUS_DUCT_NEUTRAL_SQM")
	private String busDuctNeutralSQM;
	
	@Column(name = "BUS_DUCT_PROTECTIVE_SQM")
	private String busDuctProtectiveSQM;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "cables", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<GeneralTestingCables> generalTestingCables;

	public Integer getCableId() {
		return cableId;
	}

	public void setCableId(Integer cableId) {
		this.cableId = cableId;
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

	public String getConductorType() {
		return conductorType;
	}

	public void setConductorType(String conductorType) {
		this.conductorType = conductorType;
	}

	public Integer getVoltage() {
		return voltage;
	}

	public void setVoltage(Integer voltage) {
		this.voltage = voltage;
	}

	public Integer getBusDuctType() {
		return busDuctType;
	}

	public void setBusDuctType(Integer busDuctType) {
		this.busDuctType = busDuctType;
	}

	public Integer getBusDuctSize() {
		return busDuctSize;
	}

	public void setBusDuctSize(Integer busDuctSize) {
		this.busDuctSize = busDuctSize;
	}

	public String getBusDuctPhaseM() {
		return busDuctPhaseM;
	}

	public void setBusDuctPhaseM(String busDuctPhaseM) {
		this.busDuctPhaseM = busDuctPhaseM;
	}

	public String getBusDuctNeutralM() {
		return busDuctNeutralM;
	}

	public void setBusDuctNeutralM(String busDuctNeutralM) {
		this.busDuctNeutralM = busDuctNeutralM;
	}

	public String getBusDuctProtectiveM() {
		return busDuctProtectiveM;
	}

	public void setBusDuctProtectiveM(String busDuctProtectiveM) {
		this.busDuctProtectiveM = busDuctProtectiveM;
	}

	public String getBusDuctPhaseSQM() {
		return busDuctPhaseSQM;
	}

	public void setBusDuctPhaseSQM(String busDuctPhaseSQM) {
		this.busDuctPhaseSQM = busDuctPhaseSQM;
	}

	public String getBusDuctNeutralSQM() {
		return busDuctNeutralSQM;
	}

	public void setBusDuctNeutralSQM(String busDuctNeutralSQM) {
		this.busDuctNeutralSQM = busDuctNeutralSQM;
	}

	public String getBusDuctProtectiveSQM() {
		return busDuctProtectiveSQM;
	}

	public void setBusDuctProtectiveSQM(String busDuctProtectiveSQM) {
		this.busDuctProtectiveSQM = busDuctProtectiveSQM;
	}

	public List<GeneralTestingCables> getGeneralTestingCables() {
		return generalTestingCables;
	}

	public void setGeneralTestingCables(List<GeneralTestingCables> generalTestingCables) {
		this.generalTestingCables = generalTestingCables;
	}
	
	
}
