import java.util.ArrayList;

public class BookManageView {
    public void viewPrintAll(ArrayList<BookDTO> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println((i + 1) + ". ISBN : " + arrayList.get(i).isbn + ", 도서명 : " + arrayList.get(i).bookName + ", 저자명 : " + arrayList.get(i).author + ", 출판사 : " + arrayList.get(i).publish + ", 가격 : " + arrayList.get(i).price);
        }
    }

    public void viewPrint(ArrayList<BookDTO> arrayList, int num) {
        System.out.println((num) + ". ISBN : " + arrayList.get(num - 1).isbn + ", 도서명 : " + arrayList.get(num - 1).bookName + ", 저자명 : " + arrayList.get(num - 1).author + ", 출판사 : " + arrayList.get(num - 1).publish + ", 가격 : " + arrayList.get(num - 1).price);
    }
}