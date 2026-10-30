package com.Logicalsatments;

import java.util.Scanner;

public class Super_market {
	{
		System.out.println("WELL COME TO SV SUPER_MARKET");
	}

	public static void main(String[] args) {
		Super_market ob=new Super_market();
		double gtotal = 0;
		double totalgc_price = 0;
		double totaldp_price = 0;
		double totalfru_price = 0;
		double totalveg_price = 0;
		double totalsd_price = 0;

		String ynall = "";
		do {
			System.out.println("Enter what catogery you want:");
			System.out.println("1)Grocery Items");
			System.out.println("2)Dairy products");
			System.out.println("3)Fruits");
			System.out.println("4)Vegetables");
			System.out.println("5)Snaks and Drinks");

			Scanner sc = new Scanner(System.in);
			int cg = sc.nextInt();
			String yngc = "";
			String yndp = "";
			String ynfru = "";
			String ynveg = "";
			String ynsd = "";
			switch (cg) {
			case 1 -> {
				do {
					System.out.println("Enter what item you want");
					String gc = sc.next();
					switch (gc) {
					case "rice" -> {
						System.out.println("Rice price per 1kg is :" + "65");
						double riceprice = 65;
						totalgc_price += riceprice;
					}
					case "salt" -> {
						System.out.println("Salt  price per pack is:" + "25");
						int saltprice = 25;
						totalgc_price += saltprice;
					}
					case "dal" -> {
						System.out.println("Dal price per 1kg is: " + "120");
						double dalprice = 120;
						totalgc_price += dalprice;
					}
					case "sugar" -> {
						System.out.println("Sugar price per 1kg is: " + "45");
						double sugarprice = 45;
						totalgc_price += sugarprice;
					}

					case "oil" -> {
						System.out.println("Oil price per 1 litre is: " + "150");
						double oilprice = 150;
						totalgc_price += oilprice;
					}
					case "chilli_powder" -> {
						System.out.println("Chilli powder price per 1kg is: " + "250");
						double chillipowderprice = 250;
						totalgc_price += chillipowderprice;
					}

					case "tamarind" -> {
						System.out.println("Tamarind price per 1kg is: " + "100");
						double tamarindprice = 100;
						totalgc_price += tamarindprice;
					}

					}
					System.out.println("Do You Want to Comtinue y for yes n for no:");
					yngc = sc.next();

				} while (yngc.equalsIgnoreCase("y"));

				System.out.println("Total grocery price:" + totalgc_price);
			}
			case 2 -> {
				do {
					System.out.println("Enter what item you want:");
					String dp = sc.next();
					switch (dp) {
					case "milk" -> {
						System.out.println("Mlik price for liter is: " + "60");
						double milkprice = 60;
						totaldp_price += milkprice;

					}
					case "curd" -> {
						System.out.println("Curd price per 1kg is: " + "80");
						double curdprice = 80;
						totaldp_price += curdprice;
					}

					case "ghee" -> {
						System.out.println("Ghee price per 1kg is: " + "600");
						double gheeprice = 600;
						totaldp_price += gheeprice;
					}

					case "paneer" -> {
						System.out.println("Paneer price per 1kg is: " + "350");
						double paneerprice = 350;
						totaldp_price += paneerprice;
					}
					default -> {
						System.out.println("enter item not Available");
					}
					}
					System.out.println("Do you want to continue y for yes n no:");
					yndp = sc.next();
				} while (yndp.equalsIgnoreCase("y"));

			}
			case 3 -> {
				do {
					System.out.println("Enter what fruit you want:");
					String fru = sc.next();

					switch (fru) {
					case "apple" -> {
						System.out.println("Apple price per 1kg is: " + "180");
						double appleprice = 180;
						totalfru_price += appleprice;
					}
					case "banana" -> {
						System.out.println("Banana price per dozen is: " + "60");
						double bananaprice = 60;
						totalfru_price += bananaprice;
					}
					case "orange" -> {
						System.out.println("Orange price per 1kg is: " + "80");
						double orangeprice = 80;
						totalfru_price += orangeprice;
					}
					case "grapes" -> {
						System.out.println("Grapes price per 1kg is: " + "100");
						double grapesprice = 100;
						totalfru_price += grapesprice;
					}
					case "mango" -> {
						System.out.println("Mango price per 1kg is: " + "120");
						double mangoprice = 120;
						totalfru_price += mangoprice;
					}
					default -> {
						System.out.println("Entered fruit is not available");
					}
					}

					System.out.println("Do you want to continue? y for yes n for no:");
					ynfru = sc.next();

				} while (ynfru.equalsIgnoreCase("y"));

			}
			case 4 -> {
				do {
				    System.out.println("Enter what vegetable you want:");
				    String veg = sc.next();

				    switch (veg) {
				        case "potato" -> {
				            System.out.println("Potato price per 1kg is: " + "40");
				            double potatoprice = 40;
				            totalveg_price += potatoprice;
				        }
				        case "tomato" -> {
				            System.out.println("Tomato price per 1kg is: " + "35");
				            double tomatoprice = 35;
				            totalveg_price += tomatoprice;
				            
				        }
				        case "onion" -> {
				            System.out.println("Onion price per 1kg is: " + "50");
				            double onionprice = 50;
				            totalveg_price += onionprice;
				        }
				        case "carrot" -> {
				            System.out.println("Carrot price per 1kg is: " + "60");
				            double carrotprice = 60;
				            totalveg_price += carrotprice;
				        }
				        case "cabbage" -> {
				            System.out.println("Cabbage price per 1kg is: " + "40");
				            double cabbageprice = 40;
				            totalveg_price += cabbageprice;
				        }
				        default -> {
				            System.out.println("Entered vegetable is not available");
				        }
				    }

				    System.out.println("Do you want to continue? y for yes, n for no:");
				    ynveg = sc.next();

				} while (ynveg.equalsIgnoreCase("y"));

			}
			case 5 -> {
				do {
				    System.out.println("Enter what snack or drink you want:");
				    String sd = sc.next();

				    switch (sd) {
				        case "chips" -> {
				            System.out.println("Chips price per packet is: " + "20");
				            double chipsprice = 20;
				            totalsd_price += chipsprice;
				        }
				        case "kurkure" -> {
				            System.out.println("Chips price per packet is: " + "20");
				            double kurkureprice = 20;
				            totalsd_price += kurkureprice;
				        }
				        case "chocolate" -> {
				            System.out.println("Chocolate price per bar is: " + "40");
				            double chocolateprice = 40;
				            totalsd_price += chocolateprice;
				        }
				        case "juice" -> {
				            System.out.println("Juice price per bottle is: " + "50");
				            double juiceprice = 50;
				            totalsd_price += juiceprice;
				        }
				        case "thusup" -> {
				            System.out.println("Cool drink price per bottle is: " + "45");
				            double cooldrinkprice = 45;
				            totalsd_price += cooldrinkprice;
				        }
				        case "water" -> {
				            System.out.println("Water price per bottle is: " + "20");
				            double waterprice = 20;
				            totalsd_price += waterprice;
				        }
				        default -> {
				            System.out.println("Entered item is not available");
				        }
				    }

				    System.out.println("Do you want to continue? y for yes, n for no:");
				    ynsd = sc.next();

				} while (ynsd.equalsIgnoreCase("y"));

			}
			default -> {
				System.out.println("No Items Not Availble");
			}

			}
			System.out.println("Do you want to continue with catogury y yes n for no");
			ynall = sc.next();
		} while (ynall.equalsIgnoreCase("y"));
        System.out.println("Totalprice"+totalgc_price);
        System.out.println("Total dairy products price:"+totaldp_price);
        System.out.println("Total fruits price:"+totalfru_price);
        System.err.println("Total vegtable price:"+totalveg_price);
        System.out.println("Total snaks and drinks price:"+totalsd_price);
		gtotal = totalgc_price + totaldp_price+totalfru_price+totalveg_price+totalsd_price;
		System.out.println("Grandtotal Price:" + gtotal);

	}

}
