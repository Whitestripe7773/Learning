package java_11;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException, ScriptException {

        // * Strings * //

        var chant = "   USA!!   ";
        System.out.println("chant.repeat(3): " + chant.repeat(3));
        System.out.println("chant.isBlank(): " + chant.isBlank());
        System.out.println("chant.strip(): " + chant.strip()); // Same as chant.trim()... but unicode whitespace;

        // * Lambdas * //

        // With the var keyword we can also put annotations in front
        Consumer<BigDecimal> moneyConsumer = (@Deprecated var money) -> System.out.println("I got this much money: " + money);

        // * HTTP Client * //

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://google.com"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        // * Unicode 10 * -> 15000 new characters added //

        System.out.println("\u20BF"); // Cryptocurrency -> Bitcoin symbol

        // JavascriptEngine...Nashorn -> Warning will appear: Will be removed in future JDK

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("print('Hello World')");


    }

}
