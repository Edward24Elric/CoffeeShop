package DTO;

public class hoaDon {
	String tenNuoc;
	float Soluong;
	float donGia;
	float thanhTien;
	String maHD;
	String date;
	String time;
	public String getTenNuoc() {
		return tenNuoc;
	}
	public void setTenNuoc(String tenNuoc) {
		this.tenNuoc = tenNuoc;
	}
	public float getSoluong() {
		return Soluong;
	}
	public void setSoluong(float soluong) {
		Soluong = soluong;
	}
	public float getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(float thanhTien) {
		this.thanhTien = thanhTien;
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public hoaDon(String tenNuoc, float soluong, float donGia, float thanhTien, String maHD, String date, String time) {
		super();
		this.tenNuoc = tenNuoc;
		Soluong = soluong;
		this.donGia = donGia;
		this.thanhTien = thanhTien;
		this.maHD = maHD;
		this.date = date;
		this.time = time;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	
	
	
}