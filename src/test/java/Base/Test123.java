package Base;

import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test123 {
    public static void main(String[] args) throws ParseException {
        String inputDate = "01.01.24";
        String outputFormat = "dd MMMM yyyy";

        String convertedDate = convertDate(inputDate, outputFormat);
        System.out.println("Converted Date: " + convertedDate);
    }

    public static String convertDate(String inputDate, String outputFormat) throws ParseException {
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd.MM.yy");
        SimpleDateFormat outputDateFormat = new SimpleDateFormat(outputFormat);

        // Parse the input date
        Date date = inputDateFormat.parse(inputDate);

        // Format the date in the desired output format
        return outputDateFormat.format(date);
    }
}
