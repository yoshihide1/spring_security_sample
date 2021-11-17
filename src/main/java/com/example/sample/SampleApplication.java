package com.example.sample;

import com.example.sample.sample_program.Armor;
import com.example.sample.sample_program.Weapon;
import com.example.sample.sample_program.Item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
		System.out.println("＊＊＊＊＊＊＊＊＊＊");
		System.out.println("＊＊Hello World!＊＊");
		// useItem(createItems());
		System.out.println("＊＊＊＊＊＊＊＊＊＊");

	}

	// test
	private static Item[] createItems() {
		Item[] items = { new Weapon("鋼の剣", 200), new Armor("鉄の鎧", 300) };
		// var items2 = new ArrayList<Item>();
		// items2.add( new Buki("鋼の剣", 200));
		// items2.add(new Armor("鉄の鎧", 300));
		return items;
	}

	// test
	// Itemを使う
	private static void useItem(Item[] items) {
		for (var item : items) {
			item.use();
		}
	}
}
