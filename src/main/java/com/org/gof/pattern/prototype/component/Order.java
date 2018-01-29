package com.org.gof.pattern.prototype.component;

import java.util.Date;

public class Order implements Cloneable, Api {
    int num;
    String description;
    Date createdDate;
    Product product;

    public Order(int num, String description, Date createdDate, Product productType) {
        this.num = num;
        this.description = description;
        this.createdDate = createdDate;
        this.product = productType;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Object clone(){
        Order order = null;

        try {
            order = (Order) super.clone();
            order.setProduct((Product) order.getProduct().clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return order;
    }

    @Override
    public String toString() {
        return "Order{" +
                "num=" + num +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                ", product=" + product +
                '}';
    }

    @Override
    public void produce() {
        System.out.println("Creating orders");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (num != order.num) return false;
        if (description != null ? !description.equals(order.description) : order.description != null) return false;
        if (createdDate != null ? !createdDate.equals(order.createdDate) : order.createdDate != null) return false;
        return product != null ? product.equals(order.product) : order.product == null;
    }

    @Override
    public int hashCode() {
        int result = num;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        return result;
    }
}
