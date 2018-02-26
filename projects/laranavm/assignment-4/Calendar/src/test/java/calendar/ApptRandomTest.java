package calendar;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Random Test Generator  for Appt class.
 */
public class ApptRandomTest {

    private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
    private static final int NUM_TESTS=100;

    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"isValid", "setRecurDays"};// The list of the of methods to be tested in the Appt class

        int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

        return methodArray[n] ; // return the method name
//		return "setStartHour";
    }

    public static int[] RandomSelectRecurDays(Random random){
        int[][] RecurArray = new int[2][1];// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER
        RecurArray[0][0] = 0;
        RecurArray[1] = null;

        int n = random.nextInt(2);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return appointments to recur forever or Never recur
    }

    public static int RandomSelectRecur(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

        int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur
    }

    public static int RandomSelectRecurForEverNever(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

        int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return appointments to recur forever or Never recur
    }

    public static int randDays(Random random){
        int[] RecurArray = new int[] {-1, 0, 29, 32};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

        int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur
    }

    public static int randHours(Random random){
        int[] RecurArray = new int[] {-1, 0, 23, 24};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

        int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur
    }

    public static int randMins(Random random){
        int[] RecurArray = new int[] {-1, 0, 59, 60};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

        int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur
    }

    public static int randMonths(Random random){
        int[] RecurArray = new int[] {0, 1, 12, 13};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

        int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur
    }

    @Test
    public void radnomtest()  throws Throwable  {

        long startTime = Calendar.getInstance().getTimeInMillis();
        long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

        System.out.println("Start testing...");

        try{
            for (int iteration = 0; elapsed < TestTimeout; iteration++) {
                long randomseed =System.currentTimeMillis(); //10
                Random random = new Random(randomseed);

                int startHour=ValuesGenerator.RandInt(random);
                int startMinute=ValuesGenerator.RandInt(random);
                int startDay=ValuesGenerator.RandInt(random);
                int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
                int startYear=ValuesGenerator.RandInt(random);
                String title="Birthday Party";
                String description="This is my birthday party.";
                //Construct a new Appointment object with the initial data
                Appt appt = new Appt(startHour,
                        startMinute ,
                        startDay ,
                        startMonth ,
                        startYear ,
                        title,
                        description);
                if(!appt.getValid())continue;

                for (int i = 0; i < NUM_TESTS; i++) {
                    String methodName = ApptRandomTest.RandomSelectMethod(random);

                    if (methodName.equals("isValid")) {
                        int newDay = randDays(random);
                        appt.setStartDay(newDay);

                        int newHour = randHours(random);
                        appt.setStartHour(newHour);

                        int newMin = randMins(random);
                        appt.setStartMinute(newMin);


//                        try {
//                            int newMonth = randMonths(random);
//                            appt.setStartMonth( newMonth );
//                            fail();
//                        }catch(ArrayIndexOutOfBoundsException e) {}
                    }
                    else {

                        int[] recDays = RandomSelectRecurDays(random);
                        int recurBy = RandomSelectRecur(random);
                        int recurFor = RandomSelectRecurForEverNever(random);

                        appt.setRecurrence(recDays, recurBy, 0, recurFor);
                    }
                }
                elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
                if((iteration%10000)==0 && iteration!=0 ) {
//                    System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);
                }
            }
        }catch(NullPointerException e){

        }
        System.out.println("Done testing...");
    }
}


