package com.pool.iamge;

public class DatabaseImageService implements EventImage {

    private String imageName;

    private String loadedImage;

    public DatabaseImageService(String imageName) {
        this.imageName = imageName;
        loadedImageFromDatabase(imageName);
    }

    private void loadedImageFromDatabase(String imageName) {
        loadedImage="LOADED_"+imageName;
    }

    @Override
    public void displayImage() {
        System.out.println(loadedImage);
    }
}
