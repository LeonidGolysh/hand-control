package org.example.camera.image;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class ImageSaver {

    public void saveImage(Mat image, String filename) {
        if (Imgcodecs.imwrite(filename, image)) {
            System.out.println("Image saved as '" + filename + "'");
        } else {
            System.out.println("Error saving image");
        }
    }
}
