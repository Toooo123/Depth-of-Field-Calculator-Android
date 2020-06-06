package com.cmpt276a2.model;

public class Lens {
    private String make;
    private double maxAperture;
    private int focalLength;
    private int idIcon;


    public Lens (String make, double maxAperture, int focalLength, int idIcon) {
        this.make = make;
        this.maxAperture = maxAperture;
        this.focalLength = focalLength;
        this.idIcon = idIcon;
    }

    public String getMake() {
        return make;
    }

    public double getMaxAperture() {
        return this.maxAperture;
    }

    public int getFocalLength() {
        return this.focalLength;
    }

    public int getIdIcon() {
        return idIcon;
    }

    @Override
    public String toString() {
        return  make + " " + focalLength + "mm F" + maxAperture;
    }
}