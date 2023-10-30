package com.example.model;

import java.util.Date;

public class Quanly {
	private String maQl;
	private String ten;
	private Date ngaysinh;
	private String diachi;
	private String sdt;
	private String email;
	public Quanly(String maQl, String ten, Date ngaysinh, String diachi, String sdt, String email) {
		super();
		this.maQl = maQl;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
	}
	public String getMaQl() {
		return maQl;
	}
	public void setMaQl(String maQl) {
		this.maQl = maQl;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
