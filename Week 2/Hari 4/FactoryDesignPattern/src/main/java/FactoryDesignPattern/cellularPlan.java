/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package FactoryDesignPattern;

abstract class cellularPlan {
    protected double rate;
    abstract void getRate();
    public void processBill(int minutes){
        System.out.println(minutes*rate);
    }
}