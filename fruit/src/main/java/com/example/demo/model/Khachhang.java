package com.example.demo;

import java.util.Date;

public class Khachhang {
	private String maKHS;
	private String ten;
	private Date ngaysinh;
	private String diachi;
	private String sdt;
	private String email;
	public Khachhang(String maKHS, String ten, Date ngaysinh, String diachi, String sdt, String email) {
		super();
		this.maKHS = maKHS;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
	}
	public String getMaKHS() {
		return maKHS;
	}
	public void setMaKHS(String maKHS) {
		this.maKHS = maKHS;
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
