import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Conversation {
  public static void main(String[] arguments) {

  
    String[] defaultResponse = {"cool!", "nice.", "okie dokie.", "that's interesting."};

    ArrayList<String> transcript = new ArrayList<String>();

    // asks the amount of rounds and sets it as an input
    Scanner roundInput = new Scanner(System.in);
    System.out.println("how many rounds? ");
    int userRounds = roundInput.nextInt();

    // basically starts the convo asks how the day is
    Scanner input = new Scanner(System.in);
    String compLine = "how's your day today, anything on your mind?";
    System.out.println(compLine);
    String howDay = input.nextLine();
    // String[] howDayList = howDay.split(" ");
    // for loop set to the amount of rounds, and, replaces the letters
    // we still need to check that it's its own word so still need to do that
    for(int i = 0; i < userRounds; i++){

      String[] howDayList = howDay.split(" ");
      // add to transcript
      transcript.add(compLine);
      transcript.add(howDay);

      // * I -> you
      // * me -> you
      // * am -> are
      // * you -> I
      // * my -> your
      // * your -> my
      
      // see if there is a pronoun to respond to
      // if(checkForPronouns(howDay)){

        for(int n = 0; n < howDayList.length-1; n++){
          if(howDayList[n].equals("i")){
            howDayList[n] = "you";
          }else if(howDayList[n].equals("I")){
            howDayList[n] = "you";
          }else if(howDayList[n].equals("me")){
            howDayList[n] = "you";
          }else if(howDayList[n].equals("am")){
            howDayList[n] = "are";
          }else if(howDayList[n].equals("you")){
            howDayList[n] = "I";
          }else if(howDayList[n].equals("my")){
            howDayList[n] = "your";
          }else if(howDayList[n].equals("your")){
            howDayList[n] = "my";
          }
        }

      compLine = String.join(" ", howDayList);

      System.out.println(compLine);

      // get their new input
      howDay = input.nextLine();
    }

    transcript.add(compLine);
    transcript.add(howDay);
    System.out.println("goodbye!");
    transcript.add("goodbye!");

    System.out.println("\ntranscript:");
    for(String m: transcript){
      System.out.println(m);
    }

    input.close();
    roundInput.close();

  }



}