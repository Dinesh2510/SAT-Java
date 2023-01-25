package com.app.myapplication.retrofit.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerDataModelled {

    @SerializedName("Position")
    @Expose
    private String position;
    @SerializedName("Name_Full")
    @Expose
    private String nameFull;
    @SerializedName("Iskeeper")
    @Expose
    private Boolean iskeeper;
    @SerializedName("Iscaptain")
    @Expose
    private Boolean Iscaptain;
    @SerializedName("Batting")
    @Expose
    private Batting batting;
    @SerializedName("Bowling")
    @Expose
    private Bowling bowling;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public Boolean getIskeeper() {
        return iskeeper;
    }

    public void setIskeeper(Boolean iskeeper) {
        this.iskeeper = iskeeper;
    }

    public Batting getBatting() {
        return batting;
    }

    public void setBatting(Batting batting) {
        this.batting = batting;
    }

    public Bowling getBowling() {
        return bowling;
    }

    public void setBowling(Bowling bowling) {
        this.bowling = bowling;
    }

    public Boolean getIscaptain() {
        return Iscaptain;
    }

    public void setIscaptain(Boolean iscaptain) {
        Iscaptain = iscaptain;
    }

    public class Batting {

        @SerializedName("Style")
        @Expose
        private String style;
        @SerializedName("Average")
        @Expose
        private String average;
        @SerializedName("Strikerate")
        @Expose
        private String strikerate;
        @SerializedName("Runs")
        @Expose
        private String runs;

        public String getStyle() {
            return style;
        }

        public void setStyle(String style) {
            this.style = style;
        }

        public String getAverage() {
            return average;
        }

        public void setAverage(String average) {
            this.average = average;
        }

        public String getStrikerate() {
            return strikerate;
        }

        public void setStrikerate(String strikerate) {
            this.strikerate = strikerate;
        }

        public String getRuns() {
            return runs;
        }

        public void setRuns(String runs) {
            this.runs = runs;
        }

    }

    public class Bowling {

        @SerializedName("Style")
        @Expose
        private String style;
        @SerializedName("Average")
        @Expose
        private String average;
        @SerializedName("Economyrate")
        @Expose
        private String economyrate;
        @SerializedName("Wickets")
        @Expose
        private String wickets;

        public String getStyle() {
            return style;
        }

        public void setStyle(String style) {
            this.style = style;
        }

        public String getAverage() {
            return average;
        }

        public void setAverage(String average) {
            this.average = average;
        }

        public String getEconomyrate() {
            return economyrate;
        }

        public void setEconomyrate(String economyrate) {
            this.economyrate = economyrate;
        }

        public String getWickets() {
            return wickets;
        }

        public void setWickets(String wickets) {
            this.wickets = wickets;
        }

    }
}
