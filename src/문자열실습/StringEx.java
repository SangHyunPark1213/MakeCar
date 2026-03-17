package 문자열실습;

// 1번 : 입력받은 문자열에 대해 대/소문자 변경
// 입력 : AbCdEfG => aBcDeFg
// 문자열에서 charAt()을 이용해 문자를 추출하고 추출된 문자가 대문자인지 소문자인지 판별

// 2번 : 문자열 추가하기
// 입력 : s = "seoul", k = "korea", n = 2
// 결과 : ulkorea

// 3번 : 알고리즘 문제 풀이 > 3단계-중급문제 > KMP는 왜 KMP일까?
// 입력 : Knuth-Morris-Pratt => KMP
// - 대문자만 골라내서 출력하는 방법
// - 첫번째 문자 이후 '-' 문자를 찾아서 그 다음에 오는 문자 출력
// - split("-") 문자열을 부분 문자열로 분리하고 부분 문자열의 첫번째 문자 출력
// - 문자열을 문자 배열로 바꾸고 ASCII 코드값으로 대문자만 추출하는 방식

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
        UpperToLower();
        AddString();
        printUpper();
    }
    static void UpperToLower(){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++){
            if(Character.isUpperCase(arr[i])) arr[i] = Character.toLowerCase(arr[i]);
            else arr[i] = Character.toUpperCase(arr[i]);
        }
        String output = new String(arr);
        System.out.println(output);
    }

    static void AddString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("s : ");
        String input1 = sc.nextLine();
        System.out.print("k : ");
        String input2 = sc.nextLine();
        System.out.print("n : ");
        int n = sc.nextInt();
        input1 = input1.substring(input1.length() - n, input1.length());
        String result = input1 + input2;
        System.out.println(result);
    }

    static void printUpper(){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] Arr = input.split("-");
        String result = "";
        for (int i = 0; i < Arr.length; i++){
            result += Arr[i].charAt(0);
        }
        System.out.println(result);
    }

//    예시 답안
//    static void stringLowUpperChange() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자열 입력 : ");
//        String str = sc.nextLine();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
//                System.out.print((char) (str.charAt(i) - ('a' - 'A')));
//            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
//                System.out.print((char) (str.charAt(i) + ('a' - 'A')));
//            } else {
//                System.out.print(str.charAt(i));
//            }
//        }
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (Character.isUpperCase(c)) {
//                System.out.print(Character.toLowerCase(c));
//            } else if (Character.isLowerCase(c)) {
//                System.out.print(Character.toUpperCase(c));
//            } else {
//                System.out.print(c);
//            }
//        }
//    }

    // 대문자만 골라내기
//    static void kmpUpper() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자열 입력 : ");
//        String str = sc.nextLine();
//        for (int i = 0; i < str.length(); i++){
//            char c = str.charAt(i); // 문자열에서 해당 인덱스 문자 추출
//            if (Character.isUpperCase(c)){
//                System.out.print(c);
//            }
//        }
//    }

    // 하이픈 다음 문자 추출
//    static void hyPhenNext(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자열 입력 : ");
//        String str = sc.nextLine();
//        for (int i = 0; i < str.length(); i++){
//            if (i == 0) System.out.print(str.charAt(i)); // 첫번째 문자 출력
//            else{
//                if (str.charAt(i) == '-') System.out.print(str.charAt(i + 1)); // 하이픈 다음에 오는 문자 출력
//            }
//        }
//    }

    // 하이픈 기준으로 자르기
//    static void splitHyphen(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자열 입력 : ");
//        String str = sc.nextLine();
//        String[] arr = str.split("-"); // 문자열을 하이픈 기준으로 잘라서 부분 문자열로 이루어진 배열 생성
//        for (String s : arr) {
//            System.out.print(s.charAt(0));
//        }
//    }

    // 문자 배열로 변환
//    static void charArr() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자열 입력 : ");
//        String str = sc.nextLine();
//        char[] chArr = str.toCharArray();
//        for (char c : chArr){
//            if(Character.isUpperCase(c)) System.out.print(c);
//        }
//    }

}


