package proxyPattern;

public class ProxyPatternTest {
    public static void main(String[] args) {
        Image im1 = new ProxyImage("image1.jpg");
        Image im2 = new ProxyImage("image2.jpg");

        // Image is not loaded yet, so it will load now
        im1.display();
        // Image is already loaded, so it will not load again
        im1.display();

        // Image is not loaded yet, so it will load now
        im2.display();
        // Image is already loaded, so it will not load again
        im2.display();
    }

}
