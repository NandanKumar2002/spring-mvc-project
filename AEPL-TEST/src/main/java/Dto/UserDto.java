package Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDto {
private String name;
private String email;
@Id
private Long phoneNumber;
private String dob;
private String loc;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(Long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
@Override
public String toString() {
	return "UserDto [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", dob=" + dob + ", loc="
			+ loc + "]";
}

}