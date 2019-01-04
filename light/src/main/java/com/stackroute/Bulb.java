package com.stackroute;
import java.math.BigDecimal;
public class Bulb implements ElectricalDevice {


        private int voltage;

        private BigDecimal price;


        public int getVoltage() {

            return voltage;

        }

        public void switchOn(){
            System.out.println("I'm glowingggggg");
    }
        public void switchOff() {
            System.out.println("I'm not feeling well");
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

    /*public void display(){

        System.out.println("bulb class");

    }*/

    }


