package dio.digitalinnovation.one.desafios.uniformes;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.*;


public class Test {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {

        FileReader arq = new FileReader("C:\\DEV_WorkSpace\\Rep_IntelliJ\\BootcampDioNewTalentsJava\\src\\main\\java\\dio\\digitalinnovation\\one\\desafios\\uniformes\\camisas.txt");
        //BufferedReader in = new BufferedReader(arq);

        /*String linha = in.readLine();
        while (linha != null) {
            System.out.printf("%s\n", linha);
            linha = in.readLine(); // lê da segunda até a última linha
        }
        in = new BufferedReader(arq);*/


        String l, color, owner, size;
        String[] details;
        Tshirt tshirt;
        List<Tshirt> tshirts = new ArrayList<>();

        l = in.readLine();

        //while (!(l = read()).equals("0")) {
        while (!(l = in.readLine()).equals("0")) {
                owner = l;
                details = in.readLine().split(" ");
                color = details[0];
                size = details[1];

                tshirt = new Tshirt(size , color , owner);

                tshirts.add(tshirt);

        }// End While
        Collections.sort(tshirts);
        for (Tshirt tshirtX: tshirts ) {
            out.println(tshirtX);
        }
        out.close();
    }

    private static String read() throws IOException {
            return in.readLine();
    }

    private static int toInt(String s) {
            return Integer.parseInt(s);
    }
}

class Tshirt implements Comparable<Tshirt>{

    private String size;
    private String color;
    private String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }

    @Override
    public int compareTo(Tshirt obj) {
        int diff = getColor().compareTo(obj.getColor()); // ordem crescente

        if (diff != 0) {
            return diff;
        } else {
            int diffSize = getSize().compareTo(obj.getSize())  * -1;  //ordem decrescente
            if( diffSize != 0 ){
                return diffSize;
            }else {
                int diffOwner = getOwner().compareTo(obj.getOwner()); //ordem crescente
                if (diffOwner != 0) {
                    return diffOwner;
                }
            }
        }
        return diff;
    }
}



/*
        Arrays.sort(tshirts, new Comparator<Tshirt>() {
            @Override
            public int compare(Tshirt t1, Tshirt t2) {

                int diff = t1.getColor().compareTo(t2.getColor()); // ordem crescente

                if (diff != 0) {
                    return diff;
                } else {
                    int diffSize = t1.getSize().compareTo(t2.getSize())  * -1;  //ordem decrescente
                    if( diffSize != 0 ){
                        return diffSize;
                    }else {
                        int diffOwner = t1.getOwner().compareTo(t2.getOwner()); //ordem crescente
                        if (diffOwner != 0) {
                            return diffOwner;
                        }
                    }
                }
            }
        });








                Arrays.sort(tshirts, new Comparator<Tshirt>() {
                    @Override
                    public int compare(Tshirt t1, Tshirt t2) {

                        int diff = t1.getColor().compareTo(t2.getColor()); // ordem crescente

                        if (diff != 0) {
                            return diff;
                        } else {
                            int diffSize = t1.getSize().compareTo(t2.getSize())  * -1;  //ordem decrescente
                            if( diffSize != 0 ){
                                return diffSize;
                            }else {
                                int diffOwner = t1.getOwner().compareTo(t2.getOwner()); //ordem crescente
                                if (diffOwner != 0) {
                                    return diffOwner;
                                }
                            }
                        }
                    }
                }
 */


/*


public class Uniformes {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String owner, l, color, size;
        String[] details;
        Tshirt[] tshirts;
        Tshirt tshirt;
        int N;
        boolean firstCase = true;
        while (!(l = read()).equals("0")) {
          if(){

            } else {
                out.println();
            }
            N = toInt(l);
            tshirts = new Tshirt[N];
            for (int i = 0; i < N; i++) {

            }
            Arrays.sort(tshirts, new Comparator<Tshirt>() {
                @Override
                public int compare(Tshirt t1, Tshirt t2) {
                    String color1 = t1.getColor();
                    String color2 = t2.getColor();
                    int diff = color1.compareTo(color2);
                    if (diff != 0) {
                        return diff;
                    } else {

                        }
                        if (                           ) {
                            return -1;
                        }
                        return 1;
                    }
                }
            });
            for (                                  ) {

            }

        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}

class Tshirt {

    private String size;
    private String color;
    private String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }
}
 */



/*
Original

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;


public class Uniformes {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String owner, l, color, size;
        String[] details;
        Tshirt[] tshirts;
        Tshirt tshirt;
        int N;
        boolean firstCase = true;
        while (!(l = read()).equals("0")) {
          if(){

            } else {
                out.println();
            }
            N = toInt(l);
            tshirts = new Tshirt[N];
            for (int i = 0; i < N; i++) {

            }
            Arrays.sort(tshirts, new Comparator<Tshirt>() {
                @Override
                public int compare(Tshirt t1, Tshirt t2) {
                    String color1 = t1.getColor();
                    String color2 = t2.getColor();
                    int diff = color1.compareTo(color2);
                    if (diff != 0) {
                        return diff;
                    } else {

                        }
                        if (                           ) {
                            return -1;
                        }
                        return 1;
                    }
                }
            });
            for (                                  ) {

            }

        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}

class Tshirt {

    private String size;
    private String color;
    private String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }
}



 */