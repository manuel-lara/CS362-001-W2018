package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
//    private static final int NUM_TESTS=100;
//
//    /**
//     * Generate Random Tests that tests CalDay Class.
//     */
//    private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
//
//    GregorianCalendar cal = new GregorianCalendar(2000, 01, 01);
//    CalDay calday1 = new CalDay(cal);
//
//    @Test
//	  public void test0()  throws Throwable  {
//
//         long startTime = Calendar.getInstance().getTimeInMillis();
//         long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
//
//         System.out.println("Start testing...");
//
//         try{
//             for (int iteration = 0; elapsed < TestTimeout; iteration++) {
//                 long randomseed =System.currentTimeMillis(); //10
//                 //			System.out.println(" Seed:"+randomseed );
//                 Random random = new Random(randomseed);
//
//                 int startHour=ValuesGenerator.RandInt(random);
//                 int startMinute=ValuesGenerator.RandInt(random);
//                 int startDay=ValuesGenerator.RandInt(random);;
//                 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
//                 int startYear=ValuesGenerator.RandInt(random);
//                 String title="Birthday Party";
//                 String description="This is my birthday party.";
//                 //Construct a new Appointment object with the initial data
//                 Appt appt = new Appt(startHour,
//                         startMinute ,
//                         startDay ,
//                         startMonth ,
//                         startYear ,
//                         title,
//                         description);
////                 if(!appt.getValid())continue;
//
//                 for (int i = 0; i < NUM_TESTS; i++) {
//
//                     int originalSize = calday1.getAppts().size();
//                     calday1.addAppt(appt);
//                     if( appt.getValid() ) {
//                        assertEquals( originalSize+1, calday1.getAppts().size());
//                     }
//                     else {
//                         assertEquals(originalSize, calday1.getAppts().size());
//                     }
//                 }
//                     ////////////////////////////////////////////////////////////////////
//                elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
//                if((iteration%10000)==0 && iteration!=0 ) {
////                 System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);
//                }
//             }
//         } catch(NullPointerException e){
//
//         }
//         System.out.println("Done testing...");
//	 }
}
