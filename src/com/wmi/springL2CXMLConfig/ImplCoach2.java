package com.wmi.springL2CXMLConfig;

public class ImplCoach2 implements coash{
    private final fortune fort;
    private String emailAddressProperty;
    private String teamProperty;
    //injection by Constractor
    public ImplCoach2(fortune fort)
    {
        this.fort=fort;
    }
    @Override
    public String getCoashWorkOut() {
        return "ImplCoach2 without injection";
    }

    @Override
    public String getFortuneByXMLInjection() {
        return fort.getFortune()+"by Constructor Injection";
    }

    public String getEmailAddressProperty() {
        return emailAddressProperty;
    }

    public void setEmailAddressProperty(String emailAddressProperty) {
        this.emailAddressProperty = emailAddressProperty;
    }

    public String getTeamProperty() {
        return teamProperty;
    }

    public void setTeamProperty(String teamProperty) {
        this.teamProperty = teamProperty;
    }
}
