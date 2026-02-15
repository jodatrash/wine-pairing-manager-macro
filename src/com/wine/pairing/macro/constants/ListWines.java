package com.wine.pairing.macro.constants;

public class ListWines {
    private static final String[] redWineListAlcohol = {
            "Bordeaux",
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

    private static final String[] whiteWineListAlcohol = {
            "Albarino",
            "Chablis",
            "Chardonay",
            "Pinot",
            "Riesling",
            "Sauvignon"
    };
    private static final String[] sparklingListAlcohol = {
            "Espumante-brut",
            "Espumante-demi-sec",
            "Espumante-rose",
            "Espumante-dulce",
            "Espumante-seco"
    };

    public String[] getRedWineListAlcohol() {
        return redWineListAlcohol;
    }

    public String[] getWhiteWineListAlcohol() {
        return whiteWineListAlcohol;
    }

    public String[] getSparklingListAlcohol() {
        return sparklingListAlcohol;
    }
}
