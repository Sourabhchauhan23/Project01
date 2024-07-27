package org.globalLogic.Utils;

public enum Resources {
    Yatra("https://www.yatra.com/"),
    Google("https://www.google.com/");

    private final String resource;

    Resources(String resource){
    this.resource=resource;
    }

    public String getResource() {
        return resource;
    }
}
