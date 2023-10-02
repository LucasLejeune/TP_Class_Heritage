package org.example.TP;

public class Triangle extends Formes {

    @Override
    public float calculAire(float cote, float hauteur) {
        return (cote * hauteur) / 2;
    }
}
