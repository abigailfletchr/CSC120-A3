import java.util.Scanner;

class Conversation {
  public static void main(String[] arguments) {

    Scanner userInput = new Scanner(System.in);
    System.out.println("how many rounds? ");
    Integer userRounds = userInput.nextInt();


    Scanner userInput1 = new Scanner(System.in);
    System.out.println("how's your day today, anything on your mind? ");
    String howDay = userInput1.nextLine();

    if (howDay.contains("I")){
      System.out.println(howDay.replace("I", "You"));
    } else if (howDay.contains("me")) {
      System.out.println(howDay.replace("me", "you"));
    }else if (howDay.contains("am")) {
      System.out.println(howDay.replace("am", "are"));
    }else if (howDay.contains("you")) {
      System.out.println(howDay.replace("you", "I"));
    }else if (howDay.contains("my")) {
      System.out.println(howDay.replace("my", "your"));
    }
    else if (howDay.contains("your"))
      System.out.println(howDay.replace("your", "my"));
    else if (howDay.contains("are"))
      System.out.println(howDay.replace("are", "am"));



    for (int i = 1; i  <= userRounds; i++) {

      String sure = ("sure");
      String wow = ("wow");
      String great = ("great");
      String cool = ("coolllll");

      System.out.println("Mhmmm");

  
    }











  }



}