package 싱글톤;

public class Student {
    // 이미 생성되어 있는 싱글톤 객체의 주소를 singTon에 대입 받음.
    SingleTon singleTon = SingleTon.getSingleTon();

    void setInfo(String name, int id){
        singleTon.name = name;
        singleTon.id = id;
    }

    void printInfo(){
        System.out.println("이름 : " + singleTon.name);
        System.out.println("아이디 : " + singleTon.id);
    }
}
