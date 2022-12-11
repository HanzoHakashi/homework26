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

    void checkAmount(Data[] data);

    void addEntryToBase(int n, Data[] data);


    void uploadEntryByIndex(Data[] data);

    void uploadByKey(Data[] data);
}
