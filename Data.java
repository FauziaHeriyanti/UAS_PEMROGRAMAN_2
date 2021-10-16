package com.example.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Data {
    private @Id @GeneratedValue Long id;
    private Long isbn;
    private String judul;
    private String penerbit;
    private String tahun;
    private String isibuku;
    private Long harga;

    Data() {
    }

    Data(Long isbn, String judul, String penerbit, String tahun, String isibuku, Long harga) {
        this.isbn = isbn;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.jenisbuku = isibuku;
        this.harga = harga;
    }

    public Long getId() {
        return this.id;
    }

    public Long getisbn() {
        return this.isbn;
    }

    public String getjudul() {
        return this.judul;
    }

    public String getpenerbit() {
        return this.penerbit;
    }

    public String gettahun() {
        return this.tahun;
    }

    public String getisibuku() {
        return this.isibuku;
    }

    public Long getharga() {
        return this.harga;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setisbn(Long isbn) {
        this.isbn = isbn;
    }

    public void setjudul(String judul) {
        this.judul = judul;
    }

    public void setpenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void settahun(String tahun) {
        this.tahun = tahun;
    }

    public void setisibuku(String isibuku) {
        this.jenisbuku = isibuku;
    }

    public void setharga(Long harga) {
        this.harga = harga;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Data))
            return false;
        Data data = (Data) o;
        return Objects.equals(this.id, data.id) && Objects.equals(this.isbn, data.isbn)
                && Objects.equals(this.judul, data.judul) && Objects.equals(this.penerbit, data.penerbit)
                && Objects.equals(this.tahun, data.tahun) && Objects.equals(this.isibuku, data.isibuku)
                && Objects.equals(this.harga, data.harga);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.isbn, this.judul, this.penerbit, this.tahun, this.isibuku, this.harga);
    }

    @Override
    public String toString() {
        return "Data Buku{" + "id=" + this.id + ", isbn='" + this.isbn + '\'' + ", judul='" + this.judul + '\''
                + ", penerbit='" + this.penerbit + '\'' + ", tahun='" + this.tahun + '\'' + ", isibuku='"
                + this.isibuku + '\'' + ", harga='" + this.harga + '\'' +  '}';
    }

}
