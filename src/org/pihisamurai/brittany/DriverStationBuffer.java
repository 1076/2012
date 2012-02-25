/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pihisamurai.brittany;

import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.DriverStationLCD.Line;
import edu.wpi.first.wpilibj.camera.AxisCamera;

/**
 *
 * @author Daniel
 */
public class DriverStationBuffer {

    private int CAMERA_MAX_FPS = 5;
    private int CAMERA_COMPRESSION = 0;
    private AxisCamera.ResolutionT CAMERA_RES =
            AxisCamera.ResolutionT.k640x480;
    DriverStationLCD lcd;
    AxisCamera camera;
    String line2 = "", line3 = "", line4 = "", line5 = "", line6 = "";

    /* Null bytes because this library is retarded as fuck */
    final String nullBytes = "\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0";

    DriverStationBuffer() {
        lcd = DriverStationLCD.getInstance();
        //camera = AxisCamera.getInstance();

        //camera.writeResolution(AxisCamera.ResolutionT.k640x480);
        //camera.writeMaxFPS(CAMERA_MAX_FPS);
        //camera.writeCompression(CAMERA_COMPRESSION);
    }

    void println(String line) {
        System.out.println("DRIVERSTATION: " + line);

        line2 = line3;
        line3 = line4;
        line4 = line5;
        line5 = line6;
        line6 = line;

        lcd.println(Line.kUser6, 1, line6 + nullBytes);
        lcd.println(Line.kUser5, 1, line5 + nullBytes);
        lcd.println(Line.kUser4, 1, line4 + nullBytes);
        lcd.println(Line.kUser3, 1, line3 + nullBytes);
        lcd.println(Line.kUser2, 1, line2 + nullBytes);

        lcd.updateLCD();
    }

    void updateCamera() {
        lcd.updateLCD();
    }
}
