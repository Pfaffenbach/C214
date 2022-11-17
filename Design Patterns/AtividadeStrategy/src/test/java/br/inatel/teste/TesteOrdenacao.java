package br.inatel.teste;

import br.inatel.Main;
import br.inatel.OrdenaBubble;
import br.inatel.OrdenaInsertion;
import br.inatel.OrdenaSelection;
import br.inatel.func.impl.Bubble;
import br.inatel.func.impl.Insertion;
import br.inatel.func.impl.Selection;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TesteOrdenacao {

    Main main;

    @Test
    public void testeOrdenaBubble() {
        main = new OrdenaBubble();
        ArrayList<Integer> des = new ArrayList<>();
        des.add(7);
        des.add(10);
        des.add(2);
        des.add(5);
        des.add(15);
        ArrayList<Integer> ord = new ArrayList<>();
        ord.add(2);
        ord.add(5);
        ord.add(7);
        ord.add(10);
        ord.add(15);

        main.ordenaVetor(des);

        assertTrue(main.getOrdenador() instanceof Bubble);
        assertEquals(ord, des);
    }

    @Test
    public void testeOrdenaInsertion() {
        main = new OrdenaInsertion();
        ArrayList<Integer> des = new ArrayList<>();
        des.add(7);
        des.add(10);
        des.add(2);
        des.add(5);
        des.add(15);
        ArrayList<Integer> ord = new ArrayList<>();
        ord.add(2);
        ord.add(5);
        ord.add(7);
        ord.add(10);
        ord.add(15);

        main.ordenaVetor(des);

        assertTrue(main.getOrdenador() instanceof Insertion);
        assertEquals(ord, des);

    }

    @Test
    public void testeOrdenaSelection() {
        main = new OrdenaSelection();
        ArrayList<Integer> des = new ArrayList<>();
        des.add(7);
        des.add(10);
        des.add(2);
        des.add(5);
        des.add(15);
        ArrayList<Integer> ord = new ArrayList<>();
        ord.add(2);
        ord.add(5);
        ord.add(7);
        ord.add(10);
        ord.add(15);

        main.ordenaVetor(des);

        assertTrue(main.getOrdenador() instanceof Selection);
        assertEquals(ord, des);
    }

    @Test
    public void testeOrdenaBubble2() {
        main = new OrdenaBubble();
        ArrayList<Integer> des = new ArrayList<>();
        des.add(777);
        des.add(27685);
        des.add(666);
        des.add(52484);
        des.add(4127);
        des.add(278);
        des.add(2178);
        des.add(16557);
        ArrayList<Integer> ord = new ArrayList<>();
        ord.add(278);
        ord.add(666);
        ord.add(777);
        ord.add(2178);
        ord.add(4127);
        ord.add(16557);
        ord.add(27685);
        ord.add(52484);

        main.ordenaVetor(des);

        assertTrue(main.getOrdenador() instanceof Bubble);
        assertEquals(ord, des);
    }

}
