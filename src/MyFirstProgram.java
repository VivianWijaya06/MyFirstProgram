import java.util.Random;
import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        String name;
        String version;
        String userName;
        String userDir;
        int choice;
        
        String[] funFacts = { 
            "Java was first released by Sun Microsystems in 1995",
            "The language was initially called Oak but was later renamed Java",
            "James Gosling, Mike Sheridan, and Patrick Naughton are credited with creating Java",
            "Java was designed to be platform-independent, allowing programs to run on any system with a Java Virtual Machine (JVM) installed",
            "Java is based on the C and C++ programming languages",
            "Java was originally developed for set-top boxes and other consumer electronics devices",
            "Java is now used for a wide range of applications, including web development, mobile app development, and enterprise software",
            "Java is used by over 9 million developers worldwide",
            "Java is one of the most popular programming languages in the world, according to various indices",
            "Java is an object-oriented programming language",
            "Java code is compiled into bytecode, which is executed by the JVM",
            "Java is known for its performance, stability, and security",
            "Java has a garbage collector that automatically frees up memory that is no longer in use",
            "Java has a vast standard library that provides a wide range of functionality out of the box",
            "Java supports multiple threads of execution, making it ideal for developing concurrent applications",
            "Java has a large and active community of developers who contribute to open-source projects and libraries",
            "Java is used to develop Android apps",
            "Java is used to develop enterprise applications, such as customer relationship management (CRM) software",
            "Java is used to develop scientific and engineering applications, such as simulations and modeling",
            "Java is used to develop games, including Minecraft",
            "Java is used by financial institutions to develop trading platforms and other applications",
            "Java is used to develop internet of things (IoT) applications",
            "Java is used to develop machine learning and artificial intelligence (AI) applications",
            "Java is used by the Apache Software Foundation to develop open-source software",
            "Java is used to develop web applications, including server-side applications and client-side applications",
            "Java supports a variety of programming paradigms, including imperative, functional, and reactive programming",
            "Java is a case-sensitive language",
            "Java supports operator overloading",
            "Java has a wide range of data types, including primitive types, object types, and arrays",
            "Java supports inheritance, encapsulation, and polymorphism",
            "Java has a powerful exception handling mechanism that allows developers to handle errors gracefully",
            "Java supports generic programming",
            "Java has a powerful reflection API that allows programs to examine and modify the behavior of objects at runtime",
            "Java has a built-in unit testing framework, JUnit",
            "Java has a rich set of tools for debugging, profiling, and analyzing code",
            "Java is constantly evolving, with new versions and updates being released on a regular basis to keep up with the latest trends and technologies",
        };

        // Pada bagian dibawah ini digunakan untuk menprint kata pembuka atau sambutan ketika
        // program akan dimulai
        System.out.println("\u001b[38;5;147m" + "╔══════════════════════════════╗" + "\u001b[0m"); 
        System.out.println("\u001b[38;5;218m" + "   Welcome to Java Land (^_^)!" + "\u001b[0m");
        System.out.println("\u001b[38;5;147m" + "╚══════════════════════════════╝" + "\u001b[0m");

        // Pada bagian dibawah ini digunakan untuk meminta user menginput namanya sehingga dibutuhkan
        // scanner dimana scanner digunakan untuk menangani pembacaan data dari papan ketik
        Scanner scanner = new Scanner(System.in);
        System.out.print("\u001b[38;5;151m" + "Please input your name: ");
        name = scanner.nextLine();
        System.out.println("\u001b[0m");

        // dengan menggunakan "\u001b[2J" maka layar bagian sebelumnya akan terhapus menjadi bersih 
        // Pada bagian dibawah ini digunakan untuk menprint kata sapaan beserta nama yang telah diinput
        System.out.println("\u001b[2J");  
        System.out.println("\u001b[48;5;159m" + "Hello, " + name + ". WELCOME TO JAVA!!!!\u001b[0m\n");

        // Pada bagian di bawah ini ditujukan agar user dapat menginput apa yang ingin mereka ketahui
        // Jadi dilakukan lah looping jadi selama user belum memilih pilihan exit maka program akan terus berjalan
        while (true) {
            System.out.println("\u001b[38;5;147m" + "=== What would you like to see: ===" + "\u001b[0m");
            System.out.println("1. Three Java Fun Facts");
            System.out.println("2. Your user Name");
            System.out.println("3. Your user Dir");
            System.out.println("4. Your Java Version");
            System.out.println("5. All of them");
            System.out.println("0. Exit");
            System.out.print("\u001b[38;5;147m" + "Choose (1/2/3/4/5/0): ");
            choice = scanner.nextInt();
            System.out.println("\u001b[0m");

            // Pada bagian ini digunakan untuk menampilkan fakta-fakta mengenai java
            // Jadi fakta mengenai java akan terprint 3 macam fakta secara random
            if (choice == 1) {
                System.out.println("\u001b[2J"); 
                System.out.println("\u001b[38;5;221m" + "Java Fun Facts ->->->-> \u001b[0m");
                Random random = new Random();
                for (int i = 0; i < 3; i++) {
                    int randomIndex = random.nextInt(funFacts.length);
                    System.out.print("\u001b[38;5;183m");
                    System.out.println("-> Did you know that " + funFacts[randomIndex] + " ?");
                    System.out.println("\u001b[0m");
                }
            
            // Pada bagian ini digunakan untuk menampilkan user name dari user
            } else if (choice == 2) {
                System.out.println("\u001b[2J"); 
                System.out.println("\u001b[38;5;151m");
                userName = System.getProperty("user.name");
                System.out.println("User Name          = " + userName);
                System.out.println("\u001b[0m");
                
            // Pada bagian ini digunakan untuk menampilkan userdir dari user
            } else if (choice == 3) {
                System.out.println("\u001b[2J"); 
                System.out.println("\u001b[38;5;151m");
                userDir = System.getProperty("user.dir");
                System.out.println("User Dir           = " + userDir); 
                System.out.println("\u001b[0m");

            // Pada bagian ini digunakan untuk menampilkan java version dari user
            } else if (choice == 4) {
                System.out.println("\u001b[2J"); 
                System.out.println("\u001b[38;5;151m");
                version = System.getProperty("java.version");
                System.out.println("Your Java Version  = " + version);
                System.out.println("\u001b[0m");

            // Bagian ini akan menampilkan semuanya seperti fakta java, username, userdir dan versi java secara bersamaan
            } else if (choice == 5) {
                System.out.println("\u001b[2J"); 
                System.out.println("\u001b[38;5;221m" + "Java Fun Facts ->->->-> \u001b[0m");
                Random random = new Random();
                for (int i = 0; i < 3; i++) {
                    int randomIndex = random.nextInt(funFacts.length);
                    System.out.print("\u001b[38;5;183m");
                    System.out.println("-> Did you know that " + funFacts[randomIndex] + " ?");
                    System.out.print("\u001b[0m");
                }
                System.out.println("\u001b[38;5;151m");
                userName = System.getProperty("user.name");
                System.out.println("User Name          = " + userName);
                userDir = System.getProperty("user.dir");
                System.out.println("User Dir           = " + userDir);
                version = System.getProperty("java.version");
                System.out.println("Your Java Version  = " + version);
                System.out.println("\u001b[0m");

            // pada bagian ini digunakan ketika user memilih pilihan 0 maka program akan langsung berhenti berjalan
            // dan jika user menginput angka selain yang tersedia, program juga akan langsung berhenti berjalan
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Invalid choice. Exiting...");
                break;
            }
        }

        // Pada bagian ini digunakan untuk menampilkan kata selamat tinggal/ kata penutup setelah program berhenti
        System.out.println("\u001b[2J"); 
        System.out.println("\u001b[38;5;147m" + "╔═══════════════════════╗" + "\u001b[0m"); 
        System.out.println("\u001b[38;5;218m" + "   Good bye " + name + " (^_^)!" + "\u001b[0m");
        System.out.println("\u001b[38;5;147m" + "╚═══════════════════════╝" + "\u001b[0m");

        // Digunakan untuk menghentikan scanner supaya tidak terlalu banyak memori yang digunakan 
        scanner.close();
    }
}