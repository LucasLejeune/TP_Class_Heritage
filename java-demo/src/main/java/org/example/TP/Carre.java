package org.example.TP;

public class Carre extends Formes {

    private float cote = (float) 14.6;

    @Override
    public float calculAire() {
        return cote * cote;
    }
}
