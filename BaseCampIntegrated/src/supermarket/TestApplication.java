package supermarket;

import java.util.Scanner;

public class TestApplication {
	static int itemCount = 0;
	static int customerCount = 0;
	static Scanner sc = new Scanner(System.in);
	static Validations vs = new Validations();
	static boolean result = false;
	public static void main(String[] args) {
		Item items[] = null;
		Customer customers[] = null;

		int op;
		// before that we need to create items in supermarket
		items = createItems(items);
		do {
			displayMenu();
			
			System.out.println("enter an option");
			op = sc.nextInt();
			int flag = 0;
			switch (op) {
			case 1:
				if (itemCount == 0) {
					System.out.println("no items");
				} else {
					displayItems(items);
					System.out.println();
					customers = createCustomers(customers, items);
					if (result == false) {
						flag = 1;
						System.out.println("no item found");
					}
				}
			case 2:
				if (flag == 0) {
					System.out.println("enter mobile number to bill");
					String mno = vs.validatemobileNumber(sc.next());
					customers[customerCount - 1].setMno(mno);
				} else {
					System.out.println("no item found");
				}

				break;
			case 3:
				if (customerCount == 0) {
					System.out.println("no records");
				} else {
					int index = mostSoldItems(items);
					System.out.println("find the sold item till date");

					System.out.println(
							"item id:" + items[index].getItemCode() + ", quantity:" + items[index].getsoldQuantity());

				}
				break;
			case 4:
				if (customerCount == 0) {
					System.out.println("no records");
				} else {
					// get maximum price of the customer
					System.out.println("Most valued customer");
					Customer maxPrice = customers[0];
					for (int i = 0; i < customerCount; i++) {
						if (maxPrice.getPrice() < customers[i].getPrice()) {
							maxPrice = customers[i];
						}
					}
					System.out.println("Customer [itemid=" + maxPrice.getName() + ", mno=" + maxPrice.getMno()
							+ "with a price of" + maxPrice.getPrice());

				}
				break;
			case 5:
				System.out.println("items display");
				displayItems(items);
				System.out.println("customers display");
				display(customers);
				break;
			case 6:
				break;
			default:
				System.out.println("invalid option");
			}
		} while (op != 6);
	}

	private static void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println(
				"choose an option\n1.Add items to bill\n2.Add mobilenumber to bill\n3.Find the most sold items till date.\n"
						+ "4.Find the most valued customer.\n5.display\n6.exit\n");
		System.out.println("enter an option");
	}

	private static int mostSoldItems(Item[] items) {
		// TODO Auto-generated method stub
		int index = 0;
		int max = 0;
		for (int i = 0; i < itemCount; i++) {
			if (items[i].getsoldQuantity() > max) {
				max = items[i].getsoldQuantity();
				index = i;
			}
		}
		return index;
	}

	// display customers
	private static void display(Customer[] customers) {
		for (int i = 0; i < customerCount; i++) {
			System.out.println("Customer [name=" + customers[i].getName() + " , mno=" + customers[i].getMno()
					+ " price=" + customers[i].getPrice());
		}
	}

//display items
	private static void displayItems(Item[] items) {
		for (int i = 0; i < itemCount; i++) {
			System.out.println("Item [itemCode=" + items[i].getItemCode() + ", quantity=" + items[i].getQuantity()
					+ ", MRP=" + items[i].getMRP() + ", discount=" + items[i].getDiscount() + "]");
		}
	}

//create customers
	private static Customer[] createCustomers(Customer[] customers, Item[] items) {
		if (customers != null) {
			Customer temp[] = new Customer[customerCount + 1];
			for (int l = 0; l < customerCount; l++) {
				temp[l] = customers[l];
			}
			customers = temp;
			temp = null;
		} else {
			customers = new Customer[1];
		}
		System.out.println("enter the customer name");
		String name = sc.next();
		System.out.println("ënter number of items you want to buy there are only " + itemCount);
		int userItemCount = vs.validateInt(sc.nextInt());
		int validItemCount = getValidItemCount(userItemCount, itemCount);
		double price = 0;
		int flag = 0;
		for (int p = 0; p < userItemCount; p++) {
			System.out.println("enter item id");
			int id = vs.validateInt(sc.nextInt());

			for (int i = 0; i < itemCount; i++) {
				if (items[i].getItemCode() == id) {
					flag = 1;
					System.out.println("enter quantity:");
					int quantity = vs.validateInt(sc.nextInt());
					int currentQuant = 0;
					int avilableQuantity = getAvailbleQuantity(items, quantity, i);
					int validQuant = 0;
					if (items[i].getQuantity() > quantity) {
						validQuant = quantity;
						items[i].setsoldQuantity(quantity);
						currentQuant = items[i].getQuantity() - quantity;
						items[i].setQuantity(currentQuant);
					} else {
						if (items[i].getQuantity() <= quantity) {
							items[i].setsoldQuantity(quantity);
							currentQuant = quantity - items[i].getQuantity();
							validQuant = items[i].getQuantity();
							items[i].setQuantity(0);
							// delete item
							for (int k = 0; k < itemCount; k++) {
								if (items[i].getQuantity() == 0) {
									for (int j = i; j < itemCount - 1; j++) {
										items[j].setItemCode(items[j + 1].getItemCode());
										items[j].setDiscount(items[j + 1].getDiscount());
										items[j].setQuantity(items[j + 1].getQuantity());
										items[j].setMRP(items[j + 1].getMRP());
									}
									itemCount--;
								}
							}

						}
					}
					price = price
							+ (validQuant * (items[i].getMRP() - ((items[i].getMRP() * items[i].getDiscount()) / 100)));
				}
			}

		}
		customers[customerCount++] = new Customer(price, name);
		if (flag == 1) {
			result = true;
		}
		result = false;
		return customers;
	}

	private static int getValidItemCount(int userItemCount, int itemCount2) {
		// TODO Auto-generated method stub
		boolean isValid = true;
		while (isValid) {
			if (userItemCount <= itemCount) {
				isValid = false;
			} else {
				System.out.println("there are only" + itemCount + "please enter lesser than that ");
				userItemCount = sc.nextInt();
			}
		}
		return userItemCount;
	}
	private static int getAvailbleQuantity(Item[] items, int quantity, int i) {
		// TODO Auto-generated method stub
		boolean isValid = true;
		while (isValid) {
			if (items[i].getQuantity() >= quantity) {
				isValid = false;
			} else {
				System.out.println("stock i unavailble for requrement please enter lesser quantity");
				quantity = sc.nextInt();
			}
		}
		return quantity;
	}
	// create items
	private static Item[] createItems(Item[] items) {
		if (items != null) {
			Item temp[] = new Item[itemCount + 1];
			for (int k = 0; k < itemCount; k++) {
				temp[k] = items[k];
			}
			items = temp;
			temp = null;
		} else {
			items = new Item[1];
		}

		System.out.println("enter number of items");
		int number = vs.validateInt(sc.nextInt());
		for (int i = 0; i < number; i++) {
			System.out.println("enter itemid:");
			int itemId = vs.validateInt(sc.nextInt());
			// get uniqueid
			int uniqueCode = 0;
			if (itemCount > 0) {
				uniqueCode = getUniqueId(itemId, items);
			} else {
				uniqueCode = itemId;
			}
			System.out.println("enter quantity of an item");
			int quantity = vs.validateInt(sc.nextInt());
			System.out.println("enter MRP of an item");
			double mrp = vs.validateDouble(sc.nextDouble());
			System.out.println("enter discount of the item");
			double discount = vs.validateDiscount(sc.nextDouble());
			items[itemCount++] = new Item(uniqueCode, quantity, mrp, discount);
			/* items[i].setsoldQuantity(0); */
		}
		return items;

	}

	private static int getUniqueId(int itemId, Item[] items) {
		boolean isValid = true;
		while (isValid) {
			int flag = 0;
			for (int j = 0; j < itemCount; j++) {
				if (items[j].getItemCode() == itemId) {
					flag = 1;
				}
				if (flag == 1) {
					System.err.println("item code is already exist:once again enter:");
					itemId = sc.nextInt();
				} else {
					isValid = false;
				}
			}
		}
		return itemId;
	}
}
