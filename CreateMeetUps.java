package MeetUps;

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
    //function setting the local variable to the parameters of the createNewMeetUp function
    protected void addMeetups(String title, String Location, String Description)
    {
        //setting information to the local variables inside parameters
        setMeetupTitle(title);
        setMeetupLocation(Location);
        setMeetupDescription(Description);

        //incrementing the ID by 1 and setting it as the meetUp Id

        int meetUpID = ID++;
        setMeetupId(meetUpID);

        //invoking createNewMeetUp meeting and assigning parameters to local variables

        //new instance of MeetUp class with variable inside parameters assigned
        Meetup newMeetUp = new Meetup(title,Location,Description, meetUpID);

        //adding this meetup to the ListArray
        storeMeetUps.add(newMeetUp);
        StoredID.add(meetUpID);
    }//addMeetups
    protected void UserCreatedMeetUps(String a, String b, String c, String d)
    {
        //scanner object
        Scanner keyboard = new Scanner(System.in);

        //print Statements prompt user for information and assigning them to local variables
        System.out.println(a);
        String UserCreatedTitle = keyboard.nextLine();

        System.out.println(b);
        String UserCreatedLocation = keyboard.nextLine();

        System.out.println(c);
        String userCreatedDescription= keyboard.nextLine();

        // assigning local variable to private variable and incrementing it by 1 to make it unique
        int userCreatedID = ID++;
        //setting it to the new Id so there is no overlap of ids created
        setMeetupId(userCreatedID);

        //new meetUp object assigning user information to the parameters
        Meetup userCreatedMeetUp = new Meetup(UserCreatedTitle,UserCreatedLocation,userCreatedDescription,userCreatedID);
        //adding user created meeting to the ArrayList
        storeMeetUps.add(userCreatedMeetUp);
        StoredID.add(userCreatedID);

        System.out.println("\n" + d);
        System.out.println("MeetUp ID: " + userCreatedID);
        System.out.println();
    }//UserCreatedMeetUps
}//class
