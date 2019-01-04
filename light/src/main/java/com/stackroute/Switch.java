package com.stackroute;

public class Switch {
    private boolean state;
    private ElectricalDevice electricalDevice;


    public Switch(ElectricalDevice electricalDevice) {
        this.electricalDevice = electricalDevice;
    }







    public void click() {
    if(state==true)
    {
        electricalDevice.switchOff();
        this.state=false;
    }
    else
    {
        electricalDevice.switchOn();
        this.state=true;
    }

    }

}
