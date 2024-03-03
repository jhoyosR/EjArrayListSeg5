package concesionarioEj4;

import java.util.ArrayList;
import java.util.List;

public class Concessionaire {
    private String name;
    private String address;
    private int amountOfCars;

    public Concessionaire(String name, String address) {
        this.name = name;
        this.address = address;
        this.amountOfCars = 0;
        this.cars = new ArrayList<>();
    }

    private List<Car> cars;


    public void addCar(Car car){
        cars.add(car);
    }
    public void deleteCar(String licensePlate){
        cars.removeIf(car -> car.getLicensePlate().equals(licensePlate));
    }

    public String getInfo(){
        return "The concessionaire " + name + ", is in " + address + " and, at the moment, is holding " + cars.size() + " cars.";
    }

    public boolean sellCar(String licensePlate){
        if (cars.removeIf(car -> car.getLicensePlate().equals(licensePlate))){
            return true;
        } else return false;
    }
    public void showCars(){
        for (Car car : cars){
            System.out.println(car);
        }
    }

    @Override
    public String toString() {
        return "Concessionaire{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", amountOfCars=" + amountOfCars +
                ", cars=" + cars +
                '}';
    }
}
