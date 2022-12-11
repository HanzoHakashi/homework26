package util;

import model.Data;

public interface DataBase {
    void openConnection();
    void closeConnection();
    void checkConnection();

    void readDataByIndex(Data[] data);

    void checkData();

    void checkDataByKey(Data[] data);

    void readData();
    void checkAmount();

    void addEntryToBase(int n, Data[] data);

    void uploadEntryByIndex();
    void uploadByKey();
}
