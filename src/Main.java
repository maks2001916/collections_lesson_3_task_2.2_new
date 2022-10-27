public class Main {
    public static void main(String[] args) {
        String storage = "Объект - ";
        String storageOne = "";
        int key = 0;
        for (int i = 0; i < 10; i++) {
            String storageTwo = String.valueOf(key);
            storageOne = storage + storageTwo;
            Storage storage0 = new Storage(key, storageOne);
            System.out.println(storage0);
            key++;
        }
    }
}