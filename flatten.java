import java.util.ArrayList;

class MatrixFlatten<T> {

    // Method to flatten a 3D array into a 1D array
    public ArrayList<T> flatten(ArrayList<ArrayList<ArrayList<T>>> a, int n, int m, int p) {
        ArrayList<T> b = new ArrayList<>(n * m * p);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < p; k++) {
                    b.add(a.get(i).get(j).get(k));
                }
            }
        }
        return b;
    }

    public void print3d(ArrayList<ArrayList<ArrayList<T>>> a, int n, int m, int p) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < p; k++) {
                    System.out.print(a.get(i).get(j).get(k) + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public void print1d(ArrayList<T> a, int q) {
        for (int y = 0; y < q; y++) {
            System.out.print(a.get(y) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a 3D array of type T based on the input type

        MatrixFlatten<Integer> mf = new MatrixFlatten<>();
        ArrayList<ArrayList<ArrayList<Integer>>> a = new ArrayList<>();
        int n = 3;
        int m = 2;
        int p = 4;
        for (int i = 0; i < n; i++) {
            ArrayList<ArrayList<Integer>> b = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                ArrayList<Integer> c = new ArrayList<>();
                for (int k = 0; k < p; k++) {
                    c.add(i + j + k);
                }
                b.add(c);
            }
            a.add(b);
        }

        // print the array
        System.out.println("The array is:");
        mf.print3d(a, n, m, p);

        ArrayList<Integer> b = mf.flatten(a, n, m, p);

        // print the flattened array
        System.out.println("The flattened array is:");
        mf.print1d(b, n * m * p);

        MatrixFlatten<String> mfs = new MatrixFlatten<>();
        ArrayList<ArrayList<ArrayList<String>>> as = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<ArrayList<String>> bs = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                ArrayList<String> cs = new ArrayList<>();
                for (int k = 0; k < p; k++) {
                    cs.add("abc" + i + j + k);
                }
                bs.add(cs);
            }
            as.add(bs);
        }

        // print the array
        System.out.println("The array is:");
        mfs.print3d(as, n, m, p);

        ArrayList<String> bs = mfs.flatten(as, n, m, p);

        // print the flattened array
        System.out.println("The flattened array is:");
        mfs.print1d(bs, n * m * p);

        // take the 3d array and flatten it and don't exit the program while input is
        // not "q"
        String input;
        do {
            System.out.println("\nEnter the number of layers:");
            input = System.console().readLine();
            n = Integer.parseInt(input);

            System.out.println("Enter the number of rows:");
            input = System.console().readLine();
            m = Integer.parseInt(input);

            System.out.println("Enter the number of columns:");
            input = System.console().readLine();
            p = Integer.parseInt(input);

            System.out.println(
                    "Enter the type of array to flatten:\n 1. Integer\n 2. String\n 3. Double\n 4. arbitary input\n q. Exit");
            input = System.console().readLine();
            switch (input) {
                case "1":

                    MatrixFlatten<Integer> mfi = new MatrixFlatten<>();
                    ArrayList<ArrayList<ArrayList<Integer>>> ai = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        ArrayList<ArrayList<Integer>> bi = new ArrayList<>();
                        for (int j = 0; j < m; j++) {
                            ArrayList<Integer> ci = new ArrayList<>();
                            for (int k = 0; k < p; k++) {
                                System.out.println("Enter the value for [" + i + "][" + j + "][" + k + "]:");
                                input = System.console().readLine();
                                ci.add(Integer.parseInt(input));
                            }
                            bi.add(ci);
                        }
                        ai.add(bi);
                    }
                    // print the array
                    System.out.println("The array is:");
                    mfi.print3d(ai, n, m, p);
                    // print the flattened array
                    System.out.println("The flattened array is:");
                    mfi.print1d(mfi.flatten(ai, n, m, p), n * m * p);
                    break;
                case "2":
                    MatrixFlatten<String> mfis = new MatrixFlatten<>();
                    ArrayList<ArrayList<ArrayList<String>>> ass = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        ArrayList<ArrayList<String>> bss = new ArrayList<>();
                        for (int j = 0; j < m; j++) {
                            ArrayList<String> css = new ArrayList<>();
                            for (int k = 0; k < p; k++) {
                                System.out.println("Enter the value for [" + i + "][" + j + "][" + k + "]:");
                                input = System.console().readLine();
                                css.add(input);
                            }
                            bss.add(css);
                        }
                        ass.add(bss);
                    }
                    // print the array
                    System.out.println("The array is:");
                    mfis.print3d(ass, n, m, p);
                    // print the flattened array
                    System.out.println("The flattened array is:");
                    mfis.print1d(mfis.flatten(ass, n, m, p), n * m * p);
                    break;
                case "3":
                    MatrixFlatten<Double> mfid = new MatrixFlatten<>();
                    ArrayList<ArrayList<ArrayList<Double>>> aid = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        ArrayList<ArrayList<Double>> bid = new ArrayList<>();
                        for (int j = 0; j < m; j++) {
                            ArrayList<Double> cid = new ArrayList<>();
                            for (int k = 0; k < p; k++) {
                                System.out.println("Enter the value for [" + i + "][" + j + "][" + k + "]:");
                                input = System.console().readLine();
                                cid.add(Double.parseDouble(input));
                            }
                            bid.add(cid);
                        }
                        aid.add(bid);
                    }

                    // print the array
                    System.out.println("The array is:");
                    mfid.print3d(aid, n, m, p);
                    // print the flattened array
                    System.out.println("The flattened array is:");
                    mfid.print1d(mfid.flatten(aid, n, m, p), n * m * p);
                    break;
                case "4":
                    MatrixFlatten<Object> mfio = new MatrixFlatten<>();
                    ArrayList<ArrayList<ArrayList<Object>>> aio = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        ArrayList<ArrayList<Object>> bio = new ArrayList<>();
                        for (int j = 0; j < m; j++) {
                            ArrayList<Object> cio = new ArrayList<>();
                            for (int k = 0; k < p; k++) {
                                System.out.println("Enter the value for [" + i + "][" + j + "][" + k + "]:");
                                input = System.console().readLine();
                                cio.add(input);
                            }
                            bio.add(cio);
                        }
                        aio.add(bio);
                    }
                    // print the array
                    System.out.println("The array is:");
                    mfio.print3d(aio, n, m, p);
                    // print the flattened array
                    System.out.println("The flattened array is:");
                    mfio.print1d(mfio.flatten(aio, n, m, p), n * m * p);
                    break;
                case "q":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
                    break;
            }
            System.out.println("\nEnter q to exit or any other key to continue:");
            input = System.console().readLine();

        } while (!input.equals("q"));

    }
}