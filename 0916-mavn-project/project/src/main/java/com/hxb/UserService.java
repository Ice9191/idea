package com.hxb;

import java.awt.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * 用户业务类：根据身份证号（18 位）计算年龄与性别。
 *
 * <p>说明：18 位身份证号的第 17 位（从 1 开始计数）为顺序码的最后一位，
 * 奇数表示男性、偶数表示女性；第 7-14 位为出生日期，格式 yyyyMMdd。</p>
 */
public class UserService {

    /** 18 位身份证号码长度。 */
    private static final int ID_CARD_LENGTH = 18;

    /** 出生日期在身份证号中的起始下标（含）。 */
    private static final int BIRTH_DATE_BEGIN_INDEX = 6;

    /** 出生日期在身份证号中的结束下标（不含）。 */
    private static final int BIRTH_DATE_END_INDEX = 14;

    /** 性别标识位在身份证号中的下标（第 17 位）。 */
    private static final int GENDER_INDEX = 16;

    /** 出生日期格式。 */
    private static final DateTimeFormatter BIRTH_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");

    /**
     * 根据身份证号计算年龄。
     *
     * @param idCard 18 位身份证号码
     * @return 周岁年龄
     * @throws IllegalArgumentException 身份证号为空、长度或格式非法时抛出
     */
    public int getAge(String idCard) {
        LocalDate birthday = parseBirthday(idCard);
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    /**
     * 根据身份证号判断性别。
     *
     * @param idCard 18 位身份证号码
     * @return {@link Gender#MALE} 或 {@link Gender#FEMALE}
     * @throws IllegalArgumentException 身份证号为空、长度或格式非法时抛出
     */
    public Gender getGender(String idCard) {
        validate(idCard);
        int genderDigit = idCard.charAt(GENDER_INDEX) - '0';
        return genderDigit % 2 == 0 ? Gender.FEMALE : Gender.MALE;
    }

    /**
     * 一次性解析出用户的年龄和性别。
     *
     * @param idCard 18 位身份证号码
     * @return 用户信息
     * @throws IllegalArgumentException 身份证号为空、长度或格式非法时抛出
     */
    public UserInfo getUserInfo(String idCard) {
        validate(idCard);
        LocalDate birthday = parseBirthday(idCard);
        int age = Period.between(birthday, LocalDate.now()).getYears();
        int genderDigit = idCard.charAt(GENDER_INDEX) - '0';
        Gender gender = genderDigit % 2 == 0 ? Gender.FEMALE : Gender.MALE;
        return new UserInfo(idCard, birthday, age, gender);
    }

    /**
     * 从身份证号中解析出生日期。
     */
    private LocalDate parseBirthday(String idCard) {
        validate(idCard);
        String birthdayText = idCard.substring(BIRTH_DATE_BEGIN_INDEX, BIRTH_DATE_END_INDEX);
        try {
            return LocalDate.parse(birthdayText, BIRTH_DATE_FORMATTER);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException("身份证号中的出生日期非法: " + birthdayText, e);
        }
    }

    /**
     * 校验身份证号基本格式。
     */
    private void validate(String idCard) {
        if (idCard == null || idCard.isBlank()) {
            throw new IllegalArgumentException("身份证号不能为空");
        }
        String trimmed = idCard.trim();
        if (trimmed.length() != ID_CARD_LENGTH) {
            throw new IllegalArgumentException("身份证号必须为 18 位: " + trimmed);
        }
        for (int i = 0; i < trimmed.length(); i++) {
            char c = trimmed.charAt(i);
            boolean isLastCheckCode = i == ID_CARD_LENGTH - 1 && (c == 'X' || c == 'x');
            if (!Character.isDigit(c) && !isLastCheckCode) {
                throw new IllegalArgumentException("身份证号包含非法字符: " + c);
            }
        }
    }

    /**
     * 性别枚举。
     */
    public enum Gender {
        /** 男性。 */
        MALE("男"),
        /** 女性。 */
        FEMALE("女");

        private final String label;

        Gender(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    /**
     * 用户信息载体。
     */
    public static class UserInfo {

        private final String idCard;
        private final LocalDate birthday;
        private final int age;
        private final Gender gender;

        public UserInfo(String idCard, LocalDate birthday, int age, Gender gender) {
            this.idCard = idCard;
            this.birthday = birthday;
            this.age = age;
            this.gender = gender;
        }

        public String getIdCard() {
            return idCard;
        }

        public LocalDate getBirthday() {
            return birthday;
        }

        public int getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "UserInfo{"
                    + "idCard='" + idCard + '\''
                    + ", birthday=" + birthday
                    + ", age=" + age
                    + ", gender=" + gender.getLabel()
                    + '}';
        }
    }
}
