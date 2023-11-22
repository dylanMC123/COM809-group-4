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
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        int count = 0;
        PopulateMeetUps createMeetUp = new PopulateMeetUps();
        Meetup newMeet = new Meetup();
        createMeetUp.addMeetups("Coding","Ulster University Magee","Learning Java",count);
        createMeetUp.addMeetups("Arts","Ulster University Belfast","Learning to draw",count);

        switch (optionChosen())
        {
            case 1:
                newMeet.PrintAllDetails();
                break;
        }//switch
    }

    public static int optionChosen()
    {
        System.out.println("Please enter a number: ");
        System.out.println("1. View all meetings");
        System.out.println("2. Create meetings");
        System.out.println("3. Update Meetings");
        System.out.println("4. delete meetings");

        return keyboard.nextInt();
    }
}
