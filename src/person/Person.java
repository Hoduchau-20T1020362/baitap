/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

import java.util.Date;
public abstract class Person {
    String ten;
    String gt;
    String namsinh;

    public Person() {
    }

    public Person(String ten, String gt, String namsinh) {
        this.ten = ten;
        this.gt = gt;
        this.namsinh = namsinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getGt() {
        return gt;
    }

    public String getNamsinh() {
        return namsinh;
    }

    @Override
    public String toString() {
        return "Person{" + "ten=" + ten + ", gt=" + gt + ", namsinh=" + namsinh + '}';
    }
}
