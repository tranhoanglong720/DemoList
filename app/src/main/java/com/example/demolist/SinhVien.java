package com.example.demolist;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private int Id;
    private String ten;
    private String tuoi;
    private String phai;

    public SinhVien(int id, String ten, String tuoi, String phai) {
        Id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.phai = phai;
    }
    public SinhVien()
    {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }


}
