public class Practice {

    public static void main(String[] args) {
        System.out.println(flipEndChars(" hello, my name is Danielle"));
        System.out.println(flipEndChars("a"));
        System.out.println(flipEndChars("adA"));
        System.out.println(flipEndChars("ada"));


    }


    public static String flipEndChars (String s){

        int length = s.length();
        if (length <= 1)
            return "Incompatible.";
        if (s.charAt(0) == s.charAt(length - 1))
            return "Two's a pair.";

        String newString = "";
        newString = newString + s.charAt(length - 1);
        for (int i = 1; i < length - 1; i++) {
            char c = s.charAt(i);
            newString = newString + c;
        }
        newString = newString + s.charAt(0);
        return newString;
    }
}


//flipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"

//flipEndChars("ada") ➞ "Two's a pair."

//flipEndChars("Ada") ➞ "adA"

//flipEndChars("z") ➞ "Incompatible."








