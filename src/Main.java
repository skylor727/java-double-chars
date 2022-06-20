import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] charArr = input.toCharArray();
        char[] doubledArr = new char[charArr.length * 2];
        int ctr = 0;
        for (int i = 1; i <= doubledArr.length; i++) {
            doubledArr[i - 1] = charArr[ctr];
            if (i > 0 && i % 2 == 0) ctr++;
        }
        String str = String.valueOf(doubledArr);
        System.out.println(str);
    }
}