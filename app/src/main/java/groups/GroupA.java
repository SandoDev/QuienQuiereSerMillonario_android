package groups;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class GroupA {

    private int count;
    private ArrayList<String[]> questions;

    //El formato del array es: pregunta, respuesta ganadora, 3 respuestas falsas
    private String question0[] = {"¿Cuál es la capital de Colombia?", "Bogotá", "Caracas", "Quito", "Medellín"};
    private String question1[] = {"¿Qué pintor se arrancó una oreja?", "Van Gogh", "Picasso", "Dalí", "Monet"};
    private String question2[] = {"¿Quién pintaba objetos de aspecto robusto e inflado?", "Botero", "Da Vinci", "Picasso", "Caravaggio"};
    private String question3[] = {"La cría de la rana recibe el nombre de:", "Renacuajo", "Ranica", "Ranacuajo", "Ranita"};
    private String question4[] = {"¿Cuántos grados tiene un ángulo llano?", "180", "45", "120", "90"};
    private String question5[] = {"¿Cuántas regiones conforman la geografía colombiana?", "6", "5", "4", "7"};
    private String question6[] = {"¿Cuál fue el sistema político predominante en la Europa occidental de la Edad Media?", "Feudalismo", "Democracia", "Dictadura", "Capitalismo"};
    private String question7[] = {"¿Cómo murió Juana de Arco?", "Quemada en la hoguera", "Decapitada", "Envenenada", "Ahogada"};
    private String question8[] = {"¿Cuál de las siguientes palabras no se encuentra escrita correctamente?", "Jeneroso", "Jefe", "Gentío", "Germen"};
    private String question9[] = {"¿Cuál es la onomatopeya de la oveja?", "Bee", "Miau", "Pío", "Cuac"};

    public GroupA() {
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
