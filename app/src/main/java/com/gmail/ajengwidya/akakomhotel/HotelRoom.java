package com.gmail.ajengwidya.akakomhotel;

public class HotelRoom {
    private String nama;
    private String harga;
    private String deskripsi;

    public HotelRoom(String nama, String harga, String deskripsi){
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getHarga() { return harga; }
    public void setHarga(String harga) { this.harga = harga; }
    public String getDeskripsi() { return deskripsi; }
    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }
}
