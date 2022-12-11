import util.FileService;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        FileService fileService = new FileService();
        fileService.openConnection();
    }
}