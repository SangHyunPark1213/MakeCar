package 상속TV;

// PrototypeTV를 상속 받아 ProductTV 클래스를 생성
public class ProductTV extends PrototypeTV{
    String name;
    boolean isSmart;

    // 기본 생성자
    ProductTV(){
        super();
        this.name = "TV";
        isSmart = false;
    }

    // 생성자 오버로딩
    ProductTV(boolean power, int cnl, int vol, String name){
        super(power, cnl, vol);
        // 부모의 생성자를 불러 줌, 자식 객체가 만들어지려면 생성자에서 부모의 생성자를 먼저 불러줘야 함.
        // 기본 default 값은 매개변수가 없는 기본 생성자를 호출
        this.name = name;
        this.isSmart = false; // this 생략 가능 .. 매개변수 이름과 다르기에
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }


    // 볼륨 설정 기능 추가 : 0 ~ 100까지
    @Override
    public void setVol(int vol) {
        while (vol > 100 || vol < 0){
            System.out.println("볼륨 입력이 옳바르지 않습니다.");
            System.out.println("볼륨을 다시 입력해주세요 (0 ~ 100) : ");
            vol = sc.nextInt();
        }
        super.setVol(vol);
        System.out.println("볼륨을 " + vol + "로 변경하였습니다");
    }

    // 채널 설정 기능을 오버라이딩 해서 1 ~ 1999까지 설정 되도록 변경

    @Override
    public void setCnl(int cnl) {
        while (cnl < 1 || cnl > 1999){
            System.out.println("채널 입력이 옳바르지 않습니다");
            System.out.println("채널을 다시 입렵해주세요 (1 ~ 1999) : ");
            cnl = sc.nextInt();
        }
        super.setCnl(cnl);
        System.out.println("채널을 " + cnl + "로 변경하였습니다");
    }

    // 오버라이딩 된 설정 기능을 오버로딩 해서 스마트 모드 추가
    // 스마트 기능을 켜면 인터넷 기능이 켜지고 채널 설정은 무시 됨.
    // 오버로딩
    public void setCnl(int cnl, boolean isSmart){
        if(isSmart){
            this.isSmart = true;
        } else {
            super.setCnl(cnl);
        }
    }

    // 티비 정보 출력 기능

    @Override
    public void printTV() {
        System.out.println("이름 : " + getName());
        System.out.println("전원 : " + ((isPower()) ? "ON" : "OFF"));
        System.out.println("채널 : " + getCnl());
        System.out.println("볼륨 : " + getVol());
        System.out.println("스마트 모드 : " + (isSmart() ? "ON" : "OFF"));
    }
}
