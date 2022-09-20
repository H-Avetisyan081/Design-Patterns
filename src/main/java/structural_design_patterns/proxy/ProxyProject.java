package structural_design_patterns.proxy;

public class ProxyProject implements Project {
    private final String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(url);
            System.out.println("Running project " + url + "...");
        }
    }
}
