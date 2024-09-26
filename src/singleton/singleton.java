package singleton;

// 1. 정적 변수를 선언한다.
// 2. private 생성자를 선언한다.
// 3. 외부에서 접근할 수 있는 public 정적 메서드를 선언한다.
public class singleton {

    // 1. 유일한 인스턴스를 저장할 변수를 선언한다.(private,static)
    // 많은 개발자들이 싱글톤 패턴의 변수를 instance로 이름짓는다.
    private static singleton instance;

    // 2. 외부에서 객체를 생성 못하도록 private 생성자를 선언한다.
    // 접근지시자가 private이기 때문에, 외부에서 마음대로 생성 불가능.
    private singleton(){}

    // 3. 외부에서 인스턴스 주소를 반환받을 수 있는 메서드를 선언한다.
    // 심화 : 멀티 스레드 환경에서 안전하게 싱글톤 패턴을 구현하기 위해서는 
    public static synchronized singleton getInstance(){
        if(instance == null){
            instance = new singleton();
        }
        return instance;
    }

}
