package com.flowergarden.bouquet;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import com.flowergarden.flowers.GeneralFlower;

public class MarriedBouquet implements Bouquet<GeneralFlower> {

	private float assemblePrice = 120;
	private List<GeneralFlower> flowerList = new ArrayList<>();

	@Override
	public float getPrice() {
		if (flowerList.isEmpty()) return 0;
		float result = assemblePrice;
		for (GeneralFlower generalFlower : flowerList) {
			result += generalFlower.getPrice();
		}
		return result;
	}

	@Override
	public void addFlower(GeneralFlower flower) {
			flowerList.add(flower);
	}

	@Override
	public Collection<GeneralFlower> searchFlowersByLenght(int start, int end) {
		List<GeneralFlower> searchResult = new ArrayList<GeneralFlower>();
		for (GeneralFlower flower : flowerList) {
			if (flower.getLenght() >= start && flower.getLenght() <= end) {
				searchResult.add(flower);
			}
		}
		return searchResult;
	}

	@Override
	public void sortByFreshness() {
		Collections.sort(flowerList);
	}

	@Override
	public Collection<GeneralFlower> getFlowers() {
		return flowerList;
	}

	public void setAssembledPrice(float price) {
		assemblePrice = price;
	}
	
	public MarriedBouquet assembleFromFolder(String folderPath){
		return null;
		
	}
	
	public void saveToFolder(String folderPath){
		
		String[] folders = folderPath.split(File.pathSeparator);
		for (int i = 0; i < folders.length; i++) {
			new File(folders[i]);
			//check and create
		}
		for (GeneralFlower flower : flowerList) {
			//check and save to file
		}
	}
}
