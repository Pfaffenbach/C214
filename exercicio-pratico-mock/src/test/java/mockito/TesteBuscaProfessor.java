package mockito;

import test.ProfessorConst;
import main.Professor;
import main.BuscaProfessor;
import main.ProfessorService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaProfessor {
    @Mock
    private ProfessorService service;
    private BuscaProfessor buscaProfessor;

    @Before
    public void setup(){
        buscaProfessor = new BuscaProfessor(service);
    }

    @Test
    public void testeBuscaProfessor1(){
        Mockito.when(service.busca("João")).thenReturn(ProfessorConst.Professor1);

        Professor professor1 = buscaProfessor.buscaprofessor("João");
        //Faz assertion
        assertEquals("João", professor1.getNomeDoProfessor());
        assertEquals(17, professor1.getHorarioDeAtendimento(), 0.1);
        assertEquals("noturno", professor1.getPeriodo());

    }

    @Test
    public void testeBuscaProfessor2(){
        Mockito.when(service.busca("Flavio")).thenReturn(ProfessorConst.Professor2);

        //Fiz a busca
        Professor professor2 = buscaProfessor.buscaprofessor("Flavio");

        //Faz assertion
        assertEquals("Flavio", professor2.getNomeDoProfessor());
        assertEquals(8, professor2.getHorarioDeAtendimento(), 0.1);
        assertEquals("integral", professor2.getPeriodo());

    }

    @Test
    public void testeBuscaProfessor3(){
        Mockito.when(service.busca("Matheus")).thenReturn(ProfessorConst.Professor3);

        //Fiz a busca
        Professor professor3 = buscaProfessor.buscaprofessor("Matheus");

        //Faz assertion
        assertEquals("Matheus", professor3.getNomeDoProfessor());
        assertEquals(11, professor3.getHorarioDeAtendimento(), 0.1);
        assertEquals("noturno", professor3.getPeriodo());

    }

    @Test
    public void testeBuscaProfessor4(){
        Mockito.when(service.busca("Josefino")).thenReturn(ProfessorConst.Professor4);

        //Fiz a busca
        Professor professor4 = buscaProfessor.buscaprofessor("Robersvaldo");

        //Faz assertion
        assertEquals("Josefino", professor4.getNomeDoProfessor());
        assertEquals(14, professor4.getHorarioDeAtendimento(), 0.1);
        assertEquals("integral", professor4.getPeriodo());

    }

    @Test
    public void testeBuscaProfessor5(){
        Mockito.when(service.busca("Robersvaldo")).thenReturn(ProfessorConst.Professor5);

        //Fiz a busca
        Professor professor5 = buscaProfessor.buscaprofessor("Katrina");

        //Faz assertion
        assertEquals("Robersvaldo", professor5.getNomeDoProfessor());
        assertEquals(20, professor5.getHorarioDeAtendimento(), 0.1);
        assertEquals("noturno", professor5.getPeriodo());

    }

    @Test
    public void testeBuscaProfessor6(){
        Mockito.when(service.busca("Katrina")).thenReturn(ProfessorConst.Professor6);

        //Fiz a busca
        Professor professor6 = buscaProfessor.buscaprofessor("Inesistente");

        //Faz assertion
        assertEquals("Katrina", professor6.getNomeDoProfessor());
        assertEquals(10, professor6.getHorarioDeAtendimento(), 0.1);
        assertEquals("integral", professor6.getPeriodo());

    }

    // Não foi utilizado
    @Test
    public void testeBuscaProfessorInvalido(){
        Mockito.when(service.busca("")).thenReturn(ProfessorConst.Inesistente);

        Professor professor = buscaProfessor.buscaprofessor("");
        //Faz assertion
        assertEquals("Inexistente", professor.getNomeDoProfessor());
        assertEquals(0, professor.getHorarioDeAtendimento(), 0.1);
        assertEquals("Inexistente", professor.getPeriodo());

    }
    // Não foi utilizado
    @Test
    public void testeBuscaProfessorValido(){

        Mockito.when(service.professorExistente("")).thenReturn(true);

        boolean professorValido = service.professorExistente("");

        assertTrue(professorValido);
    }

}
