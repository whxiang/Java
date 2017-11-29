package java8.methodReference;

import java.util.function.Supplier;

/**
 * @author whxiang
 * @date 2017/11/27
 */
public class Flight {

    private String flightNo;

    private String dcity;

    private String acity;

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDcity() {
        return dcity;
    }

    public void setDcity(String dcity) {
        this.dcity = dcity;
    }

    public String getAcity() {
        return acity;
    }

    public void setAcity(String acity) {
        this.acity = acity;
    }

    @Override
    public String toString() {
        return "acity:" + this.acity + "   dicty:" + this.dcity + "   flightno:" + this.flightNo;
    }

    public static Flight create(final Supplier<Flight> supplier) {
        return supplier.get();
    }

    public static void collide(final Flight flight) {
        System.out.println("[静态方法引用,它的的语法是Class::static_method]collide:" + flight.toString());
    }

    public void follow(final Flight flight) {
        System.out.println("[特定类的任意对象的方法引用:它的语法是Class::method]follow:" + flight.toString());
    }

    public void repair() {
        System.out.println("[特定对象的方法引用,它的语法是instance::method]repair:" + this.toString());
    }
}
