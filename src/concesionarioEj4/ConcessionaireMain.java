package concesionarioEj4;

import java.util.Scanner;

public class ConcessionaireMain {
    public static void main(String[] args) {
    Concessionaire concessionaire = new Concessionaire("Daytona", "Calle 132B # 22");
    Scanner scanner = new Scanner(System.in);

    System.out.println("No cars in the concessionaire at the moment, please enter one to start");

    Car car1 = new Car();
    Car car2 = new Car();
    Car car3 = new Car();

    System.out.println("Enter the brand of the first car: ");
    car1.setBrand(scanner.next());
    System.out.println("Enter the car license plate");
    car1.setLicensePlate(scanner.next());

    System.out.println("Enter the brand of the second car: ");
    car2.setBrand(scanner.next());
    System.out.println("Enter the car license plate");
    car2.setLicensePlate(scanner.next());

    System.out.println("Enter the brand of the third car: ");
    car3.setBrand(scanner.next());
    System.out.println("Enter the car license plate");
    car3.setLicensePlate(scanner.next());

    concessionaire.addCar(car1);
    concessionaire.addCar(car2);
    concessionaire.addCar(car3);

    System.out.println("Cars in the concessionaire at the moment: ");
    concessionaire.showCars();

    concessionaire.sellCar(car3.getLicensePlate());

    concessionaire.deleteCar(car2.getLicensePlate());
    System.out.println("Cars in the concessionaire actualized: ");
    concessionaire.showCars();

    System.out.println(concessionaire.getInfo());
    }
}
