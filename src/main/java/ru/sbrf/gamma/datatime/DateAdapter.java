package ru.sbrf.gamma.datatime;

import javax.xml.bind.DatatypeConverter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAdapter {

    private DateAdapter() {}

    public static String unmarshal(Date date) {
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(date);
        return DatatypeConverter.printDateTime(cal);
    }

    public static Date marshal(String xmlDate) {
        return DatatypeConverter.parseDate(xmlDate).getTime();
    }
}