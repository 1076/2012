/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.pihisamurai.brittany;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.DigitalOutput;

/**
 *
 * @author Mike
 */
public class JaguarHelper {

    Jaguar jaguar;
    DigitalOutput digitalOutput;

    JaguarHelper(int SLOT, int PLUG) {
        jaguar = new Jaguar(SLOT, PLUG);
        digitalOutput = new DigitalOutput(SLOT, PLUG);
        digitalOutput.disablePWM();
    }
}
