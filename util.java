public static int randomIntRange(int min, int max) {
    return (int) (min + Math.random() * (max - min + 1));
}

+ askInt()
(demande entier robuste)
while(!kb.hasNextInt()){
    System.out.println("Entrez un entier s'il vous plait");
    kb.next();
}

+ asktIntBetween(int min, int max)
(demande entier robuste entre min et max)
public static int askIntBetween(int min, int max) {
    System.out.println("bonjour entrez un entier ");
    while (!kb.hasNextInt()) {
        System.out.println("Entrez un entier s'il vous plait");
        kb.next();
    }
    int entier = kb.nextInt();
    while (entier < min || entier > max) {
        System.out.println("Entrez un nombre entre " + min + " et " + max);
        while (!kb.hasNextInt()) {
            System.out.println("Entrez un entier s'il vous plait");
            kb.next();
        }
        entier = kb.nextInt();
    }

    return entier;
}
