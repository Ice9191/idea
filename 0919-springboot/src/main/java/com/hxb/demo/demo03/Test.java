package com.hxb.demo.demo03;

public class Test {
    /**
     * 三层架构：
     *  controller：控制层，接收前端发送的请求，对请求进行处理，并响应数据
     *  service：业务逻辑层，处理具体的业务逻辑
     *  dao：数据访问层（Data Access Object，持久层），负责数据访问操作，包括数据的增、删、改、查
     *
     * 分层解耦：
     *  耦合：衡量软件中各个层/各个模块的依赖关联程度，比如当service层代码变化时，controller层代码也需要相应的变化，就称为这两层耦合了，service层和dao层也耦合了
     *  内聚：软件中各个功能模块内部的功能联系，比如service层只用来处理业务逻辑，不包含任何数据访问的代码，就称这个模块的内聚程度高
     *  软件设计原则：高内聚，低耦合
     *
     * 如何完成层与层之间的解耦：使用Spring中的两个重要概念
     *  控制反转：Inversion Of Control，简称IOC。对象的创建控制权由程序自身转移到外部（容器），这种思想称为控制反转
     *  依赖注入：Dependency Injection，简称DI。容器为应用程序提供运行时，所依赖的资源，称之为依赖注入
     *  Bean对象：IOC容器中创建、管理的对象，称之为Bean
     *
     * IOC和DI入门：
     *  1. 将Dao以及Service层的实现类，交给IOC容器管理
     *      使用@Component注解，表示将当前类生成的对象交给IOC容器管理（注意是在实现类上使用，而不是接口上）
     *  2. 为Controller以及Service层注入运行时所依赖的对象
     *      使用@Autowired注解，表示应用程序运行时，会自动的查询该类型的Bean对象，并赋值给成员变量
     *
     * IOC详解：要把某个对象交给IOC容器管理，需要在对应的类上加上如下注解之一：
     *  @Component：声明bean的基础注解；不属于以下三类时，用此注解（可以用于工具类）
     *  @Controller：@Component的衍生注解；标注在控制层类上（控制层的bean只能用@Controller注解）
     *  @Service：@Component的衍生注解；标注在业务层类上
     *  @Repository：@Component的衍生注解；标注在数据访问层类上（由于与mybatis整合，用的少）
     *  注意：声明bean的时候，可以通过注解的value属性指定bean的名字，如果没有指定，默认为类名首字母小写
     *  前面声明bean的四大注解，要想生效，还需要被组件扫描注解@ComponentScan扫描
     *  @ComponentScan虽然没有显式配置，但是实际上已经包含在了启动类声明注解@SpringBootApplication中，默认扫描的范围是启动类所在包及其子包
     *
     * DI详解：基于@Autowire进行依赖注入的常见方式有如下三种：
     *  1. 属性注入（常用）
     *  2. 构造函数注入（常用）
     *  3. setter注入
     *  @Autowired注解，默认是按照类型进行注入的
     *  如果存在多个相同类型bean，将会报错，解决方式：
     *      1. 在类外使用@Primary注解，表示当存在多个相同类型bean时，优先注入被@Primary注解的bean
     *      2. 使用@Qualifier注解，表示当存在多个相同类型bean时，通过bean的名称进行注入，需要配合@Autowired注解一起使用
     *      3. 使用@Resource注解，表示当存在多个相同类型bean时，通过 name = bean的名称 进行注入
     */
}
