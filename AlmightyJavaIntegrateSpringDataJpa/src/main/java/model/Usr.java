package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Usr extends AbstractPersistable<Long> implements Serializable{
	
	private static final long serialVersionUID = -6935123734690467686L;
	private String userId;
	private String name;
	private String password;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
