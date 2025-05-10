import java.io.*;
import java.net.*;
public class SimpleWebServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket=new ServerSocket(8081);
		System.out.println("Server started on port 8081");
		while(true) {
			Socket client=serverSocket.accept();
			BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
			BufferedWriter out=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			String line;
			while(!(line=in.readLine()).isBlank()) {
				System.out.println(line);
			}
			String html = "<html><body><h1>Welcome to My Java Web Server!</h1></body></html>";
            out.write("HTTP/1.1 200 OK\r\n");
            out.write("Content-Type: text/html\r\n");
            out.write("Content-Length: " + html.length() + "\r\n");
            out.write("\r\n");
            out.write(html);
            out.flush();
            client.close();
		}
	}
}