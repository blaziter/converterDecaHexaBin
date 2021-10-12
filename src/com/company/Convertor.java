package com.company;

import java.util.Locale;

public class Convertor {

    public static String DiB (int converted) {
        return Integer.toBinaryString(converted);
    }

    public static String DiH (int converted) {
        return Integer.toHexString(converted).toUpperCase();
    }

    public static int BiD (String converted) {
        return Integer.parseInt(converted, 2);
    }

    public static String BiH (String converted) {
        return Integer.toHexString(BiD(converted)).toUpperCase();
    }

    public static int HiD (String converted) {
        return Integer.parseInt(converted, 16);
    }

    public static String HiB (String converted) {
        return DiB(Integer.parseInt(converted, 16));
    }
}
