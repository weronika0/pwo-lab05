package pwo.app;

/**
 *
 * @author Weronika
 */
public class Sequence {

    /**
     *Wyświetlenie/zapisanie wyników programu w zależności od podanych argumentów
     */
    public static void main(String[] args) {

        switch (args.length) {
            case 3:
                (new SeqToOutApp()).run(args);
                break;
            case 4:
                (new SeqToFileApp()).run(args);
                break;

            default:
                System.out.println("!Illegal arguments\n"
                        + "Legal usage: seqName from to [fileName]");
        }
    }
}
