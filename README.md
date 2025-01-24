# CodeSquad-masters-pre

## 2주차 - 2

### 자동차와 자동차 공장

- H자동차 공장에서 자동차를 생산한다.
- H자동차 공장은 하나뿐이고, 생산되는 자동차들은 고유한 식별 번호를 가진다.
- 다음 코드가 실행될 수 있도록 자동차와 자동차 공장을 구현하라.

```
public class CarTest {
    public static void main(String[] args) {
        HyundaiFactory factory = HyundaiFactory.getFactory();
        Car myCar = factory.creatCar();
        Car yourCar = factory.creatCar();
        
        System.out.println("첫번째 차 번호는 " + myCar.showCarNumber());
        System.out.println("두번째 차 번호는 " + yourCar.showCarNumber());
    }
}
```

- 예시
    - "첫번째 차 번호는 1000"
    - "두번째 차 번호는 1001"

- 풀이 과정
  - HyundaiFactory 클래스
    - Car 객체를 생성하는 팩토리 역할 
      - 팩토리 패턴에서 팩토리는 특정 타입의 객체 인스턴스를 생성하는 책임을 가진다.
    - HyundaiFactory 는 Car 객체의 생성을 추상화하고 캡슐화하여, Car 객체를 생성하는 구체적인 로직을 클라이언트로부터 숨긴다.
    - createCar() 메서드는 Car 클래스의 인터페이스를 생성해서 반환한다.
  - Car 클래스
    - 자동차 객체의 기능과 속성을 정의하는 인터페이스 또는 추상 클래스
    - Car 클래스에 선언된 메서드는 HyundaiFactory 에 의해 생성된 모든 자동차 객체가 구현해야 하는 규약을 제공한다.

### 성적표

### 주사위 게임

## 3주차 - 1

## 3주차 - 2

## 4주차 - 1

## 4주차 - 2