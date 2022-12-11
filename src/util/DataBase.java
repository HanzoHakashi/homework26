package util;

public interface DataBase {
    void openConnection();
    void closeConnection();
    void checkConnection();
    void readDataByIndex();
    void checkData();
    void checkDataByKey();
    void readData();
    void checkAmount();
    void addEntryToBase();
    void uploadEntryByIndex();
    void uploadByKey();
}
