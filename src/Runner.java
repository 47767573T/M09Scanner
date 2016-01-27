import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by 47767573t on 27/01/16.
 */
public class Runner{

    static int ini = 1;
    static int fin = 100;

    public static void main(String[] args) {

        String ip = "172.31.83.41";

        for (int port = 1; port < 65535; port++) {
            try {
              //  System.out.println("probando puerto: "+port);
                Socket socket = new Socket(ip, port);
                System.out.println("Puerto:" + port + " Abierto");
                socket.close();
            } catch (Exception ex) {
            }
        }
    }
}
