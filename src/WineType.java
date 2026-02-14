import java.util.ArrayList;

public class WineType {
    private final ArrayList<String> wineList = new ArrayList<>();


    public ArrayList<String> getWineList() {
        wineList.add(0, "Tinto");
        wineList.add(1, "Blanco");
        wineList.add(2, "Espumoso");

        return wineList;
    }

    public void displayList() {
        for (String wineList : wineList) {
            System.out.println(wineList);
        }
    }
}
