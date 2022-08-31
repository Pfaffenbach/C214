import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaProfessor {

    @Test
    public void testeBuscaProfessor1(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);
        //Fiz a busca
        Professor professor1 = buscaProfessor.buscaprofessor("João");

        //Faz assertion
        assertEquals("João", professor1.getNomeDoProfessor());
        assertEquals(17, professor1.getHorarioDeAtendimento(), 0.1);
        assertEquals("noturno", professor1.getPeriodo());

    }

    @Test
    public void testeBuscaProfessor2(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);
        //Fiz a busca
        Professor professor2 = buscaProfessor.buscaprofessor("Flavio");

        //Faz assertion
        assertEquals("Flavio", professor2.getNomeDoProfessor());
        assertEquals(8, professor2.getHorarioDeAtendimento(), 0.1);
        assertEquals("integral", professor2.getPeriodo());

    }

    @Test
    public void testeBuscaProfessor3(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);
        //Fiz a busca
        Professor professor3 = buscaProfessor.buscaprofessor("Matheus");

        //Faz assertion
        assertEquals("Matheus", professor3.getNomeDoProfessor());
        assertEquals(11, professor3.getHorarioDeAtendimento(), 0.1);
        assertEquals("noturno", professor3.getPeriodo());

    }

    @Test
    public void testeBuscaProfessor4(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);
        //Fiz a busca
        Professor professor4 = buscaProfessor.buscaprofessor("Robersvaldo");

        //Faz assertion
        assertEquals("Josefino", professor4.getNomeDoProfessor());
        assertEquals(14, professor4.getHorarioDeAtendimento(), 0.1);
        assertEquals("integral", professor4.getPeriodo());

    }

    @Test
    public void testeBuscaProfessor5(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);
        //Fiz a busca
        Professor professor5 = buscaProfessor.buscaprofessor("Katrina");

        //Faz assertion
        assertEquals("Robersvaldo", professor5.getNomeDoProfessor());
        assertEquals(20, professor5.getHorarioDeAtendimento(), 0.1);
        assertEquals("noturno", professor5.getPeriodo());

    }

    @Test
    public void testeBuscaProfessor6(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);
        //Fiz a busca
        Professor professor6 = buscaProfessor.buscaprofessor("Inesistente");

        //Faz assertion
        assertEquals("Katrina", professor6.getNomeDoProfessor());
        assertEquals(10, professor6.getHorarioDeAtendimento(), 0.1);
        assertEquals("integral", professor6.getPeriodo());

    }

    // Não foi utilizado
    @Test
    public void testeBuscaProfessorValido(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        boolean professorValido = buscaProfessor.verificaArrayListExistente("");

        assertTrue(professorValido);
    }

    // Não foi utilizado
    @Test
    public void testeBuscaProfessorInValido(){
        ProfessorService service = new MockProfessorService();
        BuscaProfessor buscaProfessor = new BuscaProfessor(service);

        boolean professorInvalido = buscaProfessor.verificaArrayListExistente("");

        assertFalse(professorInvalido);
    }
}
