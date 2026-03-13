package 회원관리시스템;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        ArrayList<Member> memberList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=".repeat(70));
            System.out.print("[1]회원가입  [2]로그인  [3]전체회원조회  [4]회원삭제  [5]총 회원수  [6]종료 : ");
            int menu = sc.nextInt();

            switch(menu) {
                case 1:
                    System.out.print("이름 입력: ");
                    String name = sc.next();

                    String userId;

                    while (true) {
                        System.out.print("아이디 입력: ");
                        userId = sc.next();

                        boolean isDuplicate = false;

                        for (Member member : memberList) {
                            if (member.getUserId().equals(userId)) {
                                System.out.println("이미 존재하는 아이디입니다.");
                                isDuplicate = true;
                                break;
                            }
                        }

                        if (!isDuplicate) {
                            break;
                        }
                    }

                    System.out.print("비밀번호 입력: ");
                    String password = sc.next();

                    System.out.print("나이 입력: ");
                    int age = sc.nextInt();

                    memberList.add(new Member(name, userId, password, age));
                    break;
                case 2:
                    System.out.print("아이디 입력 : ");
                    String id = sc.next();

                    Member loginUser = null;

                    for(Member member : memberList){
                        if(member.getUserId().equals(id)){
                            loginUser = member;
                            break;
                        }
                    }

                    if(loginUser == null) {
                        System.out.println("존재하지 않는 아이디입니다.");
                    } else {
                        System.out.print("비밀번호 입력 : ");
                        String pw = sc.next();

                        if(!loginUser.login(id, pw)) {
                            System.out.println("비밀번호가틀렸습니다.");
                        } else {
                            System.out.println("로그인 성공");

                            while (true) {
                                System.out.print("[1]내 정보보기 [2]정보수정 [3]비밀번호 변경 [4]로그아웃 : ");
                                int submenu = sc.nextInt();

                                switch (submenu) {
                                    case 1:
                                        loginUser.printInfo();
                                        break;

                                    case 2:
                                        loginUser.updateInfo();
                                        break;

                                    case 3:
                                        System.out.print("기존 비밀번호 : ");
                                        String oldPW = sc.next();

                                        System.out.print("변경할 비밀번호 : ");
                                        String newPW = sc.next();

                                        loginUser.changePassword(oldPW, newPW);
                                        break;

                                    case 4:
                                        break;
                                }
                                if (submenu == 4) {
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    for (Member member : memberList) {
                        member.printInfo();
                    }
                    break;
                case 4:
                    System.out.print("삭제할 아이디 입력 : ");
                    String deleteId = sc.next();

                    Member deleteMember = null;

                    for (Member member : memberList) {
                        if (member.getUserId().equals(deleteId)) {
                            deleteMember = member;
                            break;
                        }
                    }

                    if (deleteMember == null) {
                        System.out.println("존재하지 않는 아이디입니다.");
                    } else {
                        System.out.print("정말 삭제하시겠습니까? [y/n] ");
                        String answer = sc.next();

                        if (answer.equals("y")) {
                            memberList.remove(deleteMember);
                            System.out.println("회원이 삭제되었습니다.");
                            deleteMember.deleteUser();
                        }
                    }
                    break;
                case 5:
                    System.out.println("총 회원 수 : " + Member.getTotalCount());
                    break;
                case 6:
                    System.out.println("시스템을 종료합니다.");
                    System.exit(0);
            }
        }
    }
}