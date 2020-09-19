package main.CaesarCipherEncryptor;

public class CaesarCipherEncryptor {
    public static void main(String[] args) {
        int key = 2;
        String str = "xyz";
        System.out.println(caesarCypherEncryptor(str,key));
    }

    public static String caesarCypherEncryptor(String str, int key) {
        char[] characters = new char[str.length()];
        key = key % 26;
        for(int i = 0; i < str.length(); i++){
            characters[i] = getNewLetter(str.charAt(i),key);
        }
        return String.valueOf(characters);
    }

    public static char getNewLetter(char letter, int key){
        int newLetterCode = (int) letter + key;
        return newLetterCode <= (int)'z' ? (char) newLetterCode : (char)(((int)'a' - 1) + newLetterCode % (int)'z');
    }

}