/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chakk
 */
@XmlRootElement
public class Result {
    
    private double Area;

    public double getArea() {
        return Area;
    }
    @XmlElement
    public void setArea(double Area) {
        this.Area = Area;
    }

    private double Cricum;

    public double getCricum() {
        return Cricum;
    }

    public void setCricum(double Cricum) {
        this.Cricum = Cricum;
    }

}
