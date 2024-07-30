package proxyPattern;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;
    private boolean isLoaded;

    public ProxyImage(String filename) {
        this.filename = filename;
        this.isLoaded = false;
    }

    @Override
    public void display() {
        if (!isLoaded) {
            if (realImage == null) {
                realImage = new RealImage(filename);
            }
            isLoaded = true;
        }
        realImage.display();
    }
}

