import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        BookDTO DTO = new BookDTO();
        BookManageController Controller = new BookManageController();
        BookManageView View = new BookManageView();
        boolean loop = true;

        while(loop) {
            System.out.println("=== 도서관리시스템 ===");
            System.out.println("Menu : 1. 도서정보추가, 2. 조회, 3. 수정, 4. 삭제, 5. 출력");
            System.out.print("Menu를 입력하세요. (0번 ~ 5번) : ");
            int num = s2.nextInt();
            String code ="";
            int number = 0;

            switch(num) {
                case 0:
                    loop = false;
                    break;
                case 1:
                    System.out.println("새도서 정보 입력 : ");
                    System.out.print("isbn : ");
                    String isbn = s1.nextLine();
                    System.out.print("도서명 : ");
                    String bookName = s1.nextLine();
                    System.out.print("저자명 : ");
                    String author = s1.nextLine();
                    System.out.print("출판사 : ");
                    String publish = s1.nextLine();
                    System.out.print("가격 : ");
                    int price = s2.nextInt();
                    BookDTO book = Controller.addBook(isbn, bookName, author, publish, price);
                    DTO.books.add(book);
                    View.viewPrintAll(DTO.books);
                    break;
                case 2:
                    View.viewPrintAll(DTO.books);
                    break;
                case 3:
                    View.viewPrintAll(DTO.books);
                    System.out.print("수정할 책 입력 : ");
                    int num1 = s2.nextInt();
                    if (num1 < 1 || num1 > DTO.books.size()) {
                        System.out.println("책 번호를 잘못 입력하셨습니다.");
                    }
                    else {
                        System.out.println("1. isbn");
                        System.out.println("2. 도서명");
                        System.out.println("3. 저자명");
                        System.out.println("4. 출판사");
                        System.out.println("5. 가격");
                        System.out.print("수정할 곳 입력 (0번 ~ 5번) : ");
                        int num2 = s2.nextInt();
                        if(num2 == 0) {
                            System.out.println("수정을 취소합니다.");
                        }
                        else if (num2 == 1) {
                            System.out.print("isbn : ");
                            code = s1.nextLine();
                        }
                        else if (num2 == 2) {
                            System.out.print("도서명 : ");
                            code = s1.nextLine();
                        }
                        else if (num2 == 3) {
                            System.out.print("저자명 : ");
                            code = s1.nextLine();
                        }
                        else if (num2 == 4) {
                            System.out.print("출판사 : ");
                            code = s1.nextLine();
                        }
                        else if (num2 == 5) {
                            System.out.print("가격 : ");
                            number = s2.nextInt();
                        }
                        else {
                            System.out.println("수정할 곳을 잘못 입력했습니다.");
                        }

                        Controller.correctBook(DTO.books, num1, num2, code, number);
                        View.viewPrint(DTO.books, num1);
                    }
                    break;
                case 4:
                    View.viewPrintAll(DTO.books);
                    System.out.print("삭제할 책 입력 : ");
                    number = s2.nextInt();
                    if (number == 0) {
                        System.out.println("삭제를 취소합니다.");
                    }
                    else if (number < 0 || number > DTO.books.size()) {
                        System.out.println("책 번호를 잘못 입력하셨습니다.");
                    }
                    else {
                        Controller.removeBook(DTO.books, number);
                    }
                    break;
                case 5:
                    View.viewPrintAll(DTO.books);
                    System.out.print("출력할 책 입력 : ");
                    number = s2.nextInt();
                    if (number == 0) {
                        System.out.println("출력을 취소합니다.");
                    }
                    else if (number < 0 || number > DTO.books.size()) {
                        System.out.println("책 번호를 잘못 입력하셨습니다.");
                    }
                    else {
                        View.viewPrint(DTO.books, number);
                    }
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }
    }
}