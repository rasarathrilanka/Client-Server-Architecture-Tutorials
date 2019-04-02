/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletest4;

import java.util.Date;

/**
 *
 * @author Luciferishie
 */
public class TemperatureSample {
    public double value;
    public String location;
    public Date date;

    @Override
    public String toString() {
        return "TemperatureSample{" + "value=" + value + ", location=" + location + ", date=" + date + '}';
    }
}
