package MeetUps;

import java.util.ArrayList;

/****************************************
 Filename: 
 Created by: Craig Rea
 Created on: 
 Comment: 
 ***************************************/
public class BinarySearch
{
    protected int binarySearchForUniqueID(ArrayList<Integer> binarySearchMeetUp, int userInput)
    {
        //declaring ints  representing the Starting position and total length of the ArrayList
        int startingPosition = 0;
        int arrayListLength = binarySearchMeetUp.size();


        while (startingPosition <= arrayListLength)
        {
            // getting the mid point of the arraylist and assigning it to arrayListMidPoint to start the binary search
            int arrayListMidPoint = startingPosition + (arrayListLength - startingPosition) / 2;

            //if user input is found in the ArrayList then it returns the array position it was found at
            if (arrayListMidPoint == userInput)
            {
                return binarySearchMeetUp.indexOf(arrayListMidPoint);
            }//if

            //if the arrayListMidPoint is less than the user input it ignores half the array
            if (arrayListMidPoint  < userInput)
            {
                startingPosition = arrayListMidPoint + 1;
            }//if

            //if the arrayListMidPoint is more than the user input it ignores half the array
            else
            {
                arrayListLength = arrayListMidPoint - 1;
            }//else
        }//while
        //if it is not found then -1 will be returned
        return -1;
    }//binarySearchForUniqueID
}//class
