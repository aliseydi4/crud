package com.crud.crud.entities;


import java.util.Objects;
public class Brand {
    private long id;
    private String brandName;
    private String color;
    private double price;
//
    public Brand() {
    }

    public Brand(long id, String brandName, String color, double price) {
        this.id = id;
        this.brandName = brandName;
        this.color = color;
        this.price = price;
    }

//

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand = (Brand) o;
        return id == brand.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
