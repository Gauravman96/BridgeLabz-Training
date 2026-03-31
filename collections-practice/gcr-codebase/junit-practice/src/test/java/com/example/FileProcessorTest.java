package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class FileProcessorTest {

    FileProcessor processor = new FileProcessor();
    String fileName = "testFile.txt";

    @AfterEach
    void cleanUp() throws IOException {
        Files.deleteIfExists(Path.of(fileName));
    }

    // Write + Read Test
    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello JUnit File Test";

        processor.writeToFile(fileName, content);
        String result = processor.readFromFile(fileName);

        assertEquals(content, result);
    }

    // File Exists Test
    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(fileName, "Test Content");

        assertTrue(Files.exists(Path.of(fileName)));
    }

    // IOException Test
    @Test
    void testReadFileNotFound() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("noFile.txt");
        });
    }
}
