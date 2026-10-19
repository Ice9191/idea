package com.hxb.demo.demo06;

public class Person {
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }

    /**
     * 比较两个Person对象的age属性和name属性
     * @param p1
     * @param p2
     * @return
     */
    public static int compare(Person p1, Person p2){
        int r = p1.getAge().compareTo(p2.getAge());
        if(r != 0){
            return r;
        }else {
            return p1.getName().compareTo(p2.getName());
        }
    }

    /**
     * 只是为了演示需要
     * @param p1
     * @param p2
     * @param p3
     * @return
     */
    public static int compare(Person p1, Person p2, Person p3){
        return 0;
    }

    /**
     * 拼接两个Person对象的name属性，用","连接
     * @param p
     * @return
     */
    public Person concat(Person p){
        this.setName(this.getName() + "," + p.getName());
        System.out.println(this);
        return this;
    }
}
