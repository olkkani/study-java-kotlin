package io.olkkani.designpattern.singleton;


class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized() {


    }

    // 멀티쓰레드 환경에서 원자성이 결여될 수도 있는 방식
    public static SingletonSynchronized getInstance1() {
        if (instance == null) {
            instance = new SingletonSynchronized();
        }
        return instance;
    }

    // synchronized 인스턴스를 반환하기 전까지 격리 공간에 놓기위해 사용, 최초로 접근한 스레드 외 다른 스레드가 접근하지 못하도록 방지
    // 해당 메서드를 사용하는 동안 다른 스레드는 접근할 수 없기 때문에 성능 저하가 발생
    public static synchronized SingletonSynchronized getInstance2() {
        if (instance == null) {
            instance = new SingletonSynchronized();
        }
        return instance;
    }

}
class SingletonLazyHolder {
    private SingletonLazyHolder() {

    }


    // 5. 정적 맴버와 Lazy holder (정적 클래스) 추천 1/2
    // Lazy 필요한 경우에 정적으로 instance 를 생성할 수 있다
    private static class singleInstanceHolder {
        private static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }
    public static SingletonLazyHolder getInstance() {
        return singleInstanceHolder.INSTANCE;
    }



}
class SingletonPatternThreeAndFour {
    // 런타임시 인스턴스를 정적으로 생성하는 방법
    private final static SingletonPatternThreeAndFour instanceThree = new SingletonPatternThreeAndFour();
    // 정적 블록
    private static SingletonPatternThreeAndFour instanceFour = new SingletonPatternThreeAndFour();
    private SingletonPatternThreeAndFour() {
    }

    // 성능이 저하되지는 않지만 필요하지 않는 경우에도 개체를 생성하기 때문에 자원 낭비가 발생
    public static SingletonPatternThreeAndFour getInstanceThree(){
        return instanceThree;
    }

    public static SingletonPatternThreeAndFour getInstanceFour(){
        return instanceThree;
    }
}
// 6. DCL 이중 확인 장금
// 인스턴스 생성 여부를 싱글톤 패턴 잠금 전에 한번, 객체를 생성하기 전에 한번, 총 2번 체크하면 인스턴스가 존재하지 않을 때만 잠금을 걸수 있다
class SingletonDCL {
    // volatile 는 캐시메모리가 아닌 ram 에 저장하여 스레드끼리 공통된 값을 공유할 수 있도록 하는 방법
    private volatile SingletonDCL instance;
    private SingletonDCL() {

    }
    public SingletonDCL getInstance() {
        if (instance == null) {
            synchronized (SingletonDCL.class) {
                if (instance == null) {
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}

// 7. enum 추천 2/2
// enum 의 인스턴스는 기본적으로 스레드세이프한 점이 보장되기 때문에 이를 이용하여 생성이 가능
enum singletonEnum {
    INSTANCE;
    public void oortCloud() {

    }
}