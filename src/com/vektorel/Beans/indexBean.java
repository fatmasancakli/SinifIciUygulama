package com.vektorel.Beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.Models.tbldefault;
import com.vektorel.Models.tblokullar;

@SuppressWarnings("deprecation")
@ManagedBean(name="indexBean")
@SessionScoped
public class indexBean {

	private String ekranyazisi = "ilk JSF";

	private List<tbldefault> liste = new ArrayList<>();
	
	private List<tblokullar> okullistesi = new ArrayList<>();
	
	private tblokullar okulgiris = new tblokullar();
	
	private tblokullar okulduzenle = new tblokullar();
	
	public tblokullar getOkulduzenle() {
		return okulduzenle;
	}


	public void setOkulduzenle(tblokullar okulduzenle) {
		this.okulduzenle = okulduzenle;
	}


	public void okulekle() {
		tblokullar tmp = new tblokullar();
		tmp.setId(okullistesi.size()+1L);
		tmp.setOkuladi(okulgiris.getOkuladi());
		tmp.setOkuladresi(okulgiris.getOkuladresi());
		tmp.setOkulwebsiteadresi(okulgiris.getOkulwebsiteadresi());
		tmp.setResimurl(okulgiris.getResimurl());
		okullistesi.add(tmp);
	
		
	}
	
	
	public tblokullar getOkulgiris() {
		return okulgiris;
	}

	public void setOkulgiris(tblokullar okulgiris) {
		this.okulgiris = okulgiris;
	}

	public List<tblokullar> getOkullistesi() {
		return okullistesi;
	}

	public void setOkullistesi(List<tblokullar> okullistesi) {
		this.okullistesi = okullistesi;
	}

	public indexBean() {
		
		tblokullar okul;
		okul = new tblokullar();
		okul.setId(1L);
		okul.setOkuladi("A.Kalpler Anaokulu");
		okul.setOkuladresi("Ankara/Çankaya");
		okul.setOkulwebsiteadresi("https://okul.com.tr/anaokulu/ankara/ozel-asil-kalpler-anaokulu-82");
		okul.setResimurl("https://cdn.okul.com.tr/schools/82/1080x0/ozel-asil-kalpler-anaokulu-1.jpg");
		okul.setOkultelefonnumarasi("03124765606");
		okullistesi.add(okul);
		
	}
	
	public List<tbldefault> getListe() {
		return liste;
	}

	public void setListe(List<tbldefault> liste) {
		this.liste = liste;
	}

	public String getEkranyazisi() {
		return ekranyazisi;
	}

	public void setEkranyazisi(String ekranyazisi) {
		this.ekranyazisi = ekranyazisi;
	}

}
