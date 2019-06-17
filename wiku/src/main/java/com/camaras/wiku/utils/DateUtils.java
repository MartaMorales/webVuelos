package com.camaras.wiku.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateUtils {

    private static final Logger logger = LoggerFactory.getLogger(DateUtils.class);

    public LocalDateTime createDateFromStringWithFormat(String dateString, String format){
       LocalDateTime date = null;
        try {
            date = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern(format));

        } catch (Exception e) {
            logger.error("There is an error parsing: ["+dateString+"] with format ["+format+"]. ERROR: \n"+e.getMessage());
        }
        return date;
    }
}
