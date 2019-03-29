package br.com.johnsquispe.events.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataConveter {

    public static int toInt (String text) {

        int n = 0;

        try {

            n = Integer.valueOf(text);

        } catch (Exception e) {

        }

        return n;

    }

    public static long toLong (String text) {

        long n = 0;

        try {

            n = Long.valueOf(text);

        } catch (Exception e) {

        }

        return n;
    }

    public static Date toDateFromString (String text, String pattern) {

        Date data = null;

        try {

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            data = simpleDateFormat.parse(text);


        } catch (Exception e) {


        }

        return data;

    }

    public static String toStringFromDate (Date data, String pattern) {

        String text = null;

        try {

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            text = simpleDateFormat.format(data);


        } catch (Exception e) {


        }

        return text;

    }


}
