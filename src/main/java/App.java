import org.opencv.core.Core;

public class App {
    public static void main(String[] args) {
        // With the org.openpnp dependency, this one line extracts and
        // loads the correct native OpenCV library for your platform.
        // Use loadLocally() on Java 12+ (loadShared() logs a warning there).
        nu.pattern.OpenCV.loadLocally();

        System.out.println("Hello, OpenCV!");
        System.out.println("OpenCV version: " + Core.VERSION);
    }
}
