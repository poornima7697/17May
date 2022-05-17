package com.example.demo.employee.entity;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.juli.DateFormatCache;


//import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "recognition")
public class Recognition {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recogid;
	private int fromaitid;
	private int toaitid;
	private int messageid;


	public Recognition() {

	}

	public Recognition(int recogid, int fromaitid, int toaitid, int messageid) {
		super();
		this.recogid = recogid;
		this.fromaitid = fromaitid;
		this.toaitid = toaitid;
		this.messageid = messageid;
	
	}

	public int getRecogid() {
		return recogid;
	}

	public void setRecogid(int recogid) {
		this.recogid = recogid;
	}

	public int getFromaitid() {
		return fromaitid;
	}

	public void setFromaitid(int fromaitid) {
		this.fromaitid = fromaitid;
	}

	public int getToaitid() {
		return toaitid;
	}

	public void setToaitid(int toaitid) {
		this.toaitid = toaitid;
	}

	public int getMessageid() {
		return messageid;
	}

	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}

	@Override
	public String toString() {
		return "Recognition [recogid=" + recogid + ", fromaitid=" + fromaitid + ", toaitid=" + toaitid + ", messageid="
				+ messageid + "]";
	}
	
	
	
	
}
