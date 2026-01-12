package net.trashlib.system.selector.wines.utils;

public class WineList {
    private String[] redWineListAlcohol = {
            "bordeaux",
            "Beaujolais",
            "Cabernet",
            "Carmenere",
            "Merlot",
            "Pinot",
            "Pinotage",
            "Sangiovanese",
            "Syrah",
            "Tempranillo",
            "Zinfandel"
    };

    private String[] whiteWineListAlcohol = {
            "albarino",
            "chablis",
            "chardonay",
            "pinot",
            "riesling",
            "sauvignon"
    };
    private String[] sparklingListAlcohol = {
            "espumante-brut",
            "espumante-demi-sec",
            "espumante-rose",
            "espumante-dulce",
            "espumante-seco"
    };

    public WineList(String[] redWineListAlcohol, String[] whiteWineListAlcohol, String[] sparklingListAlcohol) {
        this.redWineListAlcohol = redWineListAlcohol;
        this.whiteWineListAlcohol = whiteWineListAlcohol;
        this.sparklingListAlcohol = sparklingListAlcohol;
    }

    public String[] getWhiteWineListAlcohol() {
        return whiteWineListAlcohol;
    }

    public String[] getSparklingListAlcohol() {
        return sparklingListAlcohol;
    }

    public String[] getRedWineListAlcohol() {
        return redWineListAlcohol;
    }
}
