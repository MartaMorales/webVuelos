package com.camaras.wiku.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class DateUtils {

    private static final Logger logger = LoggerFactory.getLogger(DateUtils.class);

    public ChronoLocalDate createDateFromStringWithFormat(String dateString, String format){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        ChronoLocalDate  date = null;
        try {

            date = ChronoLocalDate.from(formatter.parse(dateString));

        } catch (Exception e) {
            logger.error("There is an error parsing: ["+dateString+"] with format ["+format+"]. ERROR: \n"+e.getMessage());
        }
        return date;
    }
}
