package com.pool.bat;

public class BatClient {
    public static void main(String[] args) {
       Bat bat=new MrfBat(1.4,0.4,2.0);
       BrandAmbassador brandAmbassador=new BrandAmbassador("Lara");
       bat.setBrandAmbassador(brandAmbassador);
       System.out.println("Celebrity :-: "+bat.getBrandAmbassador().hashCode());
       System.out.println("Bat :-:"+bat.hashCode());
       Bat clinedBat=bat.createCopy();
       System.out.println("Cloned Bat :-:"+clinedBat.hashCode());
       System.out.println("Cloned Celebrity :-: "+clinedBat.getBrandAmbassador().hashCode());
       clinedBat.getBrandAmbassador().setCelebrityName("Sachin");
       System.out.println("Prototype :-: "+bat);
       System.out.println("Copied :-: "+clinedBat);
    }
}
