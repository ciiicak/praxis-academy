class penjumlahanMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{3,2,1},{6,5,4},{9,8,7}};

        int tambah[][] = new int [3][3];

        System.out.println("Matriks 1 = ");
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                System.out.print(matrix1[i][j] + " ");
            }       
            System.out.println();
        }

        System.out.println("Matriks 2 = ");
        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[0].length; j++){
                System.out.print(matrix2[i][j] + " ");
            }       
            System.out.println();
        }

        System.out.println("Hasil Penjumlahan");
        for (int i = 0; i < tambah.length; i++){
            for (int j = 0; j < tambah.length; j++){
                tambah[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(tambah[i][j] + " ");
            }       
            System.out.println();
        }
    }
}