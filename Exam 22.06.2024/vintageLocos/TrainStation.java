package vintageLocos;

import java.util.ArrayList;
import java.util.List;

public class TrainStation {
    private String name;
    private int capacity;
    private int railGauge;
    private List<Locomotive> locomotives;

    public TrainStation(String name, int capacity, int railGauge) {
        this.name = name;
        this.capacity = capacity;
        this.railGauge = railGauge;
        this.locomotives = new ArrayList<>();
    }

    public void addLocomotive(Locomotive locomotive) {
        if (locomotives.size() >= capacity) {
            System.out.println("This train station is full!");
        } else if (locomotive.getGauge() != railGauge) {
            int difference = Math.abs(locomotive.getGauge() - railGauge);
            System.out.println("The rail gauge of this station does not match the locomotive gauge! Difference: " + difference + " mm.");
        } else {
            locomotives.add(locomotive);
        }
    }
    public boolean removeLocomotive(String name) {
        for (Locomotive loco : locomotives) {
            if (loco.getName().equals(name)) {
                locomotives.remove(loco);
                return true;
            }
        }
        return false;
    }
    public String getFastestLocomotive() {
        if (locomotives.isEmpty()) {
            return "There are no locomotives.";
        }

        Locomotive fastest = locomotives.get(0);
        for (Locomotive loco : locomotives) {
            if (loco.getMaxSpeed() > fastest.getMaxSpeed()) {
                fastest = loco;
            }
        }

        return fastest.getName() + " is the fastest locomotive with a maximum speed of " + fastest.getMaxSpeed() + " km/h.";
    }

    public Locomotive getLocomotive(String name) {
        for (Locomotive loco : locomotives) {
            if (loco.getName().equals(name)) {
                return loco;
            }
        }
        return null;
    }

    public int getCount() {
        return locomotives.size();
    }

    public String getOldestLocomotive() {
        if (locomotives.isEmpty()) {
            return "There are no locomotives.";
        }

        Locomotive oldest = locomotives.get(0);
        for (Locomotive loco : locomotives) {
            if (loco.getBuildDate().isBefore(oldest.getBuildDate())) {
                oldest = loco;
            }
        }

        return oldest.getName();
    }

    public String getStatistics() {
        if (locomotives.isEmpty()) {
            return "There are no locomotives departing from " + name + " station.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Locomotives departed from ").append(name).append(":\n");
        int index = 1;
        for (Locomotive loco : locomotives) {
            sb.append(index).append(". ").append(loco.getName()).append("\n");
            index++;
        }
        return sb.toString();
    }

}
