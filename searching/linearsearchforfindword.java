//write a program to perform a linear search algorithm in given string find the particular word 

class linearsearchforfindword {
    public static void main(String[] args) {
        String str = "This is a simple linear search example to find the word linear in this string";
        String wordToFind = "linear";

        findAllWordIndexes(str, wordToFind);
    }

    public static void findAllWordIndexes(String str, String wordToFind) {
        String[] words = str.split(" ");
        boolean found = false;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(wordToFind)) {
                System.out.println("Word found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Word not found in the string.");
        }
    }
}
