package com.xzy.model;

import java.io.Serializable;

public class goods_table{
    private Integer goods_Id;

    private String goods_name;

    private Float goods_price;

    private String goods_pic;

    private String goods_des;

    private Integer goods_com;

    private Integer first_id;

    private Integer second_id;

    @Override
    public String toString() {
        return "goods_table{" +
                "goods_Id=" + goods_Id +
                ", goods_name='" + goods_name + '\'' +
                ", goods_price=" + goods_price +
                ", goods_pic='" + goods_pic + '\'' +
                ", goods_des='" + goods_des + '\'' +
                ", goods_com=" + goods_com +
                ", first_id=" + first_id +
                ", second_id=" + second_id +
                '}';
    }

    public Integer getGoods_Id() {
        return goods_Id;
    }

    public void setGoods_Id(Integer goods_Id) {
        this.goods_Id = goods_Id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public Float getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(Float goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_pic() {
        return goods_pic;
    }

    public void setGoods_pic(String goods_pic) {
        this.goods_pic = goods_pic;
    }

    public String getGoods_des() {
        return goods_des;
    }

    public void setGoods_des(String goods_des) {
        this.goods_des = goods_des;
    }

    public Integer getGoods_com() {
        return goods_com;
    }

    public void setGoods_com(Integer goods_com) {
        this.goods_com = goods_com;
    }

    public Integer getFirst_id() {
        return first_id;
    }

    public void setFirst_id(Integer first_id) {
        this.first_id = first_id;
    }

    public Integer getSecond_id() {
        return second_id;
    }

    public void setSecond_id(Integer second_id) {
        this.second_id = second_id;
    }
}