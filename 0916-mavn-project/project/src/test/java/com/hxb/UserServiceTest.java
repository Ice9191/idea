package com.hxb;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

// 展示测试类是用来测试什么的
@DisplayName("用户信息的测试类")
public class UserServiceTest {
    /**
     * 在test的java目录下，创建测试类，并编写对应的测试方法，并在方法上声明@Test注解
     * 运行单元测试，通过：绿色，失败：红色
     * 注意：JUnit单元测试类命名规范为：XxxxTest，JUnit单元测试的方法必须声明为public void testXxxx()
     *
     * 单元测试运行不报错（绿色），就代表代码没问题，测试通过吗？并不是的
     *
     * 断言：JUnit提供了一些辅助方法，用来帮我们确定被测试的方法是否按照预期的效果正常工作，这种方式称为断言
     * 断言方法：
     *  Assertions.assertEquals(Object exp（期望）, Object act（实际）, String msg)：检查两个值是否相等，不相等就报错
     *  Assertions.assertNotEquals(Object unexp, Object act, String msg)：检查两个值是否不相等，相等就报错
     *  Assertions.assertNull(Object act, String msg)：检查对象是否为null，不为null，就报错
     *  Assertions.assertNotNull(Object act, String msg)：检查对象是否不为null，为null，就报错
     *  Assertions.assertTure(boolean condition, String msg)：检查条件是否为true，不为true，就报错
     *  Assertions.assertFalse(boolean condition, String msg)：检查条件是否为false，不为false，就报错
     *  Assertions.assertThrows(Class expType, Executable exec, String msg)：检查程序运行抛出的异常，是否符合预期
     *
     * JUnit常见注解：
     *  @Test：测试类中的方法用它修饰才能成为测试方法，才能启动执行（单元测试）
     *  @ParameterizedTest：参数化测试的注解（可以让单个测试运行多次，每次运行时传入不同参数，用了该注解就不需要@Test注解了）
     *  @ValueSource：参数化测试的参数来源，赋予测试方法参数（与参数化测试注解配合@ParameterizedTest使用）
     *  @DisplayName：指定测试类、测试方法显示的名称（默认为类名、方法名）
     *  @BeforeEach：用来修饰一个实例方法，该方法会在每一个测试方法执行之前执行一次（初始化资源，准备工作）
     *  @AfterEach：用来修饰一个实例方法，该方法会在每一个测试方法执行之后执行一次（释放资源，清理工作）
     *  @BeforeAll：用来修饰一个静态方法，该方法会在所有测试方法之前只执行一次（初始化资源，准备工作）
     *  @AfterAll：用来修饰一个静态方法，该方法会在所有测试方法之后只执行一次（释放资源，清理工作）
     */

    @Test
    public void testGetAge(){
        UserService user = new UserService();
        int age = user.getAge("45042220000101001X");
        System.out.println(age);
    }

    @Test
    public void testGetGender(){
        UserService user = new UserService();
        UserService.Gender gender = user.getGender("45042220000101001X");
        // equals断言
        // 只需要根据绿了还是红了，就可以判断测试是否通过了
        Assertions.assertEquals("男", gender.getLabel(), "性别获取逻辑有问题");
        System.out.println(gender.getLabel());
    }

    @Test
    public void testGetGenderWithAssert(){
        UserService user = new UserService();
        // Throws断言
        // 测试异常
        // 第一个参数：期望抛出的异常类型；第二个参数：就是一个函数式接口
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            // 判断这个业务方法抛出的异常是否符合预期
            // 如果一致，就通过测试，否则测试失败
            user.getAge(null);
        });
    }

    // 参数化测试
    @DisplayName("测试用户性别")
    @ParameterizedTest
    // 在运行时，会把ValueSource注解中的参数一个一个赋值给测试方法的参数idCard
    @ValueSource(strings = {"45042220000101001X", "45042220000101005X", "45042220000101003X"})
    public void testGetGenderWithParameterizedTest(String idCard){
        UserService user = new UserService();
        UserService.Gender gender = user.getGender(idCard);
        // equals断言
        Assertions.assertEquals("男", gender.getLabel(), "性别获取逻辑有问题");
    }

    // @BeforeAll // 在所有测试方法之前只执行一次
    // public static void beforeAll(){
    //     System.out.println("beforeAll");
    // }

    // @AfterAll // 在所有测试方法之后只执行一次
    // public static void afterAll(){
    //     System.out.println("afterAll");
    // }

    // @BeforeEach // 在每一个测试方法执行之前都会执行一次
    // public void beforeEach(){
    //     System.out.println("beforeEach");
    // }

    // @AfterEach // 在每一个测试方法执行之后都会执行一次
    // public void afterEach(){
    //     System.out.println("afterEach");
    // }
}
