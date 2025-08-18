package Assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AssignmentArraysCollections {

	public static void main(String[] args) {
		// 1. Create Lists with area of top 5 largest cities
        List<Integer> cityAreas = Arrays.asList(8203, 6077, 4851, 4310, 3861); 
        // Example areas (in sq.km) for Tokyo, New York, Beijing, Shanghai, London
        int sum = cityAreas.get(2) + cityAreas.get(3);  // 3rd + 4th
        System.out.println("Total area of 3rd and 4th cities combined: " + sum);
        
        // 2. Create a set of the top 10 tourist attractions
        Set<String> attractions = new HashSet<>();
        attractions.add("Eiffel Tower");
        attractions.add("Great Wall of China");
        attractions.add("Statue of Liberty");
        attractions.add("Taj Mahal");
        attractions.add("Machu Picchu");
        attractions.add("Colosseum");
        attractions.add("Pyramids of Giza");
        attractions.add("Disney World");
        attractions.add("Times Square");
        attractions.add("Louvre Museum");

        System.out.println("\nTop 10 Tourist Attractions:");
        for (String place : attractions) {
            System.out.println(place);
        }
        System.out.println("Total Attractions: " + attractions.size());

        // 3. Create an array of 10 numbers and find average of 5th and 6th values
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        double average = (numbers[4] + numbers[5]) / 2.0;  // index starts at 0
        System.out.println("\nAverage of 5th and 6th values: " + average);

        // 4. List of top 5 highest-grossing movies
        List<String> movies = Arrays.asList(
            "Avatar", 
            "Avengers: Endgame", 
            "Titanic", 
            "Star Wars: The Force Awakens", 
            "Avengers: Infinity War"
        );

        System.out.println("\nThird highest-grossing movie: " + movies.get(2));
	}

}
