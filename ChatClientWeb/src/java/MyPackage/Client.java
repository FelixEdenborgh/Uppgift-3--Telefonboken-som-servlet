package MyPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client extends Thread {
    private String inStream;
    private String outStream;


    Client() throws IOException {

    }

    public void run() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            Socket socketToServer = new Socket(inetAddress,
                    55555);
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socketToServer.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socketToServer.getInputStream()));
           // out.println("Vilket namn vill du slå upp?: ");

            while ((outStream = stdIn.readLine()) != null) {

                // fromUser = stdIn.readLine();

                if (outStream != null) {

                    System.out.println("Reporting to server ");

                    out.println(outStream);



                }
            }
            while((inStream = in.readLine()) != null)
            {

                if(inStream != null) {
                    System.out.println("Message from server: " + inStream);
                }
            }
        }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        }




