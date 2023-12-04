package airhacks;

import java.util.Map;

import airhacks.functionurl.boundary.FunctionURLStack;
import software.amazon.awscdk.App;

public interface CDKApp {

    static void main(String... args) {

        var app = new App();
        var appName = "jug-vienna-cdk";

        new FunctionURLStack.Builder(app, appName)
                .functionName("airhacks_ViennaJUG")
                .functionZip("../jug-vienna/target/function.zip")
                .configuration(Map.of("greeting","snowstorm in the clouds"))
                .build();
        app.synth();
    }
}
