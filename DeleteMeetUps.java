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
    protected boolean userInputMatchesId = false;
    protected void deleteCurrentMeetups()
    {
       //iterate through the arrayList and find if the unique id matches
        // find the array position and delete it
        BinarySearch newSearch = new BinarySearch();

        Scanner keyboard = new Scanner(System.in);
        int uniqueIdEntered;
        //int meetUpPosition = 0;
        //boolean userInputMatchesId = false;

        System.out.println("Please enter the unique ID of the MeetUp");
        uniqueIdEntered = keyboard.nextInt();

        /*

        for (Meetup findMeetUps: storeMeetUps)
        {
            userInputMatchesId = false;
            int currentMeetupId = findMeetUps.getMeetupId();

            if(uniqueIdEntered == currentMeetupId)
            {
                userInputMatchesId = true;
               meetUpPosition = storeMeetUps.indexOf(findMeetUps);
                System.out.println("Your Id was found.\n");
            }
        }

         */

        int numberReturned = newSearch.binarySearch(StoredID,uniqueIdEntered);

        if(numberReturned == -1)
        {
            System.out.println("This ID was not found");
        }
        else
        {
            // find the index that it exists in
            storeMeetUps.remove(numberReturned);
            StoredID.remove(numberReturned);
            System.out.println("The ID was found");
            userInputMatchesId = true;
        }


        /*
        if (userInputMatchesId)
        {
            storeMeetUps.remove(meetUpPosition);
        }
        else if (!userInputMatchesId)
        {
            System.out.println("This ID was not found");
        }

         */
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
