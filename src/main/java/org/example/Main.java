package org.example;
import org.example.camera.frame.CameraCapture;
import org.example.camera.frame.FrameCapture;
import org.example.camera.image.ImageSaver;
import org.opencv.core.Core;
import org.opencv.core.Mat;

public class Main {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        CameraCapture cameraCapture = new CameraCapture(0);
        FrameCapture frameCapture = new FrameCapture(cameraCapture);
        ImageSaver imageSaver = new ImageSaver();

        Mat frame = frameCapture.capture();
        if (frame != null) {
            imageSaver.saveImage(frame, "captured_image.jpg");
        }

        cameraCapture.release();
    }
}