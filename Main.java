package MeetUps;

import java.util.Scanner;

/****************************************
 Filename: 
 Created by: Dylan Mc Canny 
 Created on: 
 Comment: 
 ***************************************/
public class Main
{
    private static int optionChosen()
    {
        //object of scanner class
        Scanner keyboard = new Scanner(System.in);

        //Print statements indicating to user their options and how to access them
        System.out.println("Please enter a number: ");
        System.out.println("1. View all MeetUps");
        System.out.println("2. Create MeetUps");
        System.out.println("3. Update MeetUps");
        System.out.println("4. delete MeetUps");
        System.out.println("Input numbers 5 - 9 or 0 to Exit");

        //return the option chosen by the user
        return keyboard.nextInt();
    }//optionChosen

    public static void main(String[] args)
    {

        //creating instances of the CreateMeetUps and CurrentMeetUps classes
        CreateMeetUps createMeetUp = new CreateMeetUps();
        Meetup currentMeetUps = new Meetup();
        DeleteMeetUps deleteMeetUp = new DeleteMeetUps();
        UpdateMeetUps UpdateInformation = new UpdateMeetUps();

        //invoking the add meetups function, to populate the storeMeetUps array
        createMeetUp.addMeetups("Coding","Ulster University Magee","Learning Java");
        createMeetUp.addMeetups("Arts","Ulster University Belfast","Learning to draw");

        boolean continueProgram = true;
        String promptMeetingTitle = "Title: ";
        String promptMeetingLocation = "Location: ";
        String promptMeetingDescription = "Description: ";
        String promptSuccessfulCompletion = "Please take note of your unique ID";

        //switch statement invoking the correct function depending on the optionChosen function
        // this looped cannot be stopped. It is for testing purposes only
        while(continueProgram)
        {
            try
            {
                switch (optionChosen())
                {

                    case 1:
                        currentMeetUps.PrintAllDetails();
                        //printing out all MeetUps/view all
                        break;
                    case 2:
                        createMeetUp.UserCreatedMeetUps(promptMeetingTitle, promptMeetingLocation, promptMeetingDescription, promptSuccessfulCompletion);
                        //creating and storing a MeetUp depending on user input
                        break;
                    case 3:
                        UpdateInformation.updateMeetupsInformation();
                        break;
                    case 4:
                        deleteMeetUp.deleteCurrentMeetups();
                        break;
                    default:
                        continueProgram = false;
                        System.out.println("Thank You");
                        break;
                }
            }//switch
            catch (Exception e)
            {
                System.out.println("Incorrect input. Try Again.");
            }
        }//while
    }//main
}//class
