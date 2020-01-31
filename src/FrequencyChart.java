import util.java.Scanner;
public class FrequencyChart{
    private int[]list;
    public FrequencyChart(int[] list){
        this.list = list;
    }

    public String makeChart(){


    }    public static void main(String[] args) {
        Scanner scan = new canner(System.in);

        System.out.println("How many values in your data set?");
        int size = scan.nextInt();

        int[] data = new int (size);

        System.out.println("Enter data value one at a time, followed by enter :");
        int val = 0;
        for (i = 0; i < data.length; i++) {
            val = scan.nextInt();
            data[i] = val;
        }
        FrequencyChart chart = new FrequencyChart(data);

        System.out.println(chart.makeChart());
    }
}