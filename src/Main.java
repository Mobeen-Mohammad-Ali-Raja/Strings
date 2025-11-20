void main(){
    Scanner reader = new Scanner(System.in);

    IO.print("Please enter a website address: ");
    String websiteAddress = reader.nextLine();
    String firstFourChars = String.format("First four characters: %s", websiteAddress.substring(0,4));
    String websiteName = String.format("Website name: %s", websiteAddress.substring(4,websiteAddress.length()-4));
    String lastFourChars = String.format("Last four characters: %s", websiteAddress.substring(websiteAddress.length() - 4));
    String websiteNameUpperCase = String.format("Upper case website name: %s", websiteAddress.substring(4,websiteAddress.length()-4).toUpperCase());

    IO.println(firstFourChars);
    IO.println(websiteName);
    IO.println(lastFourChars);
    IO.println(websiteNameUpperCase);

    String startAddress = "www.";
    String endOfAddress = ".com";

    if(websiteAddress.substring(0,4).equals(startAddress)) {
      IO.println("Correct starting formatting");
    } else {
        IO.println("Incorrect starting formatting");
    }

    if(websiteAddress.substring(websiteAddress.length()-4).equals(endOfAddress)) {
        IO.println("Correct ending formatting");
    } else {
        IO.println("Incorrect ending formatting");
    }

    String a = "Hi";
    String b = "Hi";
    String c = a;
    String d = "Hello";

    IO.println(a == b); // comparing memory address | True
    IO.println(a.equals(b)); // comparing value | True

    IO.println(c == b); // comparing memory address | True
    IO.println(c.equals(b)); // comparing value | True

    IO.println(c == d); // comparing memory address | False
    IO.println(c.equals(d)); // comparing value | False

}