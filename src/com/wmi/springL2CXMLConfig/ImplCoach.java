package com.wmi.springL2CXMLConfig;

public class ImplCoach implements coash{
    public fortune fort;

    public void setFort(fortune fort) {
        this.fort = fort;
    }

    @Override
    public String getFortuneByXMLInjection() {
        return fort.getFortune();
    }

    @Override
    public String getCoashWorkOut() {
        return"methode without injection";
    }

}
