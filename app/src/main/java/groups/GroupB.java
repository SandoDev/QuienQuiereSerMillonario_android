package groups;

import java.util.ArrayList;
import java.util.Random;

public class GroupB {

    private int count;
    private ArrayList<String[]> questions;

    //El formato del array es: pregunta, respuesta ganadora, 3 respuestas falsas
    private String question0[] = {"¿Dónde se encuentra el Museum of Modern Art?", "Nueva York", "Londres", "Roma", "MedelParíslín"};
    private String question1[] = {"¿Quién pintó 'Las Meninas'?", "Diego Velázquez", "Pablo Picasso", "Van Gogh", "Miguel Ángel"};
    private String question2[] = {"El orden de los elementos en la tabla periódica tiene en cuenta:", "El peso atómico", "El alfabeto", "La temperatura", "El tamaño"};
    private String question3[] = {"¿De los siguientes cuál es el planeta más caliente?", "Venus", "Mercurio", "Marte", "Júpiter"};
    private String question4[] = {"¿Qué precioso material se extrae de las minas de Muzo?", "Esmeraldas", "Zafiros", "Diamantes", "Rubíes"};
    private String question5[] = {"¿En qué hemisferio está situado Colombia?", "En los dos hemisferios", "En el hemisferio sur", "En el hemisferio norte", "En ninguno de los dos"};
    private String question6[] = {"¿Qué pueblo realizó numerosas obras públicas, puentes, teatros, acueductos, etc.?", "Romanos", "Bizantinos", "Visigodos", "Franceses"};
    private String question7[] = {"¿Cuándo tuvo lugar la caída del Muro de Berlín?", "1989", "1980", "1990", "1998"};
    private String question8[] = {"¿Cuál de las siguientes palabras tiene el mismo significado que 'aforo'?", "Capacidad", "Tosco", "Tastro", "Linaje"};
    private String question9[] = {"¿Qué ciencia estudia los signos lingüísticos?", "Semántica", "Gramática", "Sinonimia", "Sintaxis"};

    public GroupB() {
        count = 10;
        questions = new ArrayList<>();
        questions.add(question0);
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
    }

    public String[] GenerateQuestion() {
        int index = new Random().nextInt(count);
        String data[] = questions.get(index);
        questions.remove(index);
        count--;
        return data;
    }
}
