package org.pihisamurai.brittany;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.DriverStation;

public class Brittany extends IterativeRobot {

    DriverStation driverStation;
    DriverStationBuffer buffer;

    public void robotInit() {

        buffer = new DriverStationBuffer();
        driverStation = DriverStation.getInstance();

        buffer.println("*** Robot Init ***");
    }

    public void autonomousPeriodic() {

    }

    public void teleopPeriodic() {
        
    }
    
}
