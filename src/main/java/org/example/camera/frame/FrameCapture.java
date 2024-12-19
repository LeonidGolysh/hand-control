package org.example.camera.frame;

import org.opencv.core.Mat;

public class FrameCapture {
    private CameraCapture camera;

    public FrameCapture(CameraCapture camera) {
        this.camera = camera;
    }

    public Mat capture() {
        if (!camera.isCameraOpened()) {
            System.out.println("Error: Camera not found");
            return null;
        }

        Mat frame = camera.captureFrame();
        if (frame != null) {
            System.out.println("Frame captured");
            return frame;

        } else {
            System.out.println("Error capturing frame.");
            return null;
        }
    }
}
