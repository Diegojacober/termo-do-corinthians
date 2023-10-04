package com.diego.aulainterfacevisual;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.*;

public class Game {
    private String palavraSorteada;

    private List<String> linha01 = new ArrayList<>();
    private List<String> linha02 = new ArrayList<>();
    private List<String> linha03 = new ArrayList<>();
    private List<String> linha04 = new ArrayList<>();


    public void sortearPalavra() {
        List<String> palavras = Arrays.asList(
                "CASSIO",
                "FAGNER",
                "RENATO",
                "ROMERO",
                "MAYCON"
        );
        Random rand = new Random();
        String palavra = palavras.get(rand.nextInt(palavras.size()));
        setPalavraSorteada(palavra);
        System.out.println(palavraSorteada);
    }

    public void play() {
        sortearPalavra();
        linha01.clear();
        linha02.clear();
        linha03.clear();
        linha04.clear();
    }

    public void setPalavraSorteada(String palavra) {
        palavraSorteada = palavra;
    }

    public void setLinha01(List<String> letras) {
        linha01.addAll(letras);
    }

    public void setLinha02(List<String> letras) {
        linha02.addAll(letras);
    }

    public void setLinha03(List<String> letras) {
        linha03.addAll(letras);
    }

    public void setLinha04(List<String> letras) {
        linha04.addAll(letras);
    }

    public String getPalavraSorteada() {
        return palavraSorteada;
    }

    public List<String> getLinha01() {
        return linha01;
    }

    public List<String> getLinha02() {
        return linha02;
    }

    public List<String> getLinha03() {
        return linha03;
    }

    public List<String> getLinha04() {
        return linha04;
    }

    public void verifyWord(List<JTextField> campos, List<String> linha) {
        for(int i = 0; i < campos.size(); i++) {
            String letraCorreta = String.valueOf(palavraSorteada.charAt(i));
            String letraCampo = linha.get(i).toUpperCase();

            boolean condicao = letraCampo.equals(letraCorreta);
            int existeNaPalavraPosicaoIncorreta = getPalavraSorteada().indexOf(letraCampo);

            if(condicao) {
                campos.get(i).setBackground(Color.decode("#237839"));
            }

            if(!condicao) {
                campos.get(i).setBackground(Color.decode("#942f2f"));
            }

            if (!condicao && existeNaPalavraPosicaoIncorreta > 0) {
                campos.get(i).setBackground(Color.decode("#c4bd31"));
            }
        }
    }
}
