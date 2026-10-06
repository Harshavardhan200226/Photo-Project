package com.JPAHibernate.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long departmentId;
private String departmentName;
private String departmentAddress;
private String departmentCode;
public String getDepartmentName() {
	// TODO Auto-generated method stub
	return null;
}
public String getDepartmentAddress() {
	// TODO Auto-generated method stub
	return null;
}
public String getDepartmentCode() {
	// TODO Auto-generated method stub
	return null;
}
public void setDepartmentName(Object departmentName2) {
	// TODO Auto-generated method stub
	
}
public void setDepartmentAddress(Object departmentAddress2) {
	// TODO Auto-generated method stub
	
}
public void setDepartmentCode(Object departmentCode2) {
	// TODO Auto-generated method stub
	
}
}
