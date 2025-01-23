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

### 성적표

### 주사위 게임

## 3주차 - 1

## 3주차 - 2

## 4주차 - 1

## 4주차 - 2