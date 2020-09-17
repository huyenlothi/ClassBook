import java.util.ArrayList;
import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] book1 = new Book[10];
        book1[0]= new ProgrammingBook("1a","sach1",12000, "abc","Java","babs");
        book1[1]= new ProgrammingBook("2a","sach2",17000, "abfc","Java Script","babs");
        book1[2]= new ProgrammingBook("3a","sach3",14000, "abdc","Java","babs");
        book1[3]= new ProgrammingBook("4a","sach4",19000, "abfc","php","babs");
        book1[4]= new ProgrammingBook("5a","sach5",16000, "abxc","Java","babs");
        book1[5]= new FictionBook("1b","quyen1",20000,"hgwiu","uytiu");
        book1[6]= new FictionBook("2b","quyen2",29000,"hgwiu","uyfiuttiu");
        book1[7]= new FictionBook("3b","quyen3",22000,"hgwruiu","uytiu");
        book1[8]= new FictionBook("4b","quyen4",30000,"hgwiu","uytfkiu");
        book1[9]= new FictionBook("5b","quyen5",24000,"hgwiuguyoi","uytiu");



//        for (int i = 0; i < 5; i++) {
//            System.out.println("nhap thong tin cuon sach thu "+ (i+1));
//            System.out.println("nhap bookCode:");
//            String bookcode = scanner.nextLine();
//            System.out.println("nhap ten:");
//            String name = scanner.nextLine();
//            System.out.println("nhap gia sach:");
//            int price = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("nhap tac gia:");
//            String author = scanner.nextLine();
//            System.out.println("nhap ngon ngu:");
//            String language = scanner.nextLine();
//            System.out.println("nhap framework:");
//            String framework = scanner.nextLine();
//            book1[i] = new ProgrammingBook(bookcode,name,price,author,language,framework);
//        }
        

//        for (int i = 0; i < 5; i++) {
//            System.out.println("nhap thong tin cuon sach thu "+ (i+1));
//            System.out.println("nhap bookCode:");
//            String bookcode = scanner.nextLine();
//            System.out.println("nhap ten:");
//            String name = scanner.nextLine();
//            System.out.println("nhap gia sach:");
//            int price = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("nhap tac gia:");
//            String author = scanner.nextLine();
//            System.out.println("nhap category:");
//            String category = scanner.nextLine();
//
//            book1[i+5] = new FictionBook(bookcode,name,price,author,category);
//        }

//        int sum =0;
//        for (int i = 0; i < book1.length; i++) {
//                sum +=  book1[i].getPrice();
//        }
//        System.out.println(" tong tien 10 cuon sach la:" + sum);
//
//        int count =0;
//        for (int i = 0; i < book1.length; i++) {
//            if(book1[i] instanceof ProgrammingBook) {
//                String language1 = ((ProgrammingBook) book1[i]).getLanguage();
//                if(language1.equals("Java")){
//                    count++;
//                }
//            }
//
//        }
//        System.out.println("so cuon sach ProgrammingBook co language la Java la: "+ count);
// //tim gia
//        System.out.println("nhap ten sach ban muon tim ");
//        String timsach = scanner.nextLine();
//        for (int i = 0; i < book1.length; i++) {
//            String ten = book1[i].getName();
//            if(ten.equals(timsach)){
//                System.out.println("gia cua cuon sach "+ timsach + " la: "+ book1[i].getPrice());
//            }
//        }

// //sap xep theo gia sp tu max -> min theo giai thuat chon

        for (int i = 0; i < book1.length; i++) {
            for (int j = 1; j < book1.length; j++) {
                Book tempt ;
                if(book1[i].getPrice()<book1[j].getPrice()){
                    tempt= book1[i];
                    book1[i] = book1[j];
                    book1[j] = tempt;
                }
            }
        }

// sap xep theo gt chen
        for (int i = 1; i < book1.length; i++) {
            Book temp = book1[i];
            int j= i-1;
            while ((j)>=0 && temp.getPrice() > book1[j].getPrice()){
                book1[i] = book1[j];
                j--;
            }
            book1[i]= temp;
        }
        // sap xep theo giai thuat noi bot
        for (int i = 0; i < book1.length-1; i++) {
            for (int j = book1.length-1; j > i; j--) {
                if( book1[j].getPrice() > book1[j-1].getPrice()){
                    Book temp = book1[j-1];
                    book1[j-1]=book1[j];
                    book1[j]= temp;
                }
            }
        }
       // tim kiem gia theo tim kiem nhi phan
        System.out.println("nhap gia sach ban muon mua");
        int gia= scanner.nextInt();



    }

}
        
        






