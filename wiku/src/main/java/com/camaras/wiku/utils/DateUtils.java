package com.camaras.wiku.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DateUtils {

    private static final Logger logger = LoggerFactory.getLogger(DateUtils.class);

    public Date createDateFromStringWithFormat(String dateString, String format){
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = formatter.parse(dateString);
        } catch (ParseException e) {
            logger.error("There is an error parsing: ["+dateString+"] with format ["+format+"]. ERROR: \n"+e.getMessage());
        }
        return date;
    }
}
