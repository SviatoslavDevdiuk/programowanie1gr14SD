package invoice.watch.DAO;

import invoice.watch.TypeOfMovement;
import invoice.watch.Watch;
import invoice.watch.braceletMaterial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WatchMem implements IWatch {

    public List<Watch> listOfWatches = new ArrayList<>();

    public  List<Watch> shoppingList = new ArrayList<>();

    public void creationWatchDataBase() {
        Watch watch1 = new Watch("G-Shock", 400, "Casio", braceletMaterial.RUBBER, TypeOfMovement.QUARTZ);
        Watch watch2 = new Watch("Couturier Chrono", 1500, "Tissot", braceletMaterial.LEATHER, TypeOfMovement.QUARTZ);
        Watch watch3 = new Watch("Conquest Roland Garros ", 5800, "Longines", braceletMaterial.STEEL, TypeOfMovement.MANUAL_WIND);
        Watch watch4 = new Watch("Automatic", 750, "Citizen", braceletMaterial.STEEL, TypeOfMovement.AUTOMATIC);
        Watch watch5 = new Watch("Alliance", 1000, "Calvin Klein", braceletMaterial.STEEL, TypeOfMovement.QUARTZ);
        Watch watch6 = new Watch(" Himalaya Special Edition ", 2270, "Casio", braceletMaterial.LEATHER, TypeOfMovement.AUTOMATIC);
        Watch watch7 = new Watch("AR5918 ", 1330, "Emporio Armani", braceletMaterial.LEATHER, TypeOfMovement.QUARTZ);
        Watch watch8 = new Watch("Men", 660, "Diesel", braceletMaterial.STEEL, TypeOfMovement.QUARTZ);

        listOfWatches.add(watch1);
        listOfWatches.add(watch2);
        listOfWatches.add(watch3);
        listOfWatches.add(watch4);
        listOfWatches.add(watch5);
        listOfWatches.add(watch6);
        listOfWatches.add(watch7);
        listOfWatches.add(watch8);


    }

    public void remoweUnnecessary() {
        removeWatch("G-Shock");
        removeWatch("Men");
    }


    @Override
    public boolean addWatch(Watch watch) {
        return listOfWatches.add(watch);
    }

    @Override
    public boolean removeWatch(String modelName) {
        return listOfWatches.remove(getWatchByName(modelName));
    }

    @Override
    public List<Watch> getAllWathces() {
        return listOfWatches;
    }

    @Override
    public Watch getWatchByName(String modelName) {
        Watch watch = new Watch("Not found",0,null,null,null);
        return listOfWatches.stream()
                .filter(x -> x.getModelName().contains(modelName)).findFirst().orElse(watch);
    }

    @Override
    public List<Watch> addProductToList(String modelName) {
        shoppingList.add(getWatchByName(modelName));
        return shoppingList;
    }


}
