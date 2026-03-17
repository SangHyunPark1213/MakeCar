package 상속TV;

// ProtoTypeTV를 상속받아 ProductTV 클래스 생성
public class ProductTV extends ProtoTypeTV {
    String name;
    boolean isSmart;

    ProductTV() {
        super();
        this.name = "TV";
        isSmart = false;
    }
    // 생성자 오버로딩
    ProductTV(boolean power, int cnl, int vol, String name) {
        super(power, cnl, vol); // 부모의 생성자를 불러줌, 자식 객체가 만들어지려면 생성자에서 부모의 생성자를 먼저 불러줘야함
        this.name = name;
        isSmart = false; // this는 생략해도 됨
    }
    // 볼륨 설정 기능 추가 : 0 ~ 100까지만 유효값으로 입력받게 하고 나머지 오류 처리
    @Override
    public void setVol(int vol){
        this.vol = vol;
        if (0 <= vol && vol <= 100) System.out.printf("볼륨을 %d로 설정합니다.\n", vol);
        else System.out.println("잘못된 볼륨 입력입니다.");
    }
    // 채널 설정 기능을 오버라이딩해서 1 ~ 1999까지 설정 되도록 변경
    @Override
    void setCnl(int cnl){
        if (1 <= cnl && cnl <= 1999) {
            this.cnl = cnl;
            System.out.printf("채널을 %d로 설정합니다.\n", cnl);
        }
        else System.out.println("잘못된 채널 번호입니다.");
    }
    // 오버라이딩된 설정 기능을 오버로딩해서 인터넷 모드 추가
    // 스마트 기능을 켜면 인터넷 기능이 켜지고 채널 설정은 무시됨

    public void setSmart(boolean smart) {
        isSmart = smart;
        System.out.println("인터넷 모드를 " + (smart ? "ON" : "OFF") + "합니다");
    }

    void setCnl(int cnl, boolean smart){
        isSmart = smart;
        if (isSmart) {
            System.out.println("인터넷모드입니다.");
        }
        else {
            setCnl(cnl);
        }
    }

    public boolean isSmart() {
        return isSmart;
    }

    // TV 정보 출력 기능
    void printTV(){
        System.out.println("===== TV 정보 출력 =====");
        System.out.println("전원 상태 : " + (getPower() ? "ON" : "OFF"));
        System.out.println("채널 : " + getCnl());
        System.out.println("볼륨 : " + getVol());
        System.out.println("인터넷 모드 : " + (isSmart() ? "ON" : "OFF"));
    }
}
