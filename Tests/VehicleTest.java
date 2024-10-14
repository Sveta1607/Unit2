import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VehicleTest {

    Car car = new Car("KIA", "Optima", 2022);
    Motorcycle moto = new Motorcycle("Honda", "Gold Wing", 2020);

    // Проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void instanceOf() {
        assertThat(car instanceof Vehicle);
    }

    // Проверка того, объект Car создается с 4-мя колесами
    @Test
    void WheelsCar() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // Проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void MotorcycleWheels() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    // Проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void testDriveCar() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // Проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void testDriveMotorcycle() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    // Проверить, что в режиме парковки (сначала testDrive, потом park,
    // т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void parkCar() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    //- проверить, что в режиме парковки (сначала testDrive, потом park
    // т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void parkMotorcycle() {
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}