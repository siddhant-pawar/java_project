import java.io.IOException;
import java.net.*;

public class ClientB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(1235);

        while (true) {
            byte[] receiveData = new byte[65535];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);

            String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Client A: " + message);

            System.out.print("Client B: ");
            String response = System.console().readLine();
            byte[] sendData = response.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), receivePacket.getPort());
            socket.send(sendPacket);
        }
    }
}
