package com.diego.aulainterfacevisual;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Game {
    private String palavraSorteada;

    private List<String> linha01 = new ArrayList<>();
    private List<String> linha02 = new ArrayList<>();
    private List<String> linha03 = new ArrayList<>();
    private List<String> linha04 = new ArrayList<>();

    public void setLinha01(List<String> letras) {
        linha01.addAll(letras);
        for (String letra:linha01) {
            System.out.print(letra + " ");
        }
    }
}
