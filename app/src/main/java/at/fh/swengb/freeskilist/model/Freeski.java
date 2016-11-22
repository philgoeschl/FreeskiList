package at.fh.swengb.freeskilist.model;

import java.io.Serializable;

/**
 * Created by phgo_000 on 22.11.2016.
 */

public class Freeski implements Serializable {

    private String brand;
    private int length;
    private int radius;
    private String color;
    private boolean twintip;
    private boolean powderRocker;

    public Freeski() {
    }

    public Freeski(String brand, int length, int radius, String color, boolean twintip, boolean powderRocker) {
        this.brand = brand;
        this.length = length;
        this.radius = radius;
        this.color = color;
        this.twintip = twintip;
        this.powderRocker = powderRocker;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTwintip() {
        return twintip;
    }

    public void setTwintip(boolean twintip) {
        this.twintip = twintip;
    }

    public boolean isPowderRocker() {
        return powderRocker;
    }

    public void setPowderRocker(boolean powderRocker) {
        this.powderRocker = powderRocker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Freeski freeski = (Freeski) o;

        if (twintip != freeski.twintip) return false;
        return powderRocker == freeski.powderRocker;

    }

    @Override
    public int hashCode() {
        int result = (twintip ? 1 : 0);
        result = 31 * result + (powderRocker ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Freeski{" +
                "brand='" + brand + '\'' +
                ", length=" + length +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", twintip=" + twintip +
                ", powderRocker=" + powderRocker +
                '}';
    }

    public void areGoodFor(String text) {
        System.out.println(brand+" skis are good for "+text+"!");
    }

}
