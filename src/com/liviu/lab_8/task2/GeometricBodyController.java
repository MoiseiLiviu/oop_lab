package com.liviu.lab_8.task2;


import com.liviu.lab_8.task1.GeometricBody;

public class GeometricBodyController {
    public static double getBiggestVolume(GeometricBody[] figures){
        double maxVolume = -1;
        for (GeometricBody f: figures) {
            if(f.getVolume()>maxVolume)
                maxVolume=f.getVolume();
        }
        return maxVolume;
    }

    public static double getBiggestSurface(GeometricBody[] figures){
        double maxSurf = -1;
        for (GeometricBody f: figures) {
            if(f.getSurface()>maxSurf)
                maxSurf=f.getSurface();
        }
        return maxSurf;
    }
}
