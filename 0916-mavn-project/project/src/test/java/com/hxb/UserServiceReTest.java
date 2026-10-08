package com.hxb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("用户信息的测试类")
public class UserServiceReTest {
    /**
     * 原则：编写测试方法时，要考虑到所有可能的情况（尤其是边界值，正常值也要测试）
     * 边界值：比如null值、空串、长度不足18位、长度超过18位等
     * 正常值：比如正常长度的字符串
     *
     * Run with Coverage：会自动计算出测试方法的覆盖率，即有多少行代码被测试了，有多少行代码没有被测试了
     *  Class：代表class文件对应的类的测试覆盖率
     *  Method：代表方法的测试覆盖率
     *  Line：代表行的测试覆盖率
     *  Branch：代表分支的测试覆盖率，比如if、else、switch、case等语句的分支覆盖率
     */

    private UserService user;

    @BeforeEach
    public void setup(){
        // 在每个测试方法执行前，先创建一个UserService对象
        user = new UserService();
    }

    @Test
    @DisplayName("获取性别null值")
    public void testGetGenderNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> user.getGender(null));
    }

    @Test
    @DisplayName("获取性别空串")
    public void testGetGenderEmpty(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> user.getGender(""));
    }

    @Test
    @DisplayName("获取性别长度不足18位")
    public void testGetGenderLength(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> user.getGender("123"));
    }

    @Test
    @DisplayName("获取性别长度超过18位")
    public void testGetGenderLengthOver(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> user.getGender("1234567890123456789012312"));
    }

    @Test
    @DisplayName("获取性别正常男性")
    public void testGetGenderMale(){
        Assertions.assertEquals(UserService.Gender.MALE.getLabel(), user.getGender("44030419900101001X").getLabel());
    }

    @Test
    @DisplayName("获取性别正常女性")
    public void testGetGenderFemale(){
        Assertions.assertEquals(UserService.Gender.FEMALE.getLabel(), user.getGender("44030419900101002X").getLabel());
    }

    // ----------------------测试getAge方法----------------------

    @Test
    @DisplayName("获取年龄正常值")
    public void testGetAgeNormal(){
        Assertions.assertEquals(36, user.getAge("44030419900101001X"));
    }

    @Test
    @DisplayName("获取年龄null值")
    public void testGetAgeNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> user.getAge(null));
    }

    @Test
    @DisplayName("获取年龄长度不足18位")
    public void testGetAgeLength(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> user.getAge("123"));
    }

    @Test
    @DisplayName("获取年龄长度超过18位")
    public void testGetAgeLengthOver(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> user.getAge("1234567890123456789012312"));
    }
}
