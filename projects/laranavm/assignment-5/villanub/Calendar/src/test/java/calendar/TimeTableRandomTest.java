package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Random Test Generator  for TimeTable class.
 */
public class TimeTableRandomTest {

//    private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
//    private static final int NUM_TESTS=100;
//
//    TimeTable tt = new TimeTable();
//
//    public static String RandomSelectMethod(Random random) {
//
//        String[] methodArray = new String[] {"getApptRange","deleteAppt" };// The list of the of methods to be tested in the Appt class
//        int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
//
//        return methodArray[n] ; // return the method name
//    }
//
//    public static GregorianCalendar randomGregorianCalendar(Random random) {
//
//        int day = ValuesGenerator.RandInt(random);
//        int month = ValuesGenerator.getRandomIntBetween(random, 1, 11);
//        int year = ValuesGenerator.getRandomIntBetween(random, 0001, 0005);
//
//        GregorianCalendar gregDay = new GregorianCalendar( year, month, day);
//
//        return gregDay; // return the method name
//    }
//
//    public static Appt randomAppt(Random random) {
//
//        int startHour=ValuesGenerator.RandInt(random);
//        int startMinute=ValuesGenerator.RandInt(random);
//        int startDay=ValuesGenerator.RandInt(random);
//        int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
//        int startYear=ValuesGenerator.getRandomIntBetween(random, 0001, 0005);
//        String title="Birthday Party";
//        String description="This is my birthday party.";
//        Appt appt = new Appt(startHour,
//                startMinute ,
//                startDay ,
//                startMonth ,
//                startYear ,
//                title,
//                description);
//
//        return appt; // return the method name
//    }
//    /**
//     * Generate Random Tests that tests TimeTable Class.
//     */
//    @Test
//    public void test01() throws Throwable {
//
//        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
//        LinkedList<Appt> listAppts = new LinkedList<Appt>();
//        LinkedList<Appt> delAppts = new LinkedList<Appt>();
//
//        //////////////////////////////////////////////////////////////////////////
//        long startTime = Calendar.getInstance().getTimeInMillis();
//        long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
//
//        System.out.println("Start testing...");
//
//        try{
//            for (int iteration = 0; elapsed < TestTimeout; iteration++) {
//                long randomseed =System.currentTimeMillis(); //10
//                Random random = new Random(randomseed);
//
//                for (int i = 0; i < NUM_TESTS; i++) {
//                    String methodName = TimeTableRandomTest.RandomSelectMethod(random);
//
//                    if (methodName.equals("getApptRange")) {
//                        try {
//
//                            GregorianCalendar today = TimeTableRandomTest.randomGregorianCalendar(random);
//                            GregorianCalendar tomorrow = TimeTableRandomTest.randomGregorianCalendar(random);
//
//                            int origSize = listAppts.size();
//                            Appt[] appts = new Appt[10];
//                            for(int a = 0; a < appts.length; a++) {
//                                appts[a] = randomAppt(random);
//                                listAppts.add(appts[a]);
//                            }
//
//                            calDays = tt.getApptRange(listAppts, today, tomorrow);
//
//                            if(!today.before(tomorrow)){
////                                if(!appts[0].getValid()) { assertEquals(origSize, calDays.size()); }
////                                else { assertEquals(origSize+1, calDays.size()); }
//                                fail();
//                            }
////                            else {  }
//
//                        } catch (DateOutOfRangeException expected) {}
//                    }
//                    else {
//
//                        GregorianCalendar today = new GregorianCalendar(0001,1,1);
//                        GregorianCalendar tomorrow = new GregorianCalendar(0001,1,10);
//
//                        int origSize = listAppts.size();
//                        Appt[] appts = new Appt[10];
//                        for(int a = 0; a < appts.length; a++) {
//                            appts[a] = randomAppt(random);
//                            listAppts.add(appts[a]);
//                        }
//
//                        calDays = tt.getApptRange(listAppts, today, tomorrow);
//
//                        for(int a = 0; a < appts.length; a++) {
//
//                            if (ValuesGenerator.getBoolean(.05f,random)) {
//                                delAppts = tt.deleteAppt(listAppts, null);
//                                delAppts = tt.deleteAppt(null, appts[0]);
//                            }
//                            delAppts = tt.deleteAppt(listAppts, appts[a]);
//                        }
//                    }
//                }
//                elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
//                if((iteration%10000)==0 && iteration!=0 ) {
//                }
//            }
//        } catch(NullPointerException e){
//
//        }
//        System.out.println("Done testing...");
//    }
}