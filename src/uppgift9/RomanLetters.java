package uppgift9;

public enum RomanLetters {
    // De romerska siffrorna anges med bokstäverna I, V, X, L, C, D och M som står för 1, 5, 10, 50, 100,500 resp. 1000.
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    public final int intValue;

    RomanLetters(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }
}
