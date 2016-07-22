/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liza Venita Debora
 */
public class Buku {
    String judul;
    String penulis;
    String isbn;
    String penerbit;
    
    public String getJudul(){
        return judul;
    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    //atribut constructor
    public Buku(String judul, String penulis, String isbn, String penerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
        this.penerbit = penerbit;
    }
}
