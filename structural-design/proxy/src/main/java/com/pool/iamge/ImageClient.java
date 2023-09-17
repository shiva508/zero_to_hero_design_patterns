package com.pool.iamge;

public class ImageClient {
    public static void main(String[] args) {
        EventImage eventImage=new ProxyImageService("Nithya.JPG");
        eventImage.displayImage();
        eventImage.displayImage();
    }
}
