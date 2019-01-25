package invoice.watch.DAO;

import invoice.watch.Watch;

import java.util.List;


public interface IWatch {

    public boolean addWatch(Watch watch);

    public boolean removeWatch(String modelName);

    public List<Watch> getAllWathces();

    public Watch getWatchByName(String name);

    public List<Watch> addProductToList(String modelName);



}
