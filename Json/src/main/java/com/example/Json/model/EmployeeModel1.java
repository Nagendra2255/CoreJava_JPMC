package com.example.Json.model;

import java.sql.Timestamp;
import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Data
@Getter
@Setter
@Entity
@Controller
public class EmployeeModel1 {

	public EmployeeModel1() {
		super();
	}

	public EmployeeModel1(int empId, String empName, float empSalary, String empCity) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empCity = empCity;
		//this.dateCreated = dateCreated;
		//this.dateLastModified = dateLastModified;
	}

	@Override
	public String toString() {
		return "EmployeeModel1 [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empCity="
				+ empCity + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	/*public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateLastModified() {
		return dateLastModified;
	}

	public void setDateLastModified(Timestamp dateLastModified) {
		this.dateLastModified = dateLastModified;
	}*/

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue
	@JsonProperty
	private int empId;
	@Column(nullable = false)
	@JsonProperty
	private String empName;
	@Column(nullable = false)
	@JsonProperty
	private float empSalary;
	//@Column(updatable = false, nullable = false)
	@Column(nullable = false)
	@JsonProperty
	private String empCity;

	/*@CreationTimestamp
	@Column(updatable = false, nullable = false)
	Timestamp dateCreated;
	@UpdateTimestamp
	@Column(updatable = false, nullable = false)
	Timestamp dateLastModified;*/

}
