package day3;

import java.io.*;
import java.net.*;

public class TcpClient {
    public static void main(String[] args) {
        try {
            // 指定服务器地址和端口
            String serverHost = "localhost"; // 服务器地址，这里使用 localhost 表示本地主机
            int serverPort = 8888; // 服务器端口号，需要与服务器监听的端口号一致

            // 创建一个 Socket 连接到服务器
            Socket socket = new Socket(serverHost, serverPort);
            System.out.println("Connected to server at " + serverHost + ":" + serverPort);

            // 获取输出流，用于向服务器发送数据
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream, true);

            // 向服务器发送消息
            String messageToSend = "Hello, server!";
            writer.println(messageToSend);

            // 获取输入流，用于接收服务器返回的数据
            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            // 读取服务器返回的消息
            String serverResponse = reader.readLine();
            System.out.println("Received from server: " + serverResponse);

            // 关闭连接
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
