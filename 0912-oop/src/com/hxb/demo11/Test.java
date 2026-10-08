package com.hxb.demo11;

public class Test {
    /**
     * 枚举：枚举是一个特殊的javabean类，这个类的对象是有限个的
     * 应用场景：订单的状态、月份、星期、游戏角色职业...
     * 定义格式：
     *      public enum 枚举类名{
     *          枚举对象1,枚举对象2,枚举对象3;
     *          属性
     *          方法
     *      }
     * 使用枚举对象，不要自己创建，直接使用枚举类名.枚举对象名即可
     *
     * 所有的枚举对象，默认使用public static final修饰
     */

    static void main() {
        // 获取枚举对象
        OrderStatus status = OrderStatus.CANCELLED;
        System.out.println(status == OrderStatus.CANCELLED);

        // 匹配
        switch (status){
            case PAYMENT_PENDING -> System.out.println("待支付");
            case PROCESSING -> System.out.println("处理中");
            case SHIPPED -> System.out.println("已发货");
            case OUT_FOR_DELIVERY -> System.out.println("已出库");
            case DELIVERED -> System.out.println("已送达");
            case CANCELLED -> System.out.println("已取消");
        }
    }
}
