import java.io.*;

public class Main {
    static char[] vowel = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        boolean flag = true;
        while (true) {
            s = br.readLine();
            if(s.equals("end")){
                break;
            }
            flag = caseOne(s) && caseTwo(s) && caseThree(s);
            if (flag) {
                System.out.println("<" + s + ">" + " is acceptable.");
            } else {
                System.out.println("<" + s + ">" + " is not acceptable.");
            }
        }
    }

    public static boolean caseOne(String s) {
        for (char c : s.toCharArray()) {
            for (char v : vowel) {
                if (c == v) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean caseTwo(String s) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowelCount++;
                consonantCount = 0;
            } else {
                consonantCount++;
                vowelCount = 0;
            }

            if (vowelCount == 3 || consonantCount == 3) {
                return false;
            }
        }
        return true;
    }

    static boolean isVowel(char c) {
        for (char v : vowel) {
            if (c == v) return true;
        }
        return false;
    }

    public static boolean caseThree(String s) {
        int count = 0;
        char prechar = '\0';

        for (char c : s.toCharArray()) {
            if (c == prechar) {
                count++;
            } else {
                count = 1;
                prechar = c;
            }

            if (count == 2) {
                if (prechar == 'e' || prechar == 'o') {
                    count = 1;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}