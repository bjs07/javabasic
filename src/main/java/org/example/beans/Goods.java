package org.example.beans;

public class Goods {
    private Long goodsId;

    public Goods() {
        this.goodsId=1L;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    private Integer price;
    private String goodsName;

    @Override
    public String toString() {
        return String.format("상품번호 : %d, 상품명 : %s,상품가격 :%d원",goodsId,goodsName,price);
    }

    public Goods(String goodsName, int price) {
        this.goodsName = goodsName;
        this.price = price;
    }
}
