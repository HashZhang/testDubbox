package org.testServer;

import org.springframework.stereotype.Service;
import org.testClient.Camera;
import org.testClient.CameraService;

/**
 * @author wujiang
 * @version 1.0.0.
 * @date 2016/8/31
 */
@Service
public class CameraServiceImpl implements CameraService {
    public String printMessage(Camera camera) {
        System.out.println(camera.toString());
        return camera.toString();
    }
}

