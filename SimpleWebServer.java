
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.ResourceHandler;

public class SimpleWebServer {
    public static void main(String[] args) throws Exception {
        // Create a Jetty server instance on port 8080
        Server server = new Server(8080);

        // Create a resource handler to serve static files (HTML, CSS, JavaScript)
        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setDirectoriesListed(true);
        resourceHandler.setWelcomeFiles(new String[]{"index.html"}); // Set the default file to serve

        // Set the base resource (where your HTML file is located)
        resourceHandler.setResourceBase("path/to/your/html/files");

        // Attach the resource handler to the server
        server.setHandler(resourceHandler);

        // Start the server
        server.start();
        System.out.println("Server started on port 8080");

        // Join the server thread (to keep the server running)
        server.join();
    }
}
