package oop.exercises.ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class sortNamesTest {

    @Test
    void sortList_returns_correct_answer() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("k");
        list.add("j");
        list.add("l");
        list.add("i");

        sortNames sort = new sortNames();
        sort.getList(list);
        sort.sortList();

        assertEquals("i", list.get(0));
    }
}