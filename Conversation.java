import java.util.Scanner;

class Conversation {
  public static void main(String[] arguments) {

    // a list of our canned phrases
    // jordan mentioned something about making this static?
    String[] defaultResponse = {"cool!\n", "nice.\n", "okie dokie.\n", "that's interesting.\n"};

    // im gonna be putting the whole convo into this list that is printed as the transcript
    String[] transcript = {};

    // asks the amount of rounds and sets it as an input
    Scanner roundInput = new Scanner(System.in);
    System.out.println("how many rounds? ");
    int userRounds = roundInput.nextInt();

    // basically starts the convo asks how the day is
    Scanner input = new Scanner(System.in);
    System.out.println("how's your day today, anything on your mind? ");
    String howDay = input.nextLine();


    // for loop set to the amount of rounds, and, replaces the letters
    // we still need to check that it's its own word so still need to do that
    for(int i = 0; i < userRounds; i++){
      if (howDay.equals("I") || howDay.equals("i")){
        System.out.println(howDay.replace("I", "You"));
      } else if (howDay.equals("me")) {
        System.out.println(howDay.replace("me", "you"));
      }else if (howDay.equals("am")) {
        System.out.println(howDay.replace("am", "are"));
      } else if (howDay.equals("your")) {
      System.out.println(howDay.replace("your", "my"));
      } else if (howDay.equals("you")) {
        System.out.println(howDay.replace("you", "I"));
      }else if (howDay.equals("my")) {
        System.out.println(howDay.replace("my", "your"));
      }
      else if (howDay.equals("are"))
        System.out.println(howDay.replace("are", "am"));
      else{
        int rand = (int) (Math.random()*(defaultResponse.length+1) -1); // maybe -1
        System.out.print(defaultResponse[rand]);
      }

      howDay = input.nextLine();
    }

    System.out.println("goodbye!");

    System.out.println("\ntranscript:\n" + transcript);

    input.close();
    roundInput.close();

  }



}


// .equals() method
// if (howDay.equals("I") || howDay.equals("i")){
//   System.out.println(howDay.replace("I", "You"));
// } else if (howDay.equals("me")) {
//   System.out.println(howDay.replace("me", "you"));
// }else if (howDay.equals("am")) {
//   System.out.println(howDay.replace("am", "are"));
// } else if (howDay.equals("your")) {
// System.out.println(howDay.replace("your", "my"));
// } else if (howDay.equals("you")) {
//   System.out.println(howDay.replace("you", "I"));
// }else if (howDay.equals("my")) {
//   System.out.println(howDay.replace("my", "your"));
// }
// else if (howDay.equals("are"))
//   System.out.println(howDay.replace("are", "am"));


  // if (howDay.contains("I") || howDay.contains("i")){
  //   System.out.println(howDay.replace("I", "You"));
  // } else if (howDay.contains("me")) {
  //   System.out.println(howDay.replace("me", "you"));
  // }else if (howDay.contains("am")) {
  //   System.out.println(howDay.replace("am", "are"));
  // } else if (howDay.contains("your")) {
  // System.out.println(howDay.replace("your", "my"));
  // } else if (howDay.contains("you")) {
  //   System.out.println(howDay.replace("you", "I"));
  // }else if (howDay.contains("my")) {
  //   System.out.println(howDay.replace("my", "your"));
  // }
  // else if (howDay.contains("are"))
  //   System.out.println(howDay.replace("are", "am"));

