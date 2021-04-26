package gt.edu.umg.ingenieria.sistemas.segundo_parcial.service;

import gt.edu.umg.ingenieria.sistemas.segundo_parcial.dao.CarDao;
import gt.edu.umg.ingenieria.sistemas.segundo_parcial.model.CarEntity;
import java.util.*;

/**
 * 
 */
public class CarService {

    
    public CarService() {
    }

    /**
     * @param id 
     * @return
     */
    public CarEntity getCar(int id) {
      CarDao dao = new CarDao();
      
      CarEntity car = dao.readCarById(45);
        return car;
    }

    /**
     * @param car 
     * @return
     */
    public void createCar(CarEntity car) {
       CarDao dao = new CarDao();
       dao.createCar(car);
    }

    /**
     * @param car 
     * @return
     */
    public void updateCar(CarEntity car) {
         CarDao dao = new CarDao();
       dao.createCar(car);
    }

    /**
     * @param id 
     * @return
     */
    public void deleteCar(int id) {
       CarDao dao = new CarDao();
       dao.deleteCar(id);
    }

    /**
     * @return
     */
    public List<CarEntity> getAllCar() {
        // TODO implement here
        return null;
    }

}