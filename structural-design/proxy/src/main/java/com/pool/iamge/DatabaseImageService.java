package com.pool.iamge;

public class DatabaseImageService implements EventImage {

    private String imageName;

    private String loadedImage;

    public DatabaseImageService(String imageName) {
        this.imageName = imageName;
        loadedImageFromDatabase(imageName);
    }

    private void loadedImageFromDatabase(String imageName) {
        loadedImage=imageName;
        System.out.println("Loading Image ");
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying:-: "+loadedImage);
    }
}
