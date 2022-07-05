/**
 * 
 */
package com.capeelectric.model;

import java.time.LocalDateTime;
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
	
	@Column(name = "NODE_ID")
	private String nodeId;
	
	@Column(name = "FILE_NAME")
	private String fileName;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "MANUFACTURER_NAME")
	private String manufacturerName;
	
	@Column(name = "CONDUCTOR_TYPE")
	private String conductorType;
	
	@Column(name = "VOLTAGE")
	private Integer voltage;
	
	@Column(name = "BUS_DUCT_TYPE")
	private Integer busDuctType;
	
	@Column(name = "INSTALLATION_TYPE")
	private Integer installation;
	
	@Column(name = "BUS_DUCT_PHASE_M")
	private String busDuctPhaseM;
	
	@Column(name = "BUS_DUCT_NEUTRAL_M")
	private String busDuctNeutralM;
	
	@Column(name = "BUS_DUCT_PROTECTIVE_M")
	private String busDuctProtectiveM;
	
	@Column(name = "BUS_DUCT_LENGTH")
	private String busDuctLength;
	
	@Column(name = "POTENTIAL_TEST_REPORT")
	private String potentialTestReport;
	
	@Column(name = "CREATED_DATE")
	private LocalDateTime createdDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;
	
	@Column(name = "UPDATED_DATE")
	private LocalDateTime updatedDate;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "cables", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<GeneralTestingCables> generalTestingCables;

	public Integer getCableId() {
		return cableId;
	}

	public void setCableId(Integer cableId) {
		this.cableId = cableId;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public Integer getInstallation() {
		return installation;
	}

	public void setInstallation(Integer installation) {
		this.installation = installation;
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

	public String getBusDuctLength() {
		return busDuctLength;
	}

	public void setBusDuctLength(String busDuctLength) {
		this.busDuctLength = busDuctLength;
	}

	public String getPotentialTestReport() {
		return potentialTestReport;
	}

	public void setPotentialTestReport(String potentialTestReport) {
		this.potentialTestReport = potentialTestReport;
	}

	public List<GeneralTestingCables> getGeneralTestingCables() {
		return generalTestingCables;
	}

	public void setGeneralTestingCables(List<GeneralTestingCables> generalTestingCables) {
		this.generalTestingCables = generalTestingCables;
	}
	
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
}
