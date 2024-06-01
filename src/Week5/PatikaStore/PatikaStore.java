package Week5.PatikaStore;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brand implements Comparable<Brand> {
    private int id;
    private String name;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Brand other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

abstract class Product {
    private int id;
    private double price;
    private double discount;
    private int stock;
    private String name;
    private Brand brand;

    public Product(int id, double price, double discount, int stock, String name, Brand brand) {
        this.id = id;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return String.format("| %-3d | %-30s | %-10.2f | %-10s |", id, name, price, brand.getName());
    }
}

class Notebook extends Product {
    private int ram;
    private int storage;
    private double screenSize;

    public Notebook(int id, double price, double discount, int stock, String name, Brand brand, int ram, int storage, double screenSize) {
        super(id, price, discount, stock, name, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %-10d | %-10.1f | %-10d |", storage, screenSize, ram);
    }
}

class CellPhone extends Product {
    private int memory;
    private double screenSize;
    private int battery;
    private int ram;
    private String color;

    public CellPhone(int id, double price, double discount, int stock, String name, Brand brand, int memory, double screenSize, int battery, int ram, String color) {
        super(id, price, discount, stock, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %-10d | %-10.1f | %-10d | %-10d | %-10s |", memory, screenSize, battery, ram, color);
    }
}

public class PatikaStore {
    private static List<Brand> brands = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Statik olarak markaları ekleyelim
        addBrands();

        while (true) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Yeni satır karakterini temizle

            switch (choice) {
                case 1:
                    notebookOperations();
                    break;
                case 2:
                    cellPhoneOperations();
                    break;
                case 3:
                    listBrands();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçenek! Lütfen tekrar deneyiniz.");
            }
        }
    }

    private static void addBrands() {
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));

        Collections.sort(brands);
    }

    private static void listBrands() {
        System.out.println("Markalarımız");
        System.out.println("--------------");
        for (Brand brand : brands) {
            System.out.println("- " + brand);
        }
    }

    private static void notebookOperations() {
        // Notebook işlemleri
        System.out.println("Notebook İşlemleri:");
        System.out.println("1 - Notebookları Listele");
        System.out.println("2 - Notebook Ekle");
        System.out.println("3 - Notebook Sil");
        // Diğer işlemler...

        int choice = scanner.nextInt();
        scanner.nextLine(); // Yeni satır karakterini temizle

        switch (choice) {
            case 1:
                listNotebooks();
                break;
            case 2:
                addNotebook();
                break;
            case 3:
                deleteProduct("Notebook");
                break;
            default:
                System.out.println("Geçersiz seçenek! Lütfen tekrar deneyiniz.");
        }
    }

    private static void cellPhoneOperations() {
        // Cep telefonu işlemleri
        System.out.println("Cep Telefonu İşlemleri:");
        System.out.println("1 - Cep Telefonlarını Listele");
        System.out.println("2 - Cep Telefonu Ekle");
        System.out.println("3 - Cep Telefonu Sil");
        // Diğer işlemler...

        int choice = scanner.nextInt();
        scanner.nextLine(); // Yeni satır karakterini temizle

        switch (choice) {
            case 1:
                listCellPhones();
                break;
            case 2:
                addCellPhone();
                break;
            case 3:
                deleteProduct("CellPhone");
                break;
            default:
                System.out.println("Geçersiz seçenek! Lütfen tekrar deneyiniz.");
        }
    }

    private static void listNotebooks() {
        System.out.println("Notebook Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID  | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Product product : products) {
            if (product instanceof Notebook) {
                System.out.println(product);
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    private static void listCellPhones() {
        System.out.println("Cep Telefonu Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID  | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Pil Gücü  | RAM       | Renk      |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (Product product : products) {
            if (product instanceof CellPhone) {
                System.out.println(product);
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }

    private static void addNotebook() {
        System.out.print("Ürün ID: ");
        int id = scanner.nextInt();
        System.out.print("Fiyat: ");
        double price = scanner.nextDouble();
        System.out.print("İndirim Oranı: ");
        double discount = scanner.nextDouble();
        System.out.print("Stok Miktarı: ");
        int stock = scanner.nextInt();
        scanner.nextLine(); // Yeni satır karakterini temizle
        System.out.print("Ürün Adı: ");
        String name = scanner.nextLine();
        System.out.print("Marka: ");
        String brandName = scanner.nextLine();
        Brand brand = getBrandByName(brandName);
        System.out.print("RAM: ");
        int ram = scanner.nextInt();
        System.out.print("Depolama: ");
        int storage = scanner.nextInt();
        System.out.print("Ekran Boyutu: ");
        double screenSize = scanner.nextDouble();

        products.add(new Notebook(id, price, discount, stock, name, brand, ram, storage, screenSize));
    }

    private static void addCellPhone() {
        System.out.print("Ürün ID: ");
        int id = scanner.nextInt();
        System.out.print("Fiyat: ");
        double price = scanner.nextDouble();
        System.out.print("İndirim Oranı: ");
        double discount = scanner.nextDouble();
        System.out.print("Stok Miktarı: ");
        int stock = scanner.nextInt();
        scanner.nextLine(); // Yeni satır karakterini temizle
        System.out.print("Ürün Adı: ");
        String name = scanner.nextLine();
        System.out.print("Marka: ");
        String brandName = scanner.nextLine();
        Brand brand = getBrandByName(brandName);
        System.out.print("Hafıza: ");
        int memory = scanner.nextInt();
        System.out.print("Ekran Boyutu: ");
        double screenSize = scanner.nextDouble();
        System.out.print("Pil Gücü: ");
        int battery = scanner.nextInt();
        System.out.print("RAM: ");
        int ram = scanner.nextInt();
        scanner.nextLine(); // Yeni satır karakterini temizle
        System.out.print("Renk: ");
        String color = scanner.nextLine();

        products.add(new CellPhone(id, price, discount, stock, name, brand, memory, screenSize, battery, ram, color));
    }

    private static void deleteProduct(String productType) {
        System.out.print("Silmek istediğiniz ürünün ID'sini girin: ");
        int id = scanner.nextInt();
        products.removeIf(product -> product.getId() == id && product.getClass().getSimpleName().equals(productType));
    }

    private static Brand getBrandByName(String name) {
        for (Brand brand : brands) {
            if (brand.getName().equalsIgnoreCase(name)) {
                return brand;
            }
        }
        return null;
    }
}

