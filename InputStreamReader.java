import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class InputStreamReader{
    public static void main(String[] args) throws MalformedURLException, IOException{

        URL webpage = new URL("https://el-gr.facebook.com/");
        InputStreamReader  inp = new InputStreamReader(webpage.openStream());
        try (BufferedReader in = new BufferedReader(inp)) {
            String selida;
            while(null!=(selida = in.readLine())){
                System.out.println(selida);
            }
        }

    }
}