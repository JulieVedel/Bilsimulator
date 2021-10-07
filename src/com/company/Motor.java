package com.company;

public class Motor {
     boolean onOff;

    public Motor(boolean onOff) {
         this.onOff = onOff;
     }

    public void OnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public boolean isOnOff() {
        return onOff;
    }
}
