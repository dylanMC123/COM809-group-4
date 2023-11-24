package MeetUps;

import java.util.Scanner;

/****************************************
 Filename: 
 Created by: Dylan Mc Canny 
 Created on: 
 Comment: 
 ***************************************/
public class DeleteMeetUps extends Meetup
{
    protected void deleteCurrentMeetups()
    {
       //iterate through the arrayList and find if the unique id matches
        // find the array position and delete it

        Scanner keyboard = new Scanner(System.in);
        int uniqueIdEntered;
        int meetUpPosition = 0;
        boolean userInputMatchesId = false;

        System.out.println("Please enter the unique ID of the MeetUp");
        uniqueIdEntered = keyboard.nextInt();

        for (Meetup findMeetUps: storeMeetUps)
        {
            int currentMeetupId = findMeetUps.getMeetupId();

            if(uniqueIdEntered == currentMeetupId)
            {
                userInputMatchesId = true;
                meetUpPosition = storeMeetUps.indexOf(findMeetUps);
            }
        }
        
        if (userInputMatchesId)
        {
            storeMeetUps.remove(meetUpPosition);
        }
        else if (!userInputMatchesId)
        {
            System.out.println("This ID was not found");
        }
    }//deleteCurrentMeetups

    /*
    public void updateMeetupsInformation()
    {
        CreateMeetUps updatedMeetUp= new CreateMeetUps();
        String updatedTitle = "PLease enter the updated Title";
        String updatedLocation = "PLease enter the location Title";
        String updatedDescription = "PLease enter the description Title";

        deleteCurrentMeetups();
        updatedMeetUp.UserCreatedMeetUps(updatedTitle,updatedLocation,updatedDescription);
    }//updateMeetupsInformation

     */
}//class