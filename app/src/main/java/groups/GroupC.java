package groups;

import java.util.ArrayList;
import java.util.Random;

public class GroupC {

    private int count;
    private ArrayList<String[]> questions;

    //El formato del array es: pregunta, respuesta ganadora, 3 respuestas falsas
    private String question0[] = {"¿A qué estilo arquitectónico pertenece la Torre de Pissa?", "Románico", "Barroco", "Gótico", "Neoclásico"};
    private String question1[] = {"¿Quién pinto 'El nacimiento de Venus'?", "Tizziano", "Miguel Ángel", "Botticelli", "Da Vinci"};
    private String question2[] = {"El aparato digestivo está formado por la boca, estómago, esófago, intestino delgado, intestino grueso y:", "Riñones", "Corazón", "Faringe", "Laringe"};
    private String question3[] = {"¿Cómo se reproduce una estrella de mar?", "Escisión", "Bipartición", "Meiosis", "Ósmosis"};
    private String question4[] = {"El café que se produce en Colombia es el de tipo arábica, que se caracteriza por ser el más:", "Suave", "Acidulado", "Fuerte", "Rico"};
    private String question5[] = {"El patólogo Manuel Elkin Patarroyo es famoso por los estudios de una vacuna sintética contra el:", "Paludismo o malaria.", "Ébola", "Dengue", "Chikungunya"};
    private String question6[] = {"¿Qué emperador dividió al imperio romano en oriente y occidente?", "Diocleciano", "Cadmo", "Rómulo", "Remo"};
    private String question7[] = {"¿A qué ejército pertenecían los centuriones?", "Romano", "Bizantino", "Ruso", "Griego"};
    private String question8[] = {"¿Cómo se pueden formar palabras?", "Parasintéticamente", "Por composición", "Por derivación", "Todas son correctas"};
    private String question9[] = {"¿Quién fue el maestro del movimiento modernista?", "Rubén Darío", "Francisco Quevedo", "Manuel Machado", "Juan Ramón Jiménez"};

    public GroupC() {
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
        questions.remove(index);//remueve del array la pregunta proxima a mostrar
        count--;
        return data;
    }
}
