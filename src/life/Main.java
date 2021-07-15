package life;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int game_size = scanner.nextInt();
        int number_of_generations = 10;
        int last_generation = 25;
        MatrixGeneration this_matrix = new MatrixGeneration(game_size, number_of_generations);


        for (int i = number_of_generations ; i < last_generation ; i ++){
            System.out.println("Generation #" + i);
            System.out.println("Alive: " + this_matrix.alive_cells);
            this_matrix.Generate_next();
            this_matrix.DrawBoard(this_matrix.current_gen);
        }
    }
}
