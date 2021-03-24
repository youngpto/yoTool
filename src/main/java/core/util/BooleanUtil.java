package core.util;

import java.util.HashSet;
import java.util.Set;

/**
 * @ProjectName: yoTool
 * @Package: core.util
 * @ClassName: BooleanUtil
 * @Description: 作用描述
 * @Author: Young
 * @CreateDate: 2021/3/23 12:45
 * @UpdateUser: 更新者
 * @UpdateDate: 2021/3/23 12:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class BooleanUtil {
    private static final Set<String> TRUE_SET = new HashSet<>();

    static {
        TRUE_SET.add("true");
        TRUE_SET.add("yes");
        TRUE_SET.add("y");
        TRUE_SET.add("t");
        TRUE_SET.add("ok");
        TRUE_SET.add("1");
        TRUE_SET.add("on");
        TRUE_SET.add("是");
        TRUE_SET.add("对");
        TRUE_SET.add("真");
        TRUE_SET.add("對");
        TRUE_SET.add("√");
    }

    /**
     * 取相反值
     *
     * @param bool Boolean值
     * @return 对应反值
     */
    public static Boolean negate(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return bool ? Boolean.FALSE : Boolean.TRUE;
    }

    /**
     * 取相反值
     *
     * @param bool Boolean值
     * @return 对应反值
     */
    public static boolean negate(boolean bool) {
        return !bool;
    }

    /**
     * 检查Boolean值是否为true
     *
     * @param bool 被检查的Boolean值
     * @return 当值为true且非null时返回true
     */
    public static boolean isTrue(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    /**
     * 字符串转换boolean值
     *
     * @param valueStr 字符串
     * @return boolean值
     */
    public static boolean toBoolean(String valueStr) {
        if (StringUtil.isNotEmpty(valueStr)) {
            valueStr = valueStr.trim().toLowerCase();
            return TRUE_SET.contains(valueStr);
        }
        return false;
    }

    /**
     * boolean值转为int
     *
     * @param value Boolean值
     * @return int值
     */
    public static int toInt(boolean value) {
        return value ? 1 : 0;
    }

    /**
     * boolean值转为Integer
     *
     * @param value Boolean值
     * @return Integer值
     */
    public static Integer toInteger(boolean value) {
        return toInt(value);
    }

    /**
     * boolean值转为char
     *
     * @param value Boolean值
     * @return char值
     */
    public static char toChar(boolean value) {
        return (char) toInt(value);
    }

    /**
     * boolean值转为Character
     *
     * @param value Boolean值
     * @return Character值
     */
    public static Character toCharacter(boolean value) {
        return toChar(value);
    }

    /**
     * boolean值转为byte
     *
     * @param value Boolean值
     * @return byte值
     */
    public static byte toByte(boolean value) {
        return (byte) toInt(value);
    }

    /**
     * boolean值转为Byte
     *
     * @param value Boolean值
     * @return Byte值
     */
    public static Byte toByteObj(boolean value) {
        return toByte(value);
    }

    /**
     * boolean值转为long
     *
     * @param value Boolean值
     * @return long值
     */
    public static long toLong(boolean value) {
        return toInt(value);
    }

    /**
     * boolean值转为Long
     *
     * @param value Boolean值
     * @return Long值
     */
    public static Long toLongObj(boolean value) {
        return toLong(value);
    }

    /**
     * boolean值转为short
     *
     * @param value Boolean值
     * @return short值
     */
    public static short toShort(boolean value) {
        return (short) toInt(value);
    }

    /**
     * boolean值转为Short
     *
     * @param value Boolean值
     * @return Short值
     */
    public static Short toShortObj(boolean value) {
        return toShort(value);
    }

    /**
     * boolean值转为float
     *
     * @param value Boolean值
     * @return float值
     */
    public static float toFloat(boolean value) {
        return (float) toInt(value);
    }

    /**
     * boolean值转为Float
     *
     * @param value Boolean值
     * @return float值
     */
    public static Float toFloatObj(boolean value) {
        return toFloat(value);
    }

    /**
     * boolean值转为double
     *
     * @param value Boolean值
     * @return double值
     */
    public static double toDouble(boolean value) {
        return toInt(value);
    }

    /**
     * boolean值转为double
     *
     * @param value Boolean值
     * @return double值
     */
    public static Double toDoubleObj(boolean value) {
        return toDouble(value);
    }

    /**
     * 获取真值字符串true或假值字符串false
     *
     * @param bool boolean值
     * @return 对应字符串
     */
    public static String toStringTrueFalse(boolean bool) {
        return toString(bool, "true", "false");
    }

    /**
     * 获取真值字符串on或假值字符串off
     *
     * @param bool boolean值
     * @return 对应字符串
     */
    public static String toStringOnOff(boolean bool) {
        return toString(bool, "on", "off");
    }

    /**
     * 获取真值字符串yes或假值字符串no
     *
     * @param bool boolean值
     * @return 对应字符串
     */
    public static String toStringYesNo(boolean bool) {
        return toString(bool, "yes", "no");
    }

    /**
     * 根据传入值返回相应字符串
     *
     * @param bool        条件判断
     * @param trueString  boolean值为真时返回该字符串
     * @param falseString boolean值为假时返回该字符串
     * @return 对应字符串
     */
    public static String toString(boolean bool, String trueString, String falseString) {
        return bool ? trueString : falseString;
    }

    public static boolean and(boolean... array) {
        if (ArrayUtil.isEmpty(array)) {
            throw new IllegalArgumentException("The Array must not be empty !");
        }
        for (final boolean element : array) {
            if (!element) {
                return false;
            }
        }
        return true;
    }
}
