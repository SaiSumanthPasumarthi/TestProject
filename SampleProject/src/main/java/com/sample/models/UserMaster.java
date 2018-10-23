package com.sample.models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name= "users")
public class UserMaster {

	
	
	@Id
	@Column(name = "userid")
	Long userid;
	@Column(name = "loginid")
	String loginid;
	@Column(name = "username")
	String username;
	@Column(name = "tenantcode")
	String tenantcode;
	@Column(name = "rolename ")
	String rolename ;
	@Column(name = "pwd")
	String pwd;
	@Column(name = "pwdresetflag")
	int pwdresetflag;
	@Column(name = "mobile1")
	String mobile1;
	@Column(name = "mobile2")
	String mobile2;
	@Column(name = "emailid1")
	String emailid1;
	@Column(name = "emailid2")
	String emailid2;
	@Column(name = "rmuserid")
	String rmuserid;
	@Column(name = "status")
	int status;
	@Column(name = "createdon")
    java.util.Date createdon;
	@Column(name = "createdby")
	String createdby;
	@Column(name = "createdipaddr")
	String createdipaddr;
	@Column(name = "modifiedon")
	Date modifiedon;
	@Column(name = "modifiedby")
	String modifiedby;
	@Column(name = "modifiedipaddr")
	String modifiedipaddr;
	@Column(name = "deactivatedon")
	Date deactivatedon;
	@Column(name = "deactivatedby ")
	String deactivatedby ;
	@Column(name = "deactivatedipaddr")
	String deactivatedipaddr;
	@Column(name = "firstname")
	String firstname;
	@Column(name = "lastlogin")
	Date lastlogin;
	@Column(name = "lastname")
	String lastname;
	@Column(name = "middlename")
	String middlename;
	
	
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTenantcode() {
		return tenantcode;
	}
	public void setTenantcode(String tenantcode) {
		this.tenantcode = tenantcode;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getPwdresetflag() {
		return pwdresetflag;
	}
	public void setPwdresetflag(int pwdresetflag) {
		this.pwdresetflag = pwdresetflag;
	}
	public String getMobile1() {
		return mobile1;
	}
	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}
	public String getMobile2() {
		return mobile2;
	}
	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}
	public String getEmailid1() {
		return emailid1;
	}
	public void setEmailid1(String emailid1) {
		this.emailid1 = emailid1;
	}
	public String getEmailid2() {
		return emailid2;
	}
	public void setEmailid2(String emailid2) {
		this.emailid2 = emailid2;
	}
	public String getRmuserid() {
		return rmuserid;
	}
	public void setRmuserid(String rmuserid) {
		this.rmuserid = rmuserid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public java.util.Date getCreatedon() {
		return createdon;
	}
	public void setCreatedon(java.util.Date createdon) {
		this.createdon = createdon;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getCreatedipaddr() {
		return createdipaddr;
	}
	public void setCreatedipaddr(String createdipaddr) {
		this.createdipaddr = createdipaddr;
	}
	public Date getModifiedon() {
		return modifiedon;
	}
	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}
	public String getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}
	public String getModifiedipaddr() {
		return modifiedipaddr;
	}
	public void setModifiedipaddr(String modifiedipaddr) {
		this.modifiedipaddr = modifiedipaddr;
	}
	public Date getDeactivatedon() {
		return deactivatedon;
	}
	public void setDeactivatedon(Date deactivatedon) {
		this.deactivatedon = deactivatedon;
	}
	public String getDeactivatedby() {
		return deactivatedby;
	}
	public void setDeactivatedby(String deactivatedby) {
		this.deactivatedby = deactivatedby;
	}
	public String getDeactivatedipaddr() {
		return deactivatedipaddr;
	}
	public void setDeactivatedipaddr(String deactivatedipaddr) {
		this.deactivatedipaddr = deactivatedipaddr;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Date getLastlogin() {
		return lastlogin;
	}
	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	
}
