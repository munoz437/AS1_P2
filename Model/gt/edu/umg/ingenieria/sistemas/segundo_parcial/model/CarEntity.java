package gt.edu.umg.ingenieria.sistemas.segundo_parcial.model;

import java.util.*;

/**
 * 
 */
public abstract class CarEntity {

    /**
     * Default constructor
     */
    public CarEntity() {
    }

    /**
     * 
     */
    private String brand;

    /**
     * 
     */
    private String model;

    /**
     * 
     */
    private double price;

    /**
     * 
     */
    private int id;

    /**
     * @return
     */
    public String getBrand() {
        // TODO implement here
        return "";
    }

    /**
     * @param brand 
     * @return
     */
    public void setBrand(String brand) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getModel() {
        // TODO implement here
        return "";
    }

    /**
     * @param model 
     * @return
     */
    public void setModel(String model) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public double getPrice() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(double price) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getId() {
        // TODO implement here
        return 0;
    }

    /**
     * @param id 
     * @return
     */
    public void setId(int id) {
        // TODO implement here
        return null;
    }

}