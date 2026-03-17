package 회원관리시스템;

import java.util.Scanner;

public class Member {
    int id;
    String name;
    String userId;
    String password;
    int age;
    static int totalCount;
    public  Member(String name, String userId, String password, int age) {
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.age = age;
        totalCount++; // 생성자 호출시 값을 증가시킴
    }

    public void updateInfo()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름, 나이를 수정합니다.");
        System.out.print("이름을 입력해주세요 : ");
        name = sc.next();
        System.out.print("나이를 입력해주세요 : ");
        age = sc.nextInt();
    }

    public void printInfo() {
        System.out.println("=".repeat(70));
        System.out.printf("회원번호: %d | 이름: %s | 아이디: %s | 나이: %d세\n", id, name, userId, age);
    }
    public static int getTotalCount(){
        return totalCount;
    }
    public void deleteUser(){
        totalCount--;
    }

    public String getUserId(){
        return userId;
    }

    public boolean login(String userId, String password) {
        if(this.userId.equals(userId) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    public void changePassword(String oldPw, String newPw) {
        if (password.equals(oldPw)) {
            password = newPw;
            System.out.println("비밀번호가 변경되었습니다.");
        } else {
            System.out.println("기존 비밀번호가 틀렸습니다.");
        }
    }

}