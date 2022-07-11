package Task4;

public enum Bracket {
    ROUND('(', ')'), SQUARE('[', ']'), BRACES('{', '}');

    private char signOpen;
    private char signClose;

    Bracket(char signOpen, char signClose) {
        this.signOpen = signOpen;
        this.signClose = signClose;
    }

    public char getSignClose() {
        return signClose;
    }

    public char getSignOpen() {
        return signOpen;
    }

    public boolean isSign(char sign) {
        return sign == signOpen || sign == signClose;
    }

    public boolean isOpen(char sign) {
        return sign == signOpen;
    }


}

