package ru.gb.elfimova;

import ru.gb.elfimova.moduls.WritingFile;

/**
 * Основной класс приложения. Здесь мы можем описать его основное назначение и способы взаимодействия с ним.
 */
    public class Main {
        public static void main(String[] args) {
            WritingFile writingFile = new WritingFile();
            writingFile.writeInFile();
        }
}