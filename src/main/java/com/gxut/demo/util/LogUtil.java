package com.gxut.demo.util;

/**
 * Created by Bitliker on 2017/9/21.
 */
public class LogUtil {

    public static void ln(Object message) {
        if (message != null) {
            System.out.println(message);
        }
    }

    public static void i(Object message) {
        if (message != null) {
            System.out.print(message);
        }
    }
}
