package _3_ReflectApi;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;

public class App
    {
        public static void main(String[] args) throws ClassNotFoundException
        {
            // 클래스타입을 통해 클레스 인스턴스 데이터를 가져오는 방법
            Class<Book> bookClass = Book.class;
            
            // 클래스 인스턴스에 접근한 클래스의 Field를 출력함 [getFields()는 public접근 제어자 밖에 접근하지 못함]
            Arrays.stream(bookClass.getFields()).forEach(System.out::println);

            // Declared는 클래스 인스턴스에 접근한 클래스의 모든 Field를 출력함
            Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);

            // 객체 생성을 통해 클레스 인스턴스 데이터 값을 가져오는 방법 [데이터를 가져올때는 인스턴스를 만들어서 가져오는 법이 편리함]
            Book book = new Book();



                Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
                    try
                        {
                            f.setAccessible(true);
                            System.out.printf("%s %s\n",f,f.get(book));
                           //     f.get(book);
                        }
                    catch (IllegalAccessException e)
                        {
                            e.printStackTrace();
                        }
                });



            Class<? extends Book> aClass = book.getClass();
            
            //파일 경로를 통해 클레스 인스턴스 데이터를  데이터를 가져오는 방법
            Class<?> aClass1 = Class.forName("_3_ReflectApi.Book");
        }
    }
