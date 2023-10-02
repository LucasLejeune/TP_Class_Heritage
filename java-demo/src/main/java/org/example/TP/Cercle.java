package org.example.TP;

import java.lang.Math;

public class Cercle extends Formes {

    private float rayon = (float) 12;
    private float pi = (float) Math.PI;

    @Override
    public float calculAire() {
        return pi * (rayon * rayon);
    }
}
