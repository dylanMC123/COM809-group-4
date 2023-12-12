package MeetUps;

import java.util.Scanner;

/****************************************
 Filename: 
 Created by: Craig Rea
 Created on: 
 Comment: 
 ***************************************/
public class DeleteMeetups extends Meetup
{
    //global protected variable to update if the ID entered by users matches one in the ArrayList
    protected boolean userInputMatchesId = false;

    //Method to remove MeetUps from the ArrayList
    protected void deleteCurrentMeetups(String deleteOrUpdateMessage)
    {
        //instance of the Binary search and scanner class
        BinarySearch newSearch = new BinarySearch();
        Scanner keyboard = new Scanner(System.in);

        //declaring an int for the ID entered by user and assigning it to the user input
        int uniqueIdEntered;


        System.out.println("Please enter the unique ID of the MeetUp");
        uniqueIdEntered = keyboard.nextInt();

        //declaring an int that hold the index position of the number entered or -1

        int numberReturned = newSearch.binarySearchForUniqueID(StoredID,uniqueIdEntered);

        //if -1 is returned then the number was not found
        if(numberReturned == -1)
        {
            System.out.println("This ID was not found");
        }//if
        else
        {
            //else it was found and removes the arraylist position
            System.out.println("The ID was found\n" + deleteOrUpdateMessage);
            //boolean updated for the update meetups
            userInputMatchesId = true;

            storeMeetUps.remove(numberReturned);
            StoredID.remove(numberReturned);
        }//else

    }//deleteCurrentMeetups

}//class
