package Ch22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class C02Client {
ㅎ
    public static void main(String[] args) throws Exception {

        Socket client = new Socket("192.168.2.16", 2000); // 서버 IP와 포트를 확인하세요.

        DataInputStream din = new DataInputStream(client.getInputStream());
        DataOutputStream dout = new DataOutputStream(client.getOutputStream());

        Scanner sc = new Scanner(System.in);
        String send;
        String recv;
        while(true) {
            // 송신
            System.out.print("[ME(q:종료)] : ");
            send = sc.nextLine();
            dout.writeUTF(send);
            dout.flush();
            if(send.equals("q")) {
                break;
            }

            // 수신
            recv = din.readUTF();
            if(recv.equals("q")) {
                break;
            } else {
                System.out.println("[SERVER] : " + recv);
            }
        }
    }
}
