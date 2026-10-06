package com.gfg.model;
import jakarta.persistence.*;
@Entity(name="GeekUser")
public class GeeksUserRecord {
 @Id
 private Long id;
 private String name;
 private String email;
 private String gender;
 private Integer numberOfPosts;
 public GeeksUserRecord() {}
	 public Long getId() {
		 return id;
	 }
	 public void setId(Long id) {
		 this.id=id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email=email;
	 }
	 public Integer getNumberOfPosts() {
		 return numberOfPosts;
	 }
	 public void setNumberOfPosts(Integer numberOfPosts) {
		 this.numberOfPosts=numberOfPosts;
	 }
}
