package com.stackroute;
import java.math.BigDecimal;

public class Main
{
        public static void main(String[] args) {

            // write your code here

            Bulb bulb = new Bulb();
            Fan fan = new Fan();
            Switch eSwitch = new Switch(bulb);
            Switch fSwitch = new Switch(fan);
            eSwitch.click();
            eSwitch.click();
            eSwitch.click();
            fSwitch.click();
            fSwitch.click();

//            LightBulb lightBulb = new LightBulb();
//
//            //Bulb bulb = new LightBulb();
//
//            lightBulb.setVoltage(100);
//
//            lightBulb.setPrice(new BigDecimal(20));
//
//            //Bulb.display();
//
//            lightBulb.switchFunctionality.switchOn();
//
//            for(int i=0;i<2;i++){
//
//                System.out.println("");
//
//            }
//
//            lightBulb.switchFunctionality.switchOff();

        }

    }
