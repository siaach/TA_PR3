public class Start {
    public static void main(String s[]) {
        Lexer lexer = new Lexer("lexiaclFile.txt");


        while (!lexer.isExausthed()) {
            System.out.printf("%-18s %s\n", lexer.currentToken(), lexer.currentLexema());
            lexer.moveAhead();
        }

        if (lexer.isSuccessful()) {
            System.out.println("Program Successful analyze file");
        } else {
            System.out.println(lexer.errorMessage());
        }
    }
}
/*
3.  Входной  язык  содержит  операторы  условия
if  ... then  ... else  и  if  ... then,
разделённые  символом  ; (точка  с  запятой).
Операторы  условия  содержат идентификаторы,  знаки  сравнения  <, >, =,
шестнадцатеричные  числа,  знак присваивания  (:=).
Шестнадцатеричными  числами  считать последовательность  цифр  и
символов  a, b, c, d, e, f,  начинающуюся  с  цифры (например, 89, 45ac, 0abc).
 */