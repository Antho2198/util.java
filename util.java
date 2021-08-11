public static int randomIntRange(int min, int max) {
    return (int) (min + Math.random() * (max - min + 1));
}

+ askInt()
(demande entier robuste)
while(kb.hasNextInt){
    System.out.println("Entrez un entier s'il vous plait");
    kb.next();
}

+ asktIntBetween(int min, int max)
(demande entier robuste entre min et max)
while(kb.hasNextInt){
    System.out.println("Entrez un entier s'il vous plait");
    kb.next();
int entier = kb.hasNextInt;
    while(int < min || int > max){
        System.out.Println("Entrez entre ")
        kb.next();
    }
