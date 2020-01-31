import java.util.Scanner;
class Input{
    public static void main(String[] args) {
        Scanner matrik = new Scanner(System.in);
        int i;
        int j;
        int matrixA[][] = new int [2][2];
        int matrixB[][] = new int [2][2];
        int tambah[][] = new int [2][2];

        System.out.println("Input Matriks A");
        for(i=0;i<matrixA.length;i++){
            for(j=0;j<matrixB.length;j++){
                System.out.print("Matrik A baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + ": ");
                matrixA[i][j] = matrik.nextInt();
            }
        }
        System.out.println("Input Matriks B");
        for(i=0;i<matrixA.length;i++){
            for(j=0;j<matrixB.length;j++){
                System.out.print("Matrik B baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + ": ");
                matrixB[i][j] = matrik.nextInt();
            }
        }
        System.out.println("MATRIK A");
       
        for (i = 0; i < matrixA.length; i++){
            for (j = 0; j < matrixA.length; j++){
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("MATRIK B");
       
        for (i = 0; i < matrixB.length; i++){
            for (j = 0; j < matrixB.length; j++){
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < tambah.length; i++){
            for (j = 0; j < tambah.length; j++){
                tambah[i][j] = matrixA[i][j] + matrixB[i][j];
               
            }
        }
        System.out.println("PENJUMLAHAN MATRIK A DAN MATRIK B");
       
        for (i = 0; i < tambah.length; i++){
            for (j = 0; j < tambah.length; j++){
               
                 System.out.print(tambah[i][j] + " ");
            }
            System.out.println();
        }


    }
}