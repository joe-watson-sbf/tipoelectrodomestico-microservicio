package co.com.electrodomestico.tipoelectrodomestico.util;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtil {

    public static String DATE_FORMAT_HORA = "yyyy-MM-dd HH:mm:ss";

    public static String getCurrenDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_HORA, Locale.ENGLISH);
        Date date = new Date();
        return dateFormat.format(date);
    }


    public static Date convertStringToDate(String stringDate) {
        Date date = null;
        try {
            DateFormat format = new SimpleDateFormat(DATE_FORMAT_HORA, Locale.ENGLISH);
            date = format.parse(stringDate);
        } catch (Exception e) {
            e.getMessage();
        }
        return date;
    }


    public static double minutesDiff(Date earlierDate, Date laterDate)
    {
        if( earlierDate == null || laterDate == null ) return 0;

        double minutos = (double)((laterDate.getTime()/60000) - (earlierDate.getTime()/60000));

        return minutos / 60;
    }
}
