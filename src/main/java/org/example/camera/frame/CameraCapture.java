package org.example.camera.frame;

import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

public class CameraCapture {
    private VideoCapture camera;

    public CameraCapture(int camera) {
        this.camera = new VideoCapture(camera);
    }

    public boolean isCameraOpened() {
        return camera.isOpened();
    }

    public Mat captureFrame() {
        Mat frame = new Mat();
        if (camera.read(frame)) {
            return frame;
        }
        return null;
    }

    public void release() {
        camera.release();
    }
}
