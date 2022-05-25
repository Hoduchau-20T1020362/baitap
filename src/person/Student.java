/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

import java.util.Date;

public class Student extends Person{
    String Ma,Nganh;
    String ngaynhaphoc;
	public String getMa() {
		return Ma;
	}
	public void setMa(String ma) {
		Ma = ma;
	}
	public String getNganh() {
		return Nganh;
	}
	public void setNganh(String nganh) {
		Nganh = nganh;
	}
	public String getNgaynhaphoc() {
		return ngaynhaphoc;
	}
	public void setNgaynhaphoc(String ngaynhaphoc) {
		this.ngaynhaphoc = ngaynhaphoc;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String ma, String nganh, String ngaynhaphoc) {
		super();
		Ma = ma;
		Nganh = nganh;
		this.ngaynhaphoc = ngaynhaphoc;
	}
	@Override
	public String toString() {
		return "Student [Ma=" + Ma + ", Nganh=" + Nganh + ", ngaynhaphoc=" + ngaynhaphoc + "]";
	}
    
}
