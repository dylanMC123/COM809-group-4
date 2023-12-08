package MeetUps;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/****************************************
 Filename: 
 Created by: Dylan Mc Canny 
 Created on: 
 Comment: 
 ***************************************/
public class CreateMeetUps extends Meetup
{
    //declaring static ID only in CreateMeetUps class
    private static int ID;
    static Scanner readHelp;
    static FileReader HelpFileName;
    //function setting the parameters to the Title,Location,Description and date
    protected void addMeetups(String title, String Location, String Description, String date)
    {
        //setting information to the local variables inside parameters
        setMeetupTitle(title);
        setMeetupLocation(Location);
        setMeetupDescription(Description);
        setMeetUpDate(date);

        //incrementing the ID by 1 and setting it as the meetUp Id
        int meetUpID = ID++;
        setMeetupId(meetUpID);

        //new instance of MeetUp class with variable inside parameters assigned
        Meetup newMeetUp = new Meetup(title,Location,Description, meetUpID, date);

        //adding this meetup to the ListArray and ID to StoredID for the binary search
        storeMeetUps.add(newMeetUp);
        StoredID.add(meetUpID);
    }//addMeetups
    protected void UserCreatedMeetUps(String a, String b, String c, String d)
    {
        //scanner object
        Scanner keyboard = new Scanner(System.in);

        //print Statements prompt user for information , Strings will be defined when needed as this function will be used again in different parts of the program
        // and assigning them to local variables
        System.out.println(a);
        String UserCreatedTitle = keyboard.nextLine();

        System.out.println(b);
        String UserCreatedLocation = keyboard.nextLine();

        System.out.println(c);
        String userCreatedDescription= keyboard.nextLine();

        // assigning local variable to private variable and incrementing it by 1 to continue the unique id sequence
        int userCreatedID = ID++;
        //setting it to the new Id so there is no overlap of ids created
        setMeetupId(userCreatedID);

        //invoking the userSetDate method to get the date of the meetup
        String userCreatedDate = userSetDate();

        //new meetUp object assigning user information to the parameters
        Meetup userCreatedMeetUp = new Meetup(UserCreatedTitle,UserCreatedLocation,userCreatedDescription,userCreatedID,userCreatedDate);

        //adding this meetup to the ListArray and ID to StoredID for the binary search
        storeMeetUps.add(userCreatedMeetUp);
        StoredID.add(userCreatedID);

        //printing out the ID for users to record/ so others cannot access it, and they can make changes themselves

        System.out.println("\n" + d);
        System.out.println("MeetUp ID: " + userCreatedID);
        System.out.println();
    }//UserCreatedMeetUps

    protected String userSetDate ()
    {
        //creating objects
        DecimalFormat df = new DecimalFormat("00");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner keyboard = new Scanner(System.in);

        //declaring a boolean variable, used later to check for correct input
        boolean checkTime = false;

        //prompting for user feedback on the year,month,day,hour and minute of the meetUP

        System.out.println("Enter valid date in (dd/mm/yyyy) format");
        String dateString = keyboard.nextLine();

        Date date;
        try
        {
            date = dateFormat.parse(dateString);
        }//try
        catch (ParseException e)
        {
            throw new RuntimeException(e);
        }//catch


        String fullDate = date.toString();
        String desiredOutput = fullDate.substring(0,10);
        String yearOutput= fullDate.substring(24,28);


        System.out.println("Please enter the hour in 24hr format: ");
        int userEnteredHour = keyboard.nextInt();

        System.out.println("Please enter the minutes: ");
        int userEnteredMinute = keyboard.nextInt();

        while (!checkTime)
        {
            if (userEnteredHour > 24||userEnteredHour < 0)
            {
                System.out.println("Incorrect Hour please enter a valid number:");
                userEnteredHour = keyboard.nextInt();
            }//if
            else if (userEnteredMinute > 59 || userEnteredMinute < 0)
            {
                System.out.println("Incorrect Hour please enter a valid number:");
                userEnteredMinute = keyboard.nextInt();
            }//elseif
            else
            {
                checkTime = true;
            }//else
        }//while


        return desiredOutput + " " + yearOutput + "\tTime:  " + df.format(userEnteredHour)  + ":" + df.format(userEnteredMinute);
    }

    //this method is to prepopulate the date for meetups already stored
    protected String setDate (int enteredYear, int enteredMonth, int enteredDay,int enteredHour, int enteredMinute)
    {
        DecimalFormat df = new DecimalFormat("00");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");


        String dateString = enteredDay + "/" + enteredMonth + "/" + enteredYear;

        Date date;
        try
        {
            date = dateFormat.parse(dateString);
        }
        catch (ParseException e)
        {
            throw new RuntimeException(e);
        }

        String fullDate = date.toString();
        String desiredOutput = fullDate.substring(0,10);
        String yearOutput= fullDate.substring(24,28);

        return desiredOutput + " " + yearOutput + "\tTime:  " + df.format(enteredHour)  + ":" + df.format(enteredMinute);
    }//setDate

    protected void helpOption() {
        String word;

        try {
            HelpFileName = new FileReader("helper.txt");
            readHelp = new Scanner(HelpFileName);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found");
        }

        while (readHelp.hasNext())
        {
            word = readHelp.next();
            if(word.equals("newline"))
            {
                System.out.println();
            }
            else
            {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }
}//class
