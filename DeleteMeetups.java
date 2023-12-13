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


    //done by (Kanchan/Simana)
    private static final String SECURITY_QUESTION = "What is the color of the sky?";
    private static final String CORRECT_ANSWER = "blue";


    //Method to remove MeetUps from the ArrayList
    protected void deleteCurrentMeetups(String deleteOrUpdateMessage)
    {
        //instance of the Binary search and scanner class
        BinarySearch newSearch = new BinarySearch();
        Scanner keyboard = new Scanner(System.in);
        CreateMeetups updatedMeetUp = new CreateMeetups();

        // Ask security question (Kanchan/Simana)
        System.out.println(SECURITY_QUESTION);
        String userAnswer = keyboard.nextLine().trim().toLowerCase();

        // Check if the answer is correct (Kanchan/Simana)
        if (userAnswer.equals(CORRECT_ANSWER))
        {
            // Instance of createMeetUps class

            //Strings to update the print statements in the userCreatedMeetUps function
            String updatedTitle = "PLease enter the updated Title";
            String updatedLocation = "PLease enter the updated location";
            String updatedDescription = "PLease enter the updated description";
            String updatedIDMessage = "Your update was successful!\nYour new unique ID is: ";


            //declaring an int for the ID entered by user and assigning it to the user input
            int uniqueIdEntered;


            System.out.println("Please enter the unique ID of the MeetUp");
            uniqueIdEntered = keyboard.nextInt();

            //declaring an int that hold the index position of the number entered or -1

            int numberReturned = newSearch.binarySearchForUniqueID(StoredID, uniqueIdEntered);

            //if -1 is returned then the number was not found
            if (numberReturned == -1) {
                System.out.println("This ID was not found");
            }//if
            else {
                //else it was found and removes the arraylist position
                System.out.println("The ID was found\n" + deleteOrUpdateMessage);
                //boolean updated for the update meetups
                userInputMatchesId = true;

                storeMeetUps.remove(numberReturned);
                StoredID.remove(numberReturned);
            }//else
        }
        else
        {
            System.out.println("Security question answer is incorrect. Update operation aborted.");
        }//if

    }//deleteCurrentMeetups

}//class
