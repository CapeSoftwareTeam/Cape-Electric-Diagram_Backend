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
@Table(name = "SAFETY_TESTING_LIGHT")
public class SafetyTestingLight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SAFETY_TESTING_LIGHT_ID")
	private Integer safetyTestingLightId;
	
	@Column(name = "PHN")
	private String phN;
		
	@Column(name = "PHE")
	private String phE;
	
	@Column(name = "NE")
	private String nE;
	
	@Column(name = "SHOCK_VOLTAGE")
	private String shockVoltage;
	
	@Column(name = "FLOOR_RESISTANCE")
	private Integer floorResistance;
	
	@Column(name = "WALL_RESISTANCE")
	private Integer wallResistance;
	
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "LIGHT_ID")
	private Light light;

	public Integer getSafetyTestingLightId() {
		return safetyTestingLightId;
	}

	public void setSafetyTestingLightId(Integer safetyTestingLightId) {
		this.safetyTestingLightId = safetyTestingLightId;
	}

	public String getPhN() {
		return phN;
	}

	public void setPhN(String phN) {
		this.phN = phN;
	}

	public String getPhE() {
		return phE;
	}

	public void setPhE(String phE) {
		this.phE = phE;
	}

	public String getnE() {
		return nE;
	}

	public void setnE(String nE) {
		this.nE = nE;
	}

	public String getShockVoltage() {
		return shockVoltage;
	}

	public void setShockVoltage(String shockVoltage) {
		this.shockVoltage = shockVoltage;
	}

	public Integer getFloorResistance() {
		return floorResistance;
	}

	public void setFloorResistance(Integer floorResistance) {
		this.floorResistance = floorResistance;
	}

	public Integer getWallResistance() {
		return wallResistance;
	}

	public void setWallResistance(Integer wallResistance) {
		this.wallResistance = wallResistance;
	}

	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}

	
}
