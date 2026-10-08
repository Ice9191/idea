package com.hxb;

public class demo11 {
    /**
     * 要发送邮件或短信，要先创建类Email和Sms，然后实现Message接口，然后创建对象，最后调用sendMessage方法才能发送，过程有点繁琐
     * Lambda表达式可以简化这个过程，接口的抽象方法的具体实现直接在Lambda表达式中写即可
     *
     * 注意：Lambda表达式只能用于有且只有一个抽象方法的接口，这样接口又称为函数式接口（Functional Interface），因为当有多个抽象方法时，Lambda表达式就无法确定要实现哪个抽象方法
     * 函数式接口：只有函数式接口才能用Lambda表达式简化代码
     * 可以使用注解@FunctionalInterface来标记一个接口为函数式接口，编译器会检查接口是否有多个抽象方法，如果有，就会报错
     * 这个注解不是必须的，但是建议使用，因为如果忘记使用，编译器就不会检查接口是否有多个抽象方法，导致程序运行时出错
     * Lambda也算是一种语法糖
     *
     * Lambda表达式简化了什么？
     *  少了创建类的步骤，直接在Lambda表达式中实现接口的抽象方法即可
     */

    public static void main(String[] args) {

        Email email = new Email("123@qq.com");
        sendMessage(email);

        Sms sms = new Sms("13800000000");
        sendMessage(sms);

        // 用Lambda表达式发送短信，相当于直接传入了一个Message对象
        // ()：就是send方法的()，参数类型可以省略，编译器能自动推断，只有一个参数时可以不写括号
        // {}：就是实现send方法的方法体
        Message lambda = (name, age)->{
            System.out.println("你好" + name);
            System.out.println("hello");
            return "success";
        };
        sendMessage(lambda);
    }

    // 因为参数类型为Message，不管传入的Email对象还是Sms对象，都可以调用send方法
    static void sendMessage(Message message){
        String result = message.send("张三", 18);
        System.out.println(result);
    }
}

@FunctionalInterface
interface Message {
    String send(String name, int age);
}

class Email implements Message {
    String email;

    public Email(){
    }

    public Email(String email) {
        this.email = email;
    }

    @Override
    public String send(String name, int age) {
        System.out.println("发送邮件到：" + email);
        return "success";
    }
}

class Sms implements Message {
    String phone;

    public Sms(){
    }

    public Sms(String phone) {
        this.phone = phone;
    }

    @Override
    public String send(String name, int age) {
        System.out.println("发送短信到：" + phone);
        return "success";
    }
}