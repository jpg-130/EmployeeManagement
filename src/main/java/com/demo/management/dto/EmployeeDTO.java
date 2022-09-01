package com.demo.management.dto;

import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class EmployeeDTO {

	@NotNull
	@Pattern(regexp = "[0-9]{5,10}")
	private Integer employeeId;

	@NotBlank
	private String firstName;

	@NotBlank
	private String lastName;

	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9._]+@[a-zA-Z0-9._]{2,}\\.[a-zA-Z][a-zA-Z.]+")
	private String employeeEmail;

	private Set<AddressDTO> addressDTOs;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Set<AddressDTO> getAddressDTOs() {
		return addressDTOs;
	}

	public void setAddressDTOs(Set<AddressDTO> addressDTOs) {
		this.addressDTOs = addressDTOs;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", employeeEmail=" + employeeEmail + ", addressDTOs=" + addressDTOs + "]";
	}

}
