package com.example.demo.employee.entity;

import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class MessageMaster {

	@Id
	private int messageid;
	private String message;

	public MessageMaster() {

	}

	public MessageMaster(int messageid, String message) {
		super();
		this.messageid = messageid;
		this.message = message;
	}

	public int getMessageid() {
		return messageid;
	}

	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageMaster [messageid=" + messageid + ", message=" + message + "]";
	}

}
