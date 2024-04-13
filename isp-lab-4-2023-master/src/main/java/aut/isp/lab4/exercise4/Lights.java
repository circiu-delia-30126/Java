package aut.isp.lab4.exercise4;

public class Lights {
    private boolean status;

    public Lights() {
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
public void turnOn()
{
setStatus(true);
}
public void turnOff(){
        setStatus(false);
}
}
