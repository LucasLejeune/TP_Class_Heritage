package org.example.TP;

public class Triangle extends Formes {
    private float hauteur = (float) 10.3;
    private float cote = (float) 9;

    @Override
    public float calculAire() {
        return (cote * hauteur) / 2;
    }
}
