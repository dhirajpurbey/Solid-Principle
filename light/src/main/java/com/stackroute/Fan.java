package com.stackroute;

import java.math.BigDecimal;

public class Fan implements  ElectricalDevice {
    private int voltage;

    private BigDecimal price;


    public int getVoltage() {

        return voltage;

    }

    public void switchOn(){
        System.out.println("I'm rotating");
    }
    public void switchOff() {
        System.out.println("I'm done");
    }

    public void setVoltage(int voltage) {

        this.voltage = voltage;

    }



    public BigDecimal getPrice() {

        return price;

    }



    public void setPrice(BigDecimal price) {

        this.price = price;

    }

}
