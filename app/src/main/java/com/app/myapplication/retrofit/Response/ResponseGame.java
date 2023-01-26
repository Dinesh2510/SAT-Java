package com.app.myapplication.retrofit.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class ResponseGame {

    @SerializedName("Matchdetail")
    @Expose
    private Matchdetail matchdetail;
    @SerializedName("Nuggets")
    @Expose
    private List<String> nuggets = null;
    @SerializedName("Innings")
    @Expose
    private List<Inning> innings = null;
    @SerializedName("Teams")
    @Expose
    private Map<String, AllTeamData> teams;
    @SerializedName("Notes")
    @Expose
    private Notes notes;

    public Matchdetail getMatchdetail() {
        return matchdetail;
    }

    public void setMatchdetail(Matchdetail matchdetail) {
        this.matchdetail = matchdetail;
    }

    public List<String> getNuggets() {
        return nuggets;
    }

    public void setNuggets(List<String> nuggets) {
        this.nuggets = nuggets;
    }

    public List<Inning> getInnings() {
        return innings;
    }

    public void setInnings(List<Inning> innings) {
        this.innings = innings;
    }

    public Map<String, AllTeamData> getTeams() {
        return teams;
    }

    public void setTeams(Map<String, AllTeamData> teams) {
        this.teams = teams;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }
    public class Series {

        @SerializedName("Id")
        @Expose
        private String id;
        @SerializedName("Name")
        @Expose
        private String name;
        @SerializedName("Status")
        @Expose
        private String status;
        @SerializedName("Tour")
        @Expose
        private String tour;
        @SerializedName("Tour_Name")
        @Expose
        private String tourName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTour() {
            return tour;
        }

        public void setTour(String tour) {
            this.tour = tour;
        }

        public String getTourName() {
            return tourName;
        }

        public void setTourName(String tourName) {
            this.tourName = tourName;
        }

    }

    public class AllTeamData {

        @SerializedName("Name_Full")
        @Expose
        private String nameFull;
        @SerializedName("Name_Short")
        @Expose
        private String nameShort;

        @SerializedName("Players")
        @Expose
        private Map<String, PlayerDataModelled> players;

        public String getNameFull() {
            return nameFull;
        }

        public void setNameFull(String nameFull) {
            this.nameFull = nameFull;
        }

        public String getNameShort() {
            return nameShort;
        }

        public void setNameShort(String nameShort) {
            this.nameShort = nameShort;
        }

        public Map<String, PlayerDataModelled> getPlayers() {
            return players;
        }

        public void setPlayers(String key , PlayerDataModelled playerDataModelled) {
            this.players.put(key , playerDataModelled);
        }
    }




    public class ThisOver {

        @SerializedName("T")
        @Expose
        private String t;
        @SerializedName("B")
        @Expose
        private String b;

        public String getT() {
            return t;
        }

        public void setT(String t) {
            this.t = t;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }

    }

    public class Venue {

        @SerializedName("Id")
        @Expose
        private String id;
        @SerializedName("Name")
        @Expose
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
    public class Matchdetail {

        @SerializedName("Team_Home")
        @Expose
        private String teamHome;
        @SerializedName("Team_Away")
        @Expose
        private String teamAway;
        @SerializedName("Match")
        @Expose
        private Match match;
        @SerializedName("Series")
        @Expose
        private Series series;
        @SerializedName("Venue")
        @Expose
        private Venue venue;
        @SerializedName("Officials")
        @Expose
        private Officials officials;
        @SerializedName("Weather")
        @Expose
        private String weather;
        @SerializedName("Tosswonby")
        @Expose
        private String tosswonby;
        @SerializedName("Status")
        @Expose
        private String status;
        @SerializedName("Status_Id")
        @Expose
        private String statusId;
        @SerializedName("Player_Match")
        @Expose
        private String playerMatch;
        @SerializedName("Result")
        @Expose
        private String result;
        @SerializedName("Winningteam")
        @Expose
        private String winningteam;
        @SerializedName("Winmargin")
        @Expose
        private String winmargin;
        @SerializedName("Equation")
        @Expose
        private String equation;

        public String getTeamHome() {
            return teamHome;
        }

        public void setTeamHome(String teamHome) {
            this.teamHome = teamHome;
        }

        public String getTeamAway() {
            return teamAway;
        }

        public void setTeamAway(String teamAway) {
            this.teamAway = teamAway;
        }

        public Match getMatch() {
            return match;
        }

        public void setMatch(Match match) {
            this.match = match;
        }

        public Series getSeries() {
            return series;
        }

        public void setSeries(Series series) {
            this.series = series;
        }

        public Venue getVenue() {
            return venue;
        }

        public void setVenue(Venue venue) {
            this.venue = venue;
        }

        public Officials getOfficials() {
            return officials;
        }

        public void setOfficials(Officials officials) {
            this.officials = officials;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getTosswonby() {
            return tosswonby;
        }

        public void setTosswonby(String tosswonby) {
            this.tosswonby = tosswonby;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatusId() {
            return statusId;
        }

        public void setStatusId(String statusId) {
            this.statusId = statusId;
        }

        public String getPlayerMatch() {
            return playerMatch;
        }

        public void setPlayerMatch(String playerMatch) {
            this.playerMatch = playerMatch;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getWinningteam() {
            return winningteam;
        }

        public void setWinningteam(String winningteam) {
            this.winningteam = winningteam;
        }

        public String getWinmargin() {
            return winmargin;
        }

        public void setWinmargin(String winmargin) {
            this.winmargin = winmargin;
        }

        public String getEquation() {
            return equation;
        }

        public void setEquation(String equation) {
            this.equation = equation;
        }

    }
    public class Notes {

        @SerializedName("1")
        @Expose
        private List<String> _1 = null;
        @SerializedName("2")
        @Expose
        private List<String> _2 = null;

        public List<String> get1() {
            return _1;
        }

        public void set1(List<String> _1) {
            this._1 = _1;
        }

        public List<String> get2() {
            return _2;
        }

        public void set2(List<String> _2) {
            this._2 = _2;
        }

    }

    public class Officials {

        @SerializedName("Umpires")
        @Expose
        private String umpires;
        @SerializedName("Referee")
        @Expose
        private String referee;

        public String getUmpires() {
            return umpires;
        }

        public void setUmpires(String umpires) {
            this.umpires = umpires;
        }

        public String getReferee() {
            return referee;
        }

        public void setReferee(String referee) {
            this.referee = referee;
        }

    }

    public class PartnershipCurrent {

        @SerializedName("Runs")
        @Expose
        private String runs;
        @SerializedName("Balls")
        @Expose
        private String balls;
        @SerializedName("Batsmen")
        @Expose
        private List<Batsman> batsmen = null;

        public String getRuns() {
            return runs;
        }

        public void setRuns(String runs) {
            this.runs = runs;
        }

        public String getBalls() {
            return balls;
        }

        public void setBalls(String balls) {
            this.balls = balls;
        }

        public List<Batsman> getBatsmen() {
            return batsmen;
        }

        public void setBatsmen(List<Batsman> batsmen) {
            this.batsmen = batsmen;
        }


    }
    public class Inning {

        @SerializedName("Number")
        @Expose
        private String number;
        @SerializedName("Battingteam")
        @Expose
        private String battingteam;
        @SerializedName("Total")
        @Expose
        private String total;
        @SerializedName("Wickets")
        @Expose
        private String wickets;
        @SerializedName("Overs")
        @Expose
        private String overs;
        @SerializedName("Runrate")
        @Expose
        private String runrate;
        @SerializedName("Byes")
        @Expose
        private String byes;
        @SerializedName("Legbyes")
        @Expose
        private String legbyes;
        @SerializedName("Wides")
        @Expose
        private String wides;
        @SerializedName("Noballs")
        @Expose
        private String noballs;
        @SerializedName("Penalty")
        @Expose
        private String penalty;
        @SerializedName("AllottedOvers")
        @Expose
        private String allottedOvers;
        @SerializedName("Batsmen")
        @Expose
        private List<Batsman> batsmen = null;
        @SerializedName("Partnership_Current")
        @Expose
        private PartnershipCurrent partnershipCurrent;
        @SerializedName("Bowlers")
        @Expose
        private List<Bowler> bowlers = null;
        @SerializedName("FallofWickets")
        @Expose
        private List<FallofWicket> fallofWickets = null;
        @SerializedName("PowerPlay")
        @Expose
        private PowerPlay powerPlay;
        @SerializedName("Target")
        @Expose
        private String target;

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getBattingteam() {
            return battingteam;
        }

        public void setBattingteam(String battingteam) {
            this.battingteam = battingteam;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getWickets() {
            return wickets;
        }

        public void setWickets(String wickets) {
            this.wickets = wickets;
        }

        public String getOvers() {
            return overs;
        }

        public void setOvers(String overs) {
            this.overs = overs;
        }

        public String getRunrate() {
            return runrate;
        }

        public void setRunrate(String runrate) {
            this.runrate = runrate;
        }

        public String getByes() {
            return byes;
        }

        public void setByes(String byes) {
            this.byes = byes;
        }

        public String getLegbyes() {
            return legbyes;
        }

        public void setLegbyes(String legbyes) {
            this.legbyes = legbyes;
        }

        public String getWides() {
            return wides;
        }

        public void setWides(String wides) {
            this.wides = wides;
        }

        public String getNoballs() {
            return noballs;
        }

        public void setNoballs(String noballs) {
            this.noballs = noballs;
        }

        public String getPenalty() {
            return penalty;
        }

        public void setPenalty(String penalty) {
            this.penalty = penalty;
        }

        public String getAllottedOvers() {
            return allottedOvers;
        }

        public void setAllottedOvers(String allottedOvers) {
            this.allottedOvers = allottedOvers;
        }

        public List<Batsman> getBatsmen() {
            return batsmen;
        }

        public void setBatsmen(List<Batsman> batsmen) {
            this.batsmen = batsmen;
        }

        public PartnershipCurrent getPartnershipCurrent() {
            return partnershipCurrent;
        }

        public void setPartnershipCurrent(PartnershipCurrent partnershipCurrent) {
            this.partnershipCurrent = partnershipCurrent;
        }

        public List<Bowler> getBowlers() {
            return bowlers;
        }

        public void setBowlers(List<Bowler> bowlers) {
            this.bowlers = bowlers;
        }

        public List<FallofWicket> getFallofWickets() {
            return fallofWickets;
        }

        public void setFallofWickets(List<FallofWicket> fallofWickets) {
            this.fallofWickets = fallofWickets;
        }

        public PowerPlay getPowerPlay() {
            return powerPlay;
        }

        public void setPowerPlay(PowerPlay powerPlay) {
            this.powerPlay = powerPlay;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

    }
    public class Batsman {

        @SerializedName("Batsman")
        @Expose
        private String batsman;
        @SerializedName("Runs")
        @Expose
        private String runs;
        @SerializedName("Balls")
        @Expose
        private String balls;
        @SerializedName("Fours")
        @Expose
        private String fours;
        @SerializedName("Sixes")
        @Expose
        private String sixes;
        @SerializedName("Dots")
        @Expose
        private String dots;
        @SerializedName("Strikerate")
        @Expose
        private String strikerate;
        @SerializedName("Dismissal")
        @Expose
        private String dismissal;
        @SerializedName("Howout")
        @Expose
        private String howout;
        @SerializedName("Bowler")
        @Expose
        private String bowler;
        @SerializedName("Fielder")
        @Expose
        private String fielder;
        @SerializedName("Isonstrike")
        @Expose
        private Boolean isonstrike;

        public String getBatsman() {
            return batsman;
        }

        public void setBatsman(String batsman) {
            this.batsman = batsman;
        }

        public String getRuns() {
            return runs;
        }

        public void setRuns(String runs) {
            this.runs = runs;
        }

        public String getBalls() {
            return balls;
        }

        public void setBalls(String balls) {
            this.balls = balls;
        }

        public String getFours() {
            return fours;
        }

        public void setFours(String fours) {
            this.fours = fours;
        }

        public String getSixes() {
            return sixes;
        }

        public void setSixes(String sixes) {
            this.sixes = sixes;
        }

        public String getDots() {
            return dots;
        }

        public void setDots(String dots) {
            this.dots = dots;
        }

        public String getStrikerate() {
            return strikerate;
        }

        public void setStrikerate(String strikerate) {
            this.strikerate = strikerate;
        }

        public String getDismissal() {
            return dismissal;
        }

        public void setDismissal(String dismissal) {
            this.dismissal = dismissal;
        }

        public String getHowout() {
            return howout;
        }

        public void setHowout(String howout) {
            this.howout = howout;
        }

        public String getBowler() {
            return bowler;
        }

        public void setBowler(String bowler) {
            this.bowler = bowler;
        }

        public String getFielder() {
            return fielder;
        }

        public void setFielder(String fielder) {
            this.fielder = fielder;
        }

        public Boolean getIsonstrike() {
            return isonstrike;
        }

        public void setIsonstrike(Boolean isonstrike) {
            this.isonstrike = isonstrike;
        }

    }
    public class Match {

        @SerializedName("Livecoverage")
        @Expose
        private String livecoverage;
        @SerializedName("Id")
        @Expose
        private String id;
        @SerializedName("Code")
        @Expose
        private String code;
        @SerializedName("League")
        @Expose
        private String league;
        @SerializedName("Number")
        @Expose
        private String number;
        @SerializedName("Type")
        @Expose
        private String type;
        @SerializedName("Date")
        @Expose
        private String date;
        @SerializedName("Time")
        @Expose
        private String time;
        @SerializedName("Offset")
        @Expose
        private String offset;
        @SerializedName("Daynight")
        @Expose
        private String daynight;

        public String getLivecoverage() {
            return livecoverage;
        }

        public void setLivecoverage(String livecoverage) {
            this.livecoverage = livecoverage;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getLeague() {
            return league;
        }

        public void setLeague(String league) {
            this.league = league;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getOffset() {
            return offset;
        }

        public void setOffset(String offset) {
            this.offset = offset;
        }

        public String getDaynight() {
            return daynight;
        }

        public void setDaynight(String daynight) {
            this.daynight = daynight;
        }

    }

    public class Bowler {

        @SerializedName("Bowler")
        @Expose
        private String bowler;
        @SerializedName("Overs")
        @Expose
        private String overs;
        @SerializedName("Maidens")
        @Expose
        private String maidens;
        @SerializedName("Runs")
        @Expose
        private String runs;
        @SerializedName("Wickets")
        @Expose
        private String wickets;
        @SerializedName("Economyrate")
        @Expose
        private String economyrate;
        @SerializedName("Noballs")
        @Expose
        private String noballs;
        @SerializedName("Wides")
        @Expose
        private String wides;
        @SerializedName("Dots")
        @Expose
        private String dots;
        @SerializedName("Isbowlingtandem")
        @Expose
        private Boolean isbowlingtandem;
        @SerializedName("Isbowlingnow")
        @Expose
        private Boolean isbowlingnow;
        @SerializedName("ThisOver")
        @Expose
        private List<ThisOver> thisOver = null;

        public String getBowler() {
            return bowler;
        }

        public void setBowler(String bowler) {
            this.bowler = bowler;
        }

        public String getOvers() {
            return overs;
        }

        public void setOvers(String overs) {
            this.overs = overs;
        }

        public String getMaidens() {
            return maidens;
        }

        public void setMaidens(String maidens) {
            this.maidens = maidens;
        }

        public String getRuns() {
            return runs;
        }

        public void setRuns(String runs) {
            this.runs = runs;
        }

        public String getWickets() {
            return wickets;
        }

        public void setWickets(String wickets) {
            this.wickets = wickets;
        }

        public String getEconomyrate() {
            return economyrate;
        }

        public void setEconomyrate(String economyrate) {
            this.economyrate = economyrate;
        }

        public String getNoballs() {
            return noballs;
        }

        public void setNoballs(String noballs) {
            this.noballs = noballs;
        }

        public String getWides() {
            return wides;
        }

        public void setWides(String wides) {
            this.wides = wides;
        }

        public String getDots() {
            return dots;
        }

        public void setDots(String dots) {
            this.dots = dots;
        }

        public Boolean getIsbowlingtandem() {
            return isbowlingtandem;
        }

        public void setIsbowlingtandem(Boolean isbowlingtandem) {
            this.isbowlingtandem = isbowlingtandem;
        }

        public Boolean getIsbowlingnow() {
            return isbowlingnow;
        }

        public void setIsbowlingnow(Boolean isbowlingnow) {
            this.isbowlingnow = isbowlingnow;
        }

        public List<ThisOver> getThisOver() {
            return thisOver;
        }

        public void setThisOver(List<ThisOver> thisOver) {
            this.thisOver = thisOver;
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
    public class FallofWicket {

        @SerializedName("Batsman")
        @Expose
        private String batsman;
        @SerializedName("Score")
        @Expose
        private String score;
        @SerializedName("Overs")
        @Expose
        private String overs;

        public String getBatsman() {
            return batsman;
        }

        public void setBatsman(String batsman) {
            this.batsman = batsman;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public String getOvers() {
            return overs;
        }

        public void setOvers(String overs) {
            this.overs = overs;
        }

    }

    public class PowerPlay {

        @SerializedName("PP1")
        @Expose
        private String pp1;
        @SerializedName("PP2")
        @Expose
        private String pp2;

        public String getPp1() {
            return pp1;
        }

        public void setPp1(String pp1) {
            this.pp1 = pp1;
        }

        public String getPp2() {
            return pp2;
        }

        public void setPp2(String pp2) {
            this.pp2 = pp2;
        }

    }

}

