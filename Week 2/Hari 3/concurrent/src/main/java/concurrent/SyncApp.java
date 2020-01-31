package concurrent;

class Printer{
    void PrintDocs(int numOfCopies, String docName){
        for(int i=1;i<=numOfCopies;i++){
            System.out.println(">> Printing "+docName+" "+i);
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run(){

    }
}

public class SyncApp{

    public static void main(String[] args) {
        
        System.out.println("==Appilcation Start==");

        Printer printer = new Printer();
        printer.PrintDocs(10, "fandik");

        System.out.println("==Application Finish==");
    }
}