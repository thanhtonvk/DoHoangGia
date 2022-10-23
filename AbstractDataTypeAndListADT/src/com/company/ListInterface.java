package com.company;

public interface ListInterface<T> extends Iterable<T> {
    void add(T data);  //Thêm phần tử vào danh sách

    T get(int i);      //Lấy giá trị phần tử thứ i

    void set(int i, T data);  //Đặt data vào vị trí i của danh sách

    void remove(T data);    //Loại phần tử data khỏi danh sách

    boolean isContain(T data); //Kiểm tra phần tử data có trong danh sách

    int size();             //Kích thước danh sách

    boolean isEmpty();      //Danh sách có rỗng hay không
}
