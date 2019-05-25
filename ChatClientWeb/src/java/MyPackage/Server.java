package MyPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
    String inStream;

   private String outStream;
   DAO D1 = new DAO();



    public Server() throws IOException {

    }

    @Override
    public void run()
    {

        {
            try {
                ServerSocket lyssnarSock = new ServerSocket(55555);
                Socket socketToClient = lyssnarSock.accept();

                PrintWriter out = new PrintWriter(socketToClient.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socketToClient.getInputStream()));



                      while ((inStream = in.readLine()) != null) {
                          if(inStream != null) {
                              System.out.println("Message from client: " + inStream);
                             outStream = D1.getKompis(inStream);
                             out.println(outStream);
                              System.out.println("Hi");
                          }
                    }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
