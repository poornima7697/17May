package com.example.demo.employee.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HolidayMaster {
	@Id
	private int holidayid;
    private Date holidaydate;
    private String description;
    private boolean mandatorystatus;
    private int uploadedby;
    private Date uploadeddate;
	public HolidayMaster() {
		super();
	}
	public HolidayMaster(int holidayid, Date holidaydate, String description, boolean mandatorystatus, int uploadedby,
			Date uploadeddate) {
		super();
		this.holidayid = holidayid;
		this.holidaydate = holidaydate;
		this.description = description;
		this.mandatorystatus = mandatorystatus;
		this.uploadedby = uploadedby;
		this.uploadeddate = uploadeddate;
	}
	public int getHolidayid() {
		return holidayid;
	}
	public void setHolidayid(int holidayid) {
		this.holidayid = holidayid;
	}
	public Date getHolidaydate() {
		return holidaydate;
	}
	public void setHolidaydate(Date holidaydate) {
		this.holidaydate = holidaydate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isMandatorystatus() {
		return mandatorystatus;
	}
	public void setMandatorystatus(boolean mandatorystatus) {
		this.mandatorystatus = mandatorystatus;
	}
	public int getUploadedby() {
		return uploadedby;
	}
	public void setUploadedby(int uploadedby) {
		this.uploadedby = uploadedby;
	}
	public Date getUploadeddate() {
		return uploadeddate;
	}
	public void setUploadeddate(Date uploadeddate) {
		this.uploadeddate = uploadeddate;
	}
	@Override
	public String toString() {
		return "HolidayMaster [holidayid=" + holidayid + ", holidaydate=" + holidaydate + ", description=" + description
				+ ", mandatorystatus=" + mandatorystatus + ", uploadedby=" + uploadedby + ", uploadeddate="
				+ uploadeddate + ", getHolidayid()=" + getHolidayid() + ", getHolidaydate()=" + getHolidaydate()
				+ ", getDescription()=" + getDescription() + ", isMandatorystatus()=" + isMandatorystatus()
				+ ", getUploadedby()=" + getUploadedby() + ", getUploadeddate()=" + getUploadeddate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
