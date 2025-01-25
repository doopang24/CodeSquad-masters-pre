package week2.mission2;

interface Car {
    int showCarNumber();
}


class HyundaiFactory {
    private static HyundaiFactory instance = new HyundaiFactory();  // 싱글톤 인스턴스

    private HyundaiFactory() {
    }      // 생성자를 private 으로 설정하여 외부에서 인스턴스화 방지

    public static HyundaiFactory getFactory() {
        return instance;    // 싱글톤 인스턴스 반환
    }

    public Car creatCar() {
        return new HyundaiCar();    // HyundaiCar 인스턴스를 생성해서 반환
    }
}


class HyundaiCar implements Car {
    private static int carCount = 0;    // 생성된 자동차 수를 추적
    private int carNumber;   // 자동차 고유 번호, 인스턴스마다 고유해야 하므로 static 붙이지 않음

    public HyundaiCar() {
        carCount++;
        this.carNumber = carCount + 1000;
    }

    @Override
    public int showCarNumber() {
        return carNumber;
    }
}

public class CarTest {
    public static void main(String[] args) {
        HyundaiFactory factory = HyundaiFactory.getFactory();
        Car myCar = factory.creatCar();
        Car yourCar = factory.creatCar();

        System.out.println("첫번째 차 번호는 " + myCar.showCarNumber());
        System.out.println("두번째 차 번호는 " + yourCar.showCarNumber());
    }
}
