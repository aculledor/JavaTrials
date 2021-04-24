/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author aculledor
 */
public class ProbaDates {

    public ProbaDates() {
        this.work();
    }
    
    public void work(){
        try{
            //Days of calendar
            System.out.println("Days of the week");
            System.out.println("Sunday: " + Calendar.SUNDAY);       //1
            System.out.println("Monday: " + Calendar.MONDAY);       //2
            System.out.println("Tuesday: " + Calendar.TUESDAY);     //3
            System.out.println("Wednesday: " + Calendar.WEDNESDAY); //4
            System.out.println("Thrusday: " + Calendar.THURSDAY);   //5
            System.out.println("Friday: " + Calendar.FRIDAY);       //6
            System.out.println("Saturday: " + Calendar.SATURDAY);   //7
            
            //Get day of week from date
            System.out.println("\nDay of the week frome Date class");
            Date hoy = new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(hoy);
            System.out.println(cal.get(Calendar.DAY_OF_WEEK));
            
            //Get day of week from string date
            System.out.println("\nDay of the week frome String date");
            DateFormat format = new SimpleDateFormat("dd/MM/yy");
            Date str = format.parse("23/04/21");
            System.out.println(str);
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(str);
            System.out.println(cal.get(Calendar.DAY_OF_WEEK));
            
            //Get String date from date
            System.out.println("\nString date from Date");
            Date today = new Date();
            DateFormat format2 = new SimpleDateFormat("dd/MM/yy");
            String dateToday = format2.format(today);
            System.out.println(dateToday);
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
    
    
}
