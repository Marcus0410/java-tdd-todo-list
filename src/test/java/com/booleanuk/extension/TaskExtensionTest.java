package com.booleanuk.extension;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskExtensionTest {
    @Test
    void testComplete() {
        Task task = new Task("task1");

        Assertions.assertFalse(task.isComplete());

        task.complete();

        Assertions.assertTrue(task.isComplete());
    }    

    @Test
    void testGetName() {
        Task task = new Task("task1");

        Assertions.assertEquals("task1", task.getName());
    }

    @Test
    void testGetId() {
        Task task = new Task("task1", 1);

        Assertions.assertEquals(1, task.getId());
    }

    @Test
    void testChangeName() {
        Task task = new Task("task1");
        task.changeName("task2");

        Assertions.assertEquals("task2", task.getName());
    }

    @Test
    void testSetStatus() {
        Task task = new Task("task1");

        task.setStatus(true);
        Assertions.assertTrue(task.isComplete());

        task.setStatus(false);
        Assertions.assertFalse(task.isComplete());
    }

    @Test
    void testGetTimeCreated() {
        Task task = new Task("task1");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime time = task.getTimeCreated();

        Assertions.assertEquals(now, time);
    }

    @Test
    void testSetId() {
        Task task = new Task("task1");
        
        task.setId(777);
        Assertions.assertEquals(777, task.getId());
    }
}
