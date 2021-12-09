package _1_JVM;

public class classLoderEx_1_3
    {
        public static void main(String[] args)
            {
                ClassLoader classLoader = classLoderEx_1_3.class.getClassLoader();

                // classLoader와 classLoader의 부모클래스를 확인 할 수 있다.
                System.out.println(classLoader);
                System.out.println(classLoader.getParent());

                // 하지만 classLoader.getParent().getParent()의 최상위 Bootstrap 부모클래스가 있지만 native code로 구현되어 있기 때문에 출력을 할수가 없다.
                System.out.println(classLoader.getParent().getParent());

                // classNotFoundException은 classLoder시스템의 로딩에서 의존성을 추가하지 않거나 못찾는 다른 이유로 발생하는 오류이다.
            }
    }
