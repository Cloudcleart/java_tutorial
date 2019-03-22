/*================================================================
*   Copyright (C) 2019 Navin Xu. All rights reserved.
*   
*   Filename    ：ACMEBicycle.java
*   Author      ：Navin Xu
*   E-Mail      ：admin@navinxu.com
*   Create Date ：2019年03月22日
*   Description ：
================================================================*/

interface Bicycle {

    // wheel revolutions per minute
    void changeCadence(int newValue);
    
    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}

class ACMEBicycle implements Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // The compiler will now require that methods
    // changeCadence, changeGear, sppedUp, and applyBrakes
    // all be implements. Compilation will fail if those
    // methods are missing from this class
    
    public void changeCadence(int newVaule) {
        cadence = newVaule;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    void printStates() {
        System.out.println("cadence:" + 
                cadence + " speed:" + 
                speed + " gear:" + gear);
    }
}
