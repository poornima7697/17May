package com.example.demo.employee.entity;

import java.sql.Blob;
import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banner {
	@Id
	private int bannerid;
	private String bannerdetails;
	private byte[] bannerimage;
	private String bannertargetlink;
	private int uploadedby;
	private Date createddate;
	private boolean isactive;


	public Banner() {

	}

	public Banner(int bannerid, String bannerdetails, byte[] bannerimage, String bannertargetlink, int uploadedby,
			Date createddate, boolean isactive) {
		super();
		this.bannerid = bannerid;
		this.bannerdetails = bannerdetails;
		this.bannerimage = bannerimage;
		this.bannertargetlink = bannertargetlink;
		this.uploadedby = uploadedby;
		this.createddate = createddate;
		this.isactive = isactive;
	}

	public int getBannerid() {
		return bannerid;
	}

	public void setBannerid(int bannerid) {
		this.bannerid = bannerid;
	}

	public String getBannerdetails() {
		return bannerdetails;
	}

	public void setBannerdetails(String bannerdetails) {
		this.bannerdetails = bannerdetails;
	}

	public byte[] getBannerimage() {
		return bannerimage;
	}

	public void setBannerimage(byte[] bannerimage) {
		this.bannerimage = bannerimage;
	}

	public String getBannertargetlink() {
		return bannertargetlink;
	}

	public void setBannertargetlink(String bannertargetlink) {
		this.bannertargetlink = bannertargetlink;
	}

	public int getUploadedby() {
		return uploadedby;
	}

	public void setUploadedby(int uploadedby) {
		this.uploadedby = uploadedby;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	@Override
	public String toString() {
		return "Banner [bannerid=" + bannerid + ", bannerdetails=" + bannerdetails + ", bannerimage="
				+ Arrays.toString(bannerimage) + ", bannertargetlink=" + bannertargetlink + ", uploadedby=" + uploadedby
				+ ", createddate=" + createddate + ", isactive=" + isactive + "]";
	}

}
