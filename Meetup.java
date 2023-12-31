package MeetUps;

import java.util.ArrayList;

/****
 ***** Created by daire toner on 21/11/2023
 ***** Updated program description here
 ****/
public class Meetup
{
    //ArrayList to store MeetUp objects and the uniqueID, it uses a dynamic array too store its elements which better suits our purpose
    protected static ArrayList<Meetup> storeMeetUps = new ArrayList<Meetup>();
    protected static ArrayList<Integer> StoredID = new ArrayList<Integer>();

    // declaring Instance variables
    private String meetupTitle;
    private String meetupLocation;
    private String meetupDescription;
    private String meetUpDate;
    private int meetupId;

    //default constructor
    protected Meetup()
    {

    }

     // overloaded constructor
    protected Meetup(String title, String location, String description, int id, String dateOfMeetUp)
    {
        meetupTitle = title;
        meetupLocation = location;
        meetupDescription = description;
        meetupId = id;
        meetUpDate = dateOfMeetUp;
    }

    // getters and setter for meetUpId
    protected  int getMeetupId() {
        return meetupId;
    }
    protected  void setMeetupId(int meetupId) {
        this.meetupId = meetupId;
    }

    // getters and setter for meetUpTitle
    protected String getMeetupTitle()
    {
        return meetupTitle;
    }
    protected void setMeetupTitle(String title)
    {
        meetupTitle = title;
    }

    // getters and setter for meetUpLocation
    protected String getMeetupLocation() {
        return meetupLocation;
    }
    protected void setMeetupLocation(String location) {
        meetupLocation = location;
    }

    // getters and setter for meetDescription

    protected String getMeetupDescription() {
        return meetupDescription;
    }
    protected void setMeetupDescription(String description) {
        meetupDescription = description;
    }

    //getters and setter for meetUpDate
    public String getMeetUpDate()
    {
        return meetUpDate;
    }

    public void setMeetUpDate(String meetUpDate) {
        this.meetUpDate = meetUpDate;
    }




    //method to print all details stored inside the ListArray
    protected void PrintAllDetails()
    {
        for(Meetup storedMeetUps: storeMeetUps)
        {
            //assigning new variables to get information through the object of storedMeetUp
            String Title = storedMeetUps.getMeetupTitle();
            String location = storedMeetUps.getMeetupLocation();
            String description = storedMeetUps.getMeetupDescription();
            String storedMeetUpDate = storedMeetUps.getMeetUpDate();

            //printing the information stored in storedMeetUp object
            System.out.println("Title: " + Title + "\t");
            System.out.println("Location: " + location +"\t");
            System.out.println("Description: " + description);
            System.out.println("Date: " + storedMeetUpDate);
            System.out.println();
        }//foreach
    }//PrintAllDetails
}//class
