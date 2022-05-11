package com.capeelectric.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "SUPPLY_CHARACTERISTICS_HV")
public class SupplyCharacteristicsHV {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SUPPLYCHARACTERISTICS_HV_ID")
	private Integer supplyCharacteristicsHVId;
	
	@Column(name = "TOTAL_NO_OF_INCOMING_SUPPLY")
	private Integer totalNoOfIncomingSupply;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "supplyCharacteristicsHV", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<SupplyCharcteristicsHVIncoming> supplyCharcteristicsHVIncoming;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "supplyCharacteristicsHV", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<IncomerDetails> incomerDetails;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "supplyCharacteristicsHV", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<BusCouplerDetails> BusCouplerDetails;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "supplyCharacteristicsHV", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<OutGoingDetails> outGoingDetails;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "supplyCharacteristicsHV", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<TransformerDetails> transformerDetails;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "supplyCharacteristicsHV", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<DieselGeneratorDetails> dieselGeneratorDetails;
	
	@Column(name = "MAIN_RECEIVING_HV_AVAILABILITY")
	private String mainReceivingHVAvailability;
	
	@Column(name = "REFERENCE_NAME")
	private String referenceName;
	
	@Column(name = "TOTAL_NO_OF_INCOMING")
	private Integer totalNoOfIncoming;
	
	@Column(name = "TOTAL_NO_OF_BUS_COUPLER")
	private Integer totalNoOfBusCoupler;
	
	@Column(name = "TOTAL_NO_OF_CIRCUIT_OUTGOING_INUSE")
	private Integer totalNoOfCircuitOutgoingInUse;
	
	@Column(name = "TOTAL_NO_OF_SPARE_OUTGOING")
	private Integer totalNoOfSpareOutgoing;
	
	@Column(name = "SWITCH_BOARD_DETAILS_PHASE")
	private Integer switchBoardDetailsPhase;
	
	@Column(name = "SWITCH_BOARD_DETAILS_NEUTRAL")
	private Integer switchBoardDetailsNeutral;
	
	@Column(name = "SWITCH_BOARD_DETAILS_PROTECTIVE")
	private Integer switchBoardDetailsProtective;
	
	@Column(name = "SWITCH_BOARD_DETAILS_FAULT_CURRENT")
	private Integer switchBoardDetailsFaultCurrent;
	
	@Column(name = "SWITCH_BOARD_HV")
	private String switchBoardHV;
	
	@Column(name = "TRANSFORMER")
	private String transformer;
	
	@Column(name = "TOTAL_NO_OF_TRANSFORMER")
	private Integer totalNoOfTransformer;
	
	@Column(name = "DIESEL_GENERATOR")
	private String dieselGenerator;
	
	@Column(name = "TOTAL_NO_OF_DIESEL_GENERATOR")
	private Integer totalNoOfDieselGenerator;

	public Integer getSupplyCharacteristicsHVId() {
		return supplyCharacteristicsHVId;
	}

	public void setSupplyCharacteristicsHVId(Integer supplyCharacteristicsHVId) {
		this.supplyCharacteristicsHVId = supplyCharacteristicsHVId;
	}

	public Integer getTotalNoOfIncomingSupply() {
		return totalNoOfIncomingSupply;
	}

	public void setTotalNoOfIncomingSupply(Integer totalNoOfIncomingSupply) {
		this.totalNoOfIncomingSupply = totalNoOfIncomingSupply;
	}

	public List<SupplyCharcteristicsHVIncoming> getSupplyCharcteristicsHVIncoming() {
		return supplyCharcteristicsHVIncoming;
	}

	public void setSupplyCharcteristicsHVIncoming(List<SupplyCharcteristicsHVIncoming> supplyCharcteristicsHVIncoming) {
		this.supplyCharcteristicsHVIncoming = supplyCharcteristicsHVIncoming;
	}

	public List<IncomerDetails> getIncomerDetails() {
		return incomerDetails;
	}

	public void setIncomerDetails(List<IncomerDetails> incomerDetails) {
		this.incomerDetails = incomerDetails;
	}

	public List<BusCouplerDetails> getBusCouplerDetails() {
		return BusCouplerDetails;
	}

	public void setBusCouplerDetails(List<BusCouplerDetails> busCouplerDetails) {
		BusCouplerDetails = busCouplerDetails;
	}

	public List<OutGoingDetails> getOutGoingDetails() {
		return outGoingDetails;
	}

	public void setOutGoingDetails(List<OutGoingDetails> outGoingDetails) {
		this.outGoingDetails = outGoingDetails;
	}

	public List<TransformerDetails> getTransformerDetails() {
		return transformerDetails;
	}

	public void setTransformerDetails(List<TransformerDetails> transformerDetails) {
		this.transformerDetails = transformerDetails;
	}

	public List<DieselGeneratorDetails> getDieselGeneratorDetails() {
		return dieselGeneratorDetails;
	}

	public void setDieselGeneratorDetails(List<DieselGeneratorDetails> dieselGeneratorDetails) {
		this.dieselGeneratorDetails = dieselGeneratorDetails;
	}

	public String getMainReceivingHVAvailability() {
		return mainReceivingHVAvailability;
	}

	public void setMainReceivingHVAvailability(String mainReceivingHVAvailability) {
		this.mainReceivingHVAvailability = mainReceivingHVAvailability;
	}

	public String getReferenceName() {
		return referenceName;
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

	public Integer getTotalNoOfIncoming() {
		return totalNoOfIncoming;
	}

	public void setTotalNoOfIncoming(Integer totalNoOfIncoming) {
		this.totalNoOfIncoming = totalNoOfIncoming;
	}

	public Integer getTotalNoOfBusCoupler() {
		return totalNoOfBusCoupler;
	}

	public void setTotalNoOfBusCoupler(Integer totalNoOfBusCoupler) {
		this.totalNoOfBusCoupler = totalNoOfBusCoupler;
	}

	public Integer getTotalNoOfCircuitOutgoingInUse() {
		return totalNoOfCircuitOutgoingInUse;
	}

	public void setTotalNoOfCircuitOutgoingInUse(Integer totalNoOfCircuitOutgoingInUse) {
		this.totalNoOfCircuitOutgoingInUse = totalNoOfCircuitOutgoingInUse;
	}

	public Integer getTotalNoOfSpareOutgoing() {
		return totalNoOfSpareOutgoing;
	}

	public void setTotalNoOfSpareOutgoing(Integer totalNoOfSpareOutgoing) {
		this.totalNoOfSpareOutgoing = totalNoOfSpareOutgoing;
	}

	public Integer getSwitchBoardDetailsPhase() {
		return switchBoardDetailsPhase;
	}

	public void setSwitchBoardDetailsPhase(Integer switchBoardDetailsPhase) {
		this.switchBoardDetailsPhase = switchBoardDetailsPhase;
	}

	public Integer getSwitchBoardDetailsNeutral() {
		return switchBoardDetailsNeutral;
	}

	public void setSwitchBoardDetailsNeutral(Integer switchBoardDetailsNeutral) {
		this.switchBoardDetailsNeutral = switchBoardDetailsNeutral;
	}

	public Integer getSwitchBoardDetailsProtective() {
		return switchBoardDetailsProtective;
	}

	public void setSwitchBoardDetailsProtective(Integer switchBoardDetailsProtective) {
		this.switchBoardDetailsProtective = switchBoardDetailsProtective;
	}

	public Integer getSwitchBoardDetailsFaultCurrent() {
		return switchBoardDetailsFaultCurrent;
	}

	public void setSwitchBoardDetailsFaultCurrent(Integer switchBoardDetailsFaultCurrent) {
		this.switchBoardDetailsFaultCurrent = switchBoardDetailsFaultCurrent;
	}

	public String getSwitchBoardHV() {
		return switchBoardHV;
	}

	public void setSwitchBoardHV(String switchBoardHV) {
		this.switchBoardHV = switchBoardHV;
	}

	public String getTransformer() {
		return transformer;
	}

	public void setTransformer(String transformer) {
		this.transformer = transformer;
	}

	public Integer getTotalNoOfTransformer() {
		return totalNoOfTransformer;
	}

	public void setTotalNoOfTransformer(Integer totalNoOfTransformer) {
		this.totalNoOfTransformer = totalNoOfTransformer;
	}

	public String getDieselGenerator() {
		return dieselGenerator;
	}

	public void setDieselGenerator(String dieselGenerator) {
		this.dieselGenerator = dieselGenerator;
	}

	public Integer getTotalNoOfDieselGenerator() {
		return totalNoOfDieselGenerator;
	}

	public void setTotalNoOfDieselGenerator(Integer totalNoOfDieselGenerator) {
		this.totalNoOfDieselGenerator = totalNoOfDieselGenerator;
	}
	
	
	
}
