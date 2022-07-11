package Task4;

public class Task4 {
    //    1. Враховуючи рядок, що містить символи '(', ')', '{', '}', '[' і ']', визначте,
//    чи є вхідний рядок допустимим. Вхідний рядок є дійсним, якщо:
//    Відкриті дужки повинні бути закриті дужками того ж типу. Відкриті
//    дужки мають бути закриті у правильному порядку.
//    Зверніть увагу, що порожній рядок також вважається
//    допустимим.

    static int getCountOfSymbol(String str, char symbol) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                count++;
            }
        }

        return count;
    }

    static boolean isOpenBracket(char ch) {
        if (Bracket.ROUND.isOpen(ch) || Bracket.SQUARE.isOpen(ch) || Bracket.BRACES.isOpen(ch)) {
            return true;
        }
        return false;
    }

    static boolean check (char lastOpenBracket, char ch) {
        if (Bracket.ROUND.isSign(ch) && !Bracket.ROUND.isSign(lastOpenBracket) && lastOpenBracket != ' ') {
            return false;
        }

        if (Bracket.SQUARE.isSign(ch) && !Bracket.SQUARE.isSign(lastOpenBracket) && lastOpenBracket != ' ') {
            return false;
        }

        if (Bracket.BRACES.isSign(ch) && !Bracket.BRACES.isSign(lastOpenBracket) && lastOpenBracket != ' ') {
            return false;
        }

        return true;
    }

    static boolean isValidStr(String str) {
        if(str.length() == 0) return true;

        int roundCount = getCountOfSymbol(str, Bracket.ROUND.getSignOpen());
        int squareCount = getCountOfSymbol(str, Bracket.SQUARE.getSignOpen());
        int bracesCount = getCountOfSymbol(str, Bracket.BRACES.getSignOpen());

        if (roundCount != getCountOfSymbol(str, Bracket.ROUND.getSignClose())) {
            return false;
        }

        if (squareCount!= getCountOfSymbol(str, Bracket.SQUARE.getSignClose())) {
            return false;
        }

        if (bracesCount != getCountOfSymbol(str, Bracket.BRACES.getSignClose())) {
            return false;
        }

        int bracketCounts = (roundCount * 2) + (squareCount * 2) + (bracesCount * 2);

        char[] brackets = new char[bracketCounts];

        int c = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Bracket.ROUND.isSign(ch) || Bracket.SQUARE.isSign(ch) || Bracket.BRACES.isSign(ch)) {
                brackets[c] = ch;
                c++;
            }
        }

        if (!isOpenBracket(brackets[0])) {
            return false;
        }

        char lastOpenBracket = ' ';

        for (int i = 0; i < brackets.length; i++) {
            char ch = brackets[i];

            if (isOpenBracket(ch)) {
                lastOpenBracket = ch;
            } else {

                boolean isValid = check(lastOpenBracket, ch);

                if (!isValid) {
                    return false;
                }

                lastOpenBracket = ' ';
            }

        }

        return true;
    }
}


