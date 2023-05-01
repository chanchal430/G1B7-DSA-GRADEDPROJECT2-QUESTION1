package com.gl.dsa.skyscraper.main;

import java.util.Scanner;

import com.gl.dsa.skyscraper.model.FloorConstruction;

public class Driver {
	public static void main(String[] args) {

		// Used try-with-resources to automatically close the Scanner object
		try (Scanner sc = new Scanner(System.in)) {

			FloorConstruction object = new FloorConstruction();

			// Prompt the user to input the total number of floors in the building
			System.out.println("enter the total number of floors in a building");
			int N = sc.nextInt();

			// Create an integer array to store the floor sizes
			int[] floor = new int[N];

			// Prompt the user to input the floor size for each day
			for (int i = 0; i < N; i++) {
				System.out.println("enter the floor size given on day: " + (i + 1));
				floor[i] = sc.nextInt();
			}
			System.out.println();

			/*
			 * Call the skyscraperConstruction method of obj1 to print the order in which
			 * the floors can be constructed
			 */
			object.skyscraperConstruction(floor);

			sc.close();
		}
	}
}