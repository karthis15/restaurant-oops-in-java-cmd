package rest;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuItems {
	public int itemId;
	public String itemName;
	public int itemprice;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemprice() {
		return itemprice;
	}

	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}

	@Override
	public String toString() {
		return "Menu [itemId=" + itemId + ", itemName=" + itemName + ", itemprice=" + itemprice + "]";
	}

	public MenuItems(int itemId, String itemName, int itemprice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemprice = itemprice;
	}
}

class AddMenuItem {
	static ArrayList<MenuItems> menuItems = new ArrayList<>();

	static void menuItems() {
		menuItems.add(new MenuItems(1, "Vada", 10));
		menuItems.add(new MenuItems(2, "Dosa", 50));
		menuItems.add(new MenuItems(3, "Idli", 20));
		menuItems.add(new MenuItems(4, "Bonda", 30));
	}

	void menus() {
		Iterator<MenuItems> it = menuItems.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
