package org.example;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class MatrixElement {
    public static void main(String[] args) {
        Element element = new Element(5, 5); // Пример создания элемента

        Element[] neighbors = element.getNeighbors(); // Получаем соседей

        System.out.println("Соседи элемента (" + element.getX() + ", " + element.getY() + "):");
        for (Element neighbor : neighbors) {
            System.out.println("(" + neighbor.getX() + ", " + neighbor.getY() + ")");
        }
    }


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Element {
        private int x;
        private int y;

        public Element[] getNeighbors() {
            // Массив смещений для получения соседей (влево, вправо, вверх, вниз)
            int[][] offsets = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

            List<Element> neighbors = new ArrayList<>();

            for (int[] offset : offsets) {
                int neighborX = x + offset[0];
                int neighborY = y + offset[1];

                // Проверяем, что сосед находится внутри матрицы
                if (neighborX >= 0 && neighborX < 10 && neighborY >= 0 && neighborY < 10) {
                    neighbors.add(new Element(neighborX, neighborY));
                }
            }

            return neighbors.toArray(new Element[0]);
        }
    }
}
