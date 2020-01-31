package FactoryDesignPattern;

import java.io.*;

public class phoneBill{
    public static void main(String[] args) throws IOException{
        SelectNetworkFactory selectNetwork = new SelectNetworkFactory();
        
        System.out.print("enter the network for which the bill will be generated: ");
        BufferedReader br=new BufferReader(new InputStreamReader(System.in));

        String plan=br.readLine();
        System.out.print("enter the number of minutes for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());

        plan p=selectNetwork.getPlan(String )

    }

}