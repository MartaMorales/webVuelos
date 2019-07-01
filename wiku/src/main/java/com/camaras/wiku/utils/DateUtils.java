package com.camaras.wiku.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

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

    public String getDurarionFromVuelo(String horaSalida, String horaLlegada, String pattern){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        LocalTime salida = LocalTime.parse(horaSalida, formatter);
        LocalTime llegada = LocalTime.parse(horaLlegada, formatter);
        long seconds = Duration.between(salida, llegada).getSeconds();
        return TimeUnit.SECONDS.toHours(seconds)+" horas y "+
                (TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds)* 60))+" minutos.";
    }
}
