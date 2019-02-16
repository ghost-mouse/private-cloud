package net.irext.decode.service.model;

/**
 * Filename:       ACParameters.java
 * Revised:        Date: 2019-02-14
 * Revision:       Revision: 1.0
 * <p>
 * Description:    AC parameters entity
 * <p>
 * Revision log:
 * 2018-12-29: created by strawmanbobi
 */
public class ACParameters {
    private int tempMin;
    private int tempMax;
    private int [] supportedModes;
    private int []supportedWindSpeed;
    private int []supportedSwing;

    public ACParameters(int tempMin, int tempMax, int[] supportedModes,
                        int[] supportedWindSpeed, int[] supportedSwing) {
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.supportedModes = supportedModes;
        this.supportedWindSpeed = supportedWindSpeed;
        this.supportedSwing = supportedSwing;
    }

    public ACParameters() {

    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int[] getSupportedModes() {
        return supportedModes;
    }

    public void setSupportedModes(int[] supportedModes) {
        this.supportedModes = supportedModes;
    }

    public int[] getSupportedWindSpeed() {
        return supportedWindSpeed;
    }

    public void setSupportedWindSpeed(int[] supportedWindSpeed) {
        this.supportedWindSpeed = supportedWindSpeed;
    }

    public int[] getSupportedSwing() {
        return supportedSwing;
    }

    public void setSupportedSwing(int[] supportedSwing) {
        this.supportedSwing = supportedSwing;
    }
}