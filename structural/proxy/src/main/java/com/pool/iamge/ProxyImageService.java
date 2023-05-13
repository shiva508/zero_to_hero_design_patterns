package com.pool.iamge;

public class ProxyImageService implements EventImage{

    private DatabaseImageService databaseImageService;
    private String imageName;

    public ProxyImageService(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void displayImage() {
        if (null==databaseImageService){
            databaseImageService=new DatabaseImageService(imageName);
        }
        databaseImageService.displayImage();
    }
}
