package org.globalLogic.Utils;

public enum Resources {
    Yatra("https://www.yatra.com/"),
    Google("https://www.google.com/"),
    ESPNCricInfo("https://www.espncricinfo.com/series/indian-premier-league-2024-1410320/lucknow-super-giants-vs-gujarat-titans-21st-match-1422139/full-scorecard");

    private final String resource;

    Resources(String resource){
    this.resource=resource;
    }

    public String getResource() {
        return resource;
    }
}
