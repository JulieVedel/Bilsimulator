package com.company;

public class Motor {
     boolean onOff;

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public Motor(boolean onOff) {
         this.onOff = onOff;
     }

     public boolean isOnOff() {
         return onOff;
     }
}
