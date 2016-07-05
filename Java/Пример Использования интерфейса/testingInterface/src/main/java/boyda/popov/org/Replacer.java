package boyda.popov.org;

public class Replacer {

    private final IPrinter printer;

    private final IScanner scanner;

    public Replacer(IPrinter printer, IScanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    public void replace() {

        final String tmp = scanner.scan();
        final String replacedText = tmp.replace(":)", "=)");
        printer.print(replacedText);

    }

    public static void main(String[] args) {

        final IScanner scanner = new Scanner("fsdfsdfsd:) fsdfsdfs:) fdsfdsfs:):)");
        final IPrinter printer = new Printer();
        final Replacer replacer = new Replacer(printer, scanner);
        replacer.replace();
    }
}
