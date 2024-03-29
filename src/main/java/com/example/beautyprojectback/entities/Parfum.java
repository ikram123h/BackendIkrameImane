package com.example.beautyprojectback.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity
public class Parfum {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idParfum;
    private String nameParfum;
    private Double priceParfum;
    private Double stockParfum;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateCreate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "Parfum{" +
                "idParfum=" + idParfum +
                ", nameParfum='" + nameParfum + '\'' +
                ", priceParfum=" + priceParfum +
                ", stockParfum=" + stockParfum +
                ", dateCreate=" + dateCreate +
                '}';
    }

    public Parfum(String nameParfum, Double priceParfum, Double stockParfum, Date dateCreate) {
        super();
        this.nameParfum = nameParfum;
        this.priceParfum = priceParfum;
        this.stockParfum = stockParfum;
        this.dateCreate = dateCreate;
    }

    public Parfum() {
        super();
    }

    public Long getIdParfum() {
        return idParfum;
    }

    public void setIdParfum(Long idParfum) {
        this.idParfum = idParfum;
    }

    public String getNameParfum() {
        return nameParfum;
    }

    public void setNameParfum(String nameParfum) {
        this.nameParfum = nameParfum;
    }

    public Double getPriceParfum() {
        return priceParfum;
    }

    public void setPriceParfum(Double priceParfum) {
        this.priceParfum = priceParfum;
    }

    public Double getStockParfum() {
        return stockParfum;
    }

    public void setStockParfum(Double stockParfum) {
        this.stockParfum = stockParfum;
    }


    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public void save(Category cat) {
        System.out.println(cat.getCategory());
    }
}

