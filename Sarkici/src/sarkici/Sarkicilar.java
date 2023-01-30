package sarkici;

import java.util.ArrayList;

public class Sarkicilar {

    private ArrayList<String> sarkiciListesi = new ArrayList<String>();

    public void sarkicilariBastir() {
        System.out.println("şarkıcılar:" + sarkiciListesi.size());
        for (int i = 0; i < sarkiciListesi.size(); i++) {
            System.out.println(sarkiciListesi.get(i));
        }
    }

    public void sakiciEkle(String isim) {
        sarkiciListesi.add(isim);
        System.out.println("şarkıcı listesi güncellendi...");
    }

    public void sarkiciGunelle(String yeniSim, int pozisyon) {
        sarkiciListesi.set(pozisyon, yeniSim);
        System.out.println("şarkıcı listesi güncellendi...");
    }

    public void sarkiciSil(int pozisyon) {
        String isim = sarkiciListesi.get(pozisyon);
        sarkiciListesi.remove(pozisyon);
        System.out.println("sarkıcı listeden silindi");

    }

    public void sarkiciAra(String sarkıcıİsmi) {
        int pozisyon=sarkiciListesi.indexOf(sarkıcıİsmi);
    }
}
