package me.dio.avanade.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterUtil {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LocalDate parse(String data) {
        return LocalDate.parse(data, FORMATTER);
    }

    public static String format(LocalDate data) {
        return data.format(FORMATTER);
    }
}
