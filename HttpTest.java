package rtg;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;

class HttpTest {
    public static void main(String[] args) {
        try {
            var client = HttpClient.newHttpClient();
            var req = HttpRequest.newBuilder()
            .uri(URI.create("https://www.google.com"))
            .build();

            var res = client.send(req, HttpResponse.BodyHandlers.ofString());
            System.out.println(res.body());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


/*  var
変数を宣言する際にデータ型を省略できる
代入された値からコンパイラーが自動的に型（int,String等）を推論し決定する（型推論）
変数の型を指定する代わりにvarと書くことで型の指定を省略することができる
*/