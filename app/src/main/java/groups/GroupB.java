package groups;

import java.util.ArrayList;
import java.util.Random;

public class GroupB {

    private int count, money;
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
    private String question10[] = {"Uno de los libros de J. K. Rowling es Harry Potter y:", "El prisionero de Azkaban", "El arca perdida", "La magia negra", "Su varita"};
    private String question11[] = {"Con que material esculpió Miguel Angel 'La Piedad' ubicada en el Vaticano?", "Marmol", "Bronce", "Madera", "Yeso"};
    private String question12[] = {"A que tipo de animales se refiere la palabra 'aviario'?", "Aves", "Peces", "Mamíferos", "Moluscos"};
    private String question13[] = {"En la mitología griega, Eros es considerado el dios del:", "Amor", "Miedo", "Trabajo", "Odio"};
    private String question14[] = {"Al periódico que se publica en horas de la tarde, se denomina:", "Vespertino", "Matutino", "Clandestino", "Pristino"};
    private String question15[] = {"Cual de estos animales es un rumiante?", "La vaca", "El loro", "El caracol", "La ardilla"};
    private String question16[] = {"¿A qué religión pertenece la filosofía Zen?", "Budismo", "Hinduísmo", "Taoísmo", "Judaísmo"};
    private String question17[] = {"¿Qué ciudad fue sede de la primera edición del Festival Internacional de Cine en 1932?", "Venecia", "Berlín", "Moscú", "Cannes"};
    private String question18[] = {"¿Quién fue el primer ganador del Premio Nobel de Literatura?", "Un poeta", "Un dramaturgo", "Un novelista", "Un ensayista"};
    private String question19[] = {"En la antigua Grecia, no se le permitía a las mujeres participar en los Juegos Olímpicos, con la excepción de un deporte:", "Carrera de carruajes", "Lucha", "Natación", "Correr"};
    private String question20[] = {"¿Qué tipo de palabra se utiliza en cada versión actualizada del sistema operativo Android?", "El de un dulce", "El de una temporada", "El de un océano", "El de algún nativo estadounidense"};
    private String question21[] = {"Los astrónomos lo definen como 'la más baja culminación del sol'. ¿Qué término es?", "Medianoche", "Verano", "Tormenta mágnetica", "Eclipse solar"};
    private String question22[] = {"Una persona famelica esta:", "Hambrienta", "Irritable", "Furiosa", "Asustada"};
    private String question23[] = {"La contínua y persistente subida general de los precios, se denomina:", "Inflación", "Deflación", "Precipitación", "Superávit"};
    private String question24[] = {"Cual de las siguientes palabras es una preposición?", "De", "La", "Una", "Ser"};

    public GroupB() {
        count = 25;
        money = 1000;
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
        questions.add(question10);
        questions.add(question11);
        questions.add(question12);
        questions.add(question13);
        questions.add(question14);
        questions.add(question15);
        questions.add(question16);
        questions.add(question17);
        questions.add(question18);
        questions.add(question19);
        questions.add(question20);
        questions.add(question21);
        questions.add(question22);
        questions.add(question23);
        questions.add(question24);
    }

    public String[] GenerateQuestion() {
        int index = new Random().nextInt(count);
        String data[] = questions.get(index);
        questions.remove(index);
        count--;
        return data;
    }

    public int GenerateMoney() {
        return (money = money * 2);
    }
}
