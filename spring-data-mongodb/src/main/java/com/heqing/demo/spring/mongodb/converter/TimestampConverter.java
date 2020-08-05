package com.heqing.demo.spring.mongodb.converter;

import org.springframework.core.convert.converter.Converter;

import java.sql.Timestamp;
import java.util.Date;

public class TimestampConverter implements Converter<Date, Timestamp> {

    @Override
    public Timestamp convert(Date date) {
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

}
