package com.trello.javaprograms;

import java.util.*;

public class Occuerance {
	public static void main(String[] args) {

		String str = "Manoj is awesome because awesome is Manoj";

		Map<String, Integer> hashMap = new HashMap<>();

		String[] words = str.split(" ");

		for (String word : words) {

			Integer integer = hashMap.get(word);

			if (integer == null)
				hashMap.put(word, 1);

			else {

				hashMap.put(word, integer + 1);
			}
		}
		System.out.println(hashMap);
	}
}
