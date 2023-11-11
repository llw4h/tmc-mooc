/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lulwah
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }
    
    public String history(){
        return this.history.toString();
    }
    
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double num = super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        return num;
    }
    
    public void printAnalysis(){
        System.out.println(String.format("Product: %s\nHistory: %s\nLargest amount of product: %f\nSmallest amount of product: %f\nAverage: %f", super.getName(), this.history.toString(), this.history.maxValue(), this.history.minValue(), this.history.average()));
    }
}
