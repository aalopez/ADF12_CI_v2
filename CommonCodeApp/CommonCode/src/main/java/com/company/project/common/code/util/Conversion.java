package com.company.project.common.code.util;

public final class Conversion {

    /**
     * Converts to int
     * @param str String to be converted
     * @return int value
     */
    public int toInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception ex) {
            throw new RuntimeException();
        }
    }
}
