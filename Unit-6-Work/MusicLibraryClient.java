public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "some guy", 10, 35);
        Album a2 = new Album("This Music","Some Band",9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        Album a4 = new Album("a","m", 8, 45);
        Album a5 = new Album("b","j",8, 45);
        Album a6 = new Album("n","k", 8, 45);
        Album a7 = new Album("y","f", 8, 45);
        Album a8 = new Album("z","q", 8, 45);
        myLibrary.add(a1);
        myLibrary.add(a2);
        myLibrary.add(a3);
        myLibrary.add(a4);
        myLibrary.add(a5);
        myLibrary.add(a6);
        myLibrary.add(a7);
        myLibrary.add(a8);



        System.out.println(myLibrary.add(a1));
        System.out.println(myLibrary.add(a2));

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Test Selection Sort");

        myLibrary.sortByTitle();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1);
        myLibrary.add(a3);
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        int loc =myLibrary . findTitle("First");
        System.out.println("Found 'First' at index"+loc);
        System.out.println(myLibrary.getAlbum(loc));
    }
}