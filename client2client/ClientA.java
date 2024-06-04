import java.io.IOException;
import java.net.*;

public class ClientA {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();

        InetAddress ipB = InetAddress.getLocalHost();
        int portB = 1235;

        while (true) {
            System.out.print("Client A: ");
            String message = System.console().readLine();

            byte[] sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipB, portB);
            socket.send(sendPacket);

            byte[] receiveData = new byte[65535];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);
            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Client B: " + response);
        }
    }
}
