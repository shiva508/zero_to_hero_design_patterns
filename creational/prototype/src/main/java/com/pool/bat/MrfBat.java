package com.pool.bat;

public class MrfBat extends Bat{

    public MrfBat(double height, double width, double weight) {
        super(height, width, weight);
    }

    @Override
    public Bat createCopy() {
        MrfBat mrfBat=new MrfBat(this.getHeight(),this.getWidth(),this.getWeight());
        BrandAmbassador brandAmbassador=new BrandAmbassador(this.getBrandAmbassador().getCelebrityName());
        mrfBat.setBrandAmbassador(brandAmbassador);
        return mrfBat;
    }
}
