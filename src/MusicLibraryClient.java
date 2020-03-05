public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album(title:"First", artist:"one Guy", tracks:10, time:42.5);
        Album a2 = new Album(title:"This Music", artist:"Some Band", tracks:9, time:36);
        Album a3 = new Album(title:"Play", artist:"People", tracks:12, time:39.1);
        Album a4 = new Album(title:"a",artist:"m",tracks: 8,time: 45);
        Album a5 = new Album(title:"b",artist:"j",tracks: 8,time: 45);
        Album a6 = new Album(title:"n",artist:"k",tracks: 8,time: 45);
        Album a7 = new Album(title:"y",artist:"f",tracks: 8,time: 45);
        Album a8 = new Album(title:"z",artist:"q",tracks: 8,time: 45);
        myLibrary.add(a1);


        System.out.println(myLibrary.add(a1));
        System.out.println(myLibrary.add(a2));

        System.out.println(Array.myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Test Selection Sort");

        mylibrary.sortByTitle();

        myLibrary.doubleSize();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1);
        myLibrary.add(a3);
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        int loc =myLibrary . findTitle("First");
        System.out.println("Found 'First' at index"+loc);
        System.out.println(mylibrary.getAlbum(loc));
    }
}