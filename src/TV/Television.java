package TV;
// 전원 on off 기능
// 볼륨 조절 기능
// 채널 변경 기능


public class Television {
    // 인스턴스 필드 생성, tv의 상태값(속성값)을 저장
    // 접근제한자 : private, default(키워드 없음), protected, public(다른 패키지에서도 사용 가능)
    private boolean power; // 전원 on off

    private int volume;
    private int channel;

    // 생성자 : 클래스가 객체로 만들어질 때 호출, 클래스 이름과 동일, 반환 타입이 없음, 오버 로딩 가능
    // 생성자의 역할은 인스턴스 필드 값을 초기화 하는 목적
    // 생성자를 만들지 않으면 숨겨진 기본 생성자가 동작함.

    Television() {
        power = false;
        volume = 10;
        channel = 11;
    }

    // 생성자 오버로딩 : 매개변수의 갯수나 타입에 따라 호출 됨 (정적 다형성)
    Television(boolean on_off, int vol, int ch) {
        power = on_off;
        volume = vol;
        channel = ch;
    }

    // 세터 메서드 : 외부에서 접근 불가능한 인스턴스 필드의 값을 변경하기 위해 사용하는 메서드
    public void setPower(boolean on_off) {
        this.power = on_off; // 매개 변수 이름과 인스턴스 필드의 이름이 동일하면 this를 사용해야함.
        // 현재는 다르기에 생략 가능.
        System.out.println("전원을 " + (power ? "ON" : "OFF") + "합니다");
    }

    // 게터 메서드 : 외부에서 접근 불가능한 필드의 값을 읽기 위해 사용하는 메서드
    public boolean getPower() {
        return power;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("볼륨을" + volume + " 으로 변경합니다.");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("채널을" + channel + " 으로 변경합니다.");
    }

    public void printTV() {
        System.out.println("===== TV 정보 출력 =====");
        System.out.printf("전원 : %s \n", (power ? "ON" : "OFF"));
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
    }
}

