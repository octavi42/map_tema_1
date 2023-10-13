public class Zahlen_Operations {

    static int maxNR(int[] zahlen) {
        int max_zahl = zahlen[0];

        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] > max_zahl) {
                max_zahl = zahlen[i];
            }
        }

        return max_zahl;
    }

    static int minNR (int[] zahlen) {
        int min_zahl = zahlen[0];

        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] > min_zahl) {
                min_zahl = zahlen[i];
            }
        }

        return min_zahl;
    }

    static int max_sum(int[] noten) {
        int min_note = minNR(noten);

        for (int i=0; i < noten.length; i++) {
            if(noten[i] == min_note) {
                noten[i]=0;
                break;
            }
        }

        int sum = 0;
        for (int i = 0; i < noten.length; i++) {
            sum += noten[i];
        }

        return sum;
    }


    static int min_sum(int[] noten) {
        int max_note = maxNR(noten);

        for (int i=0; i < noten.length; i++) {
            if(noten[i] == max_note) {
                noten[i]=0;
                break;
            }
        }

        int sum = 0;
        for (int i = 0; i < noten.length; i++) {
            sum += noten[i];
        }

        return sum;
    }

}
