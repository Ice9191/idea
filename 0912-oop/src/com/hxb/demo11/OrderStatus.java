package com.hxb.demo11;

public enum OrderStatus {
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    OUT_FOR_DELIVERY("已出库"),
    DELIVERED("已送达"),
    CANCELLED("已取消");

    private String status;

    // private可以省略
    OrderStatus(String status) {
        System.out.println("枚举项"+status+"被创建了");
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
