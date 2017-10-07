package com.example.android.castrorodriguezfernandocarros;

import java.util.ArrayList;

/**
 * Created by android on 07/10/2017.
 */

public class Datos {
    private static ArrayList<Carro> lista = new ArrayList<Carro>();

    public static void guardar(Carro o) {
        lista.add(o);
    }

    public static ArrayList<Carro> getCarros() {
        return lista;
    }
}