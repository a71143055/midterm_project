import java.util.ArrayList;

public class BookManageController {
    public BookDTO addBook(String isbn, String bookName, String author, String publish, int price) {
        BookDTO DTO = new BookDTO();
        DTO.isbn = isbn;
        DTO.bookName = bookName;
        DTO.author = author;
        DTO.publish = publish;
        DTO.price = price;

        return DTO;
    }

    public void correctBook(ArrayList<BookDTO> arrayList, int num1, int num2, String str, int num) {
        switch(num2) {
            case 0:
                break;
            case 1:
                arrayList.get(num1 - 1).isbn = str;
                break;
            case 2:
                arrayList.get(num1 - 1).bookName = str;
                break;
            case 3:
                arrayList.get(num1 - 1).author = str;
                break;
            case 4:
                arrayList.get(num1 - 1).publish = str;
                break;
            case 5:
                arrayList.get(num1 - 1).price = num;
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }
    }

    public void removeBook(ArrayList<BookDTO> arrayList, int num) {
        arrayList.remove(num - 1);
    }
}