package week2.mission2;

interface Car {
    int showCarNumber();
}
class HyundaiCar implements Car {
    private static int carCount = 0;    // 생성된 자동차 수를 추적
    private int carNumber;   // 자동차 고유 번호

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
}
