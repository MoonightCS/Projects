package boyda.popov.org;


public class Scanner implements IScanner {

    private final String str;

    public Scanner(String str) {
        this.str = str;
    }

    public String scan() {
        return str;
    }
}
