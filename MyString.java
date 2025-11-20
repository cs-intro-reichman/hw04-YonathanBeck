public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("EaSy PeAsY LeMoN SqUeEzy : " + lowerCase("EaSy PeAsY LeMoN SqUeEzy"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) > 66 && str.charAt(i) < 91){
                str = str.replace(str.charAt(i), (char)(str.charAt(i) + 32));
            }
        }
        return str;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int containCount = 0;
        for(int i = 0; i < str1.length() - 1; i++){
            for(int j = 0; j < str2.length() - 1; j++){
                if(str1.charAt(i) == str2.charAt(j) && str1.charAt(i + 1) == str2.charAt(j + 1)){
                    containCount++;
                }
            }
            if(containCount == str2.length() - 1){
                    return true;
            }
        }
        return false;
    }
}